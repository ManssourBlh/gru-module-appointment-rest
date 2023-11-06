package fr.paris.lutece.plugins.appointment.modules.rest.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.paris.lutece.plugins.appointment.modules.rest.business.providers.IAppointmentDataProvider;
import fr.paris.lutece.plugins.appointment.modules.rest.business.providers.SolrProvider;
import fr.paris.lutece.plugins.appointment.modules.rest.pojo.AppointmentSlotsSearchPOJO;
import fr.paris.lutece.plugins.appointment.modules.rest.pojo.InfoSlot;
import fr.paris.lutece.plugins.appointment.modules.rest.pojo.SolrAppointmentSlotPOJO;
import fr.paris.lutece.plugins.appointment.modules.rest.util.contsants.AppointmentRestConstants;
import fr.paris.lutece.portal.service.util.AppLogService;
import fr.paris.lutece.portal.service.util.AppPropertiesService;
import fr.paris.lutece.util.httpaccess.HttpAccessException;
import fr.paris.lutece.util.url.UrlItem;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.net.URLEncodedUtils;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AppointmentSlotsService {

    public static final String LUTECE_BASE_URL = "appointment-rest.lutece.base.url";

    private static IAppointmentDataProvider _dataProvider;
    private static AppointmentSlotsService _instance;
    private static String _baseUrl;

    public AppointmentSlotsService() {
    }

    public static synchronized AppointmentSlotsService getInstance( )
    {
        if ( _instance == null )
        {
            _instance = new AppointmentSlotsService( );
            _instance.init( );
        }
        _baseUrl = AppPropertiesService.getProperty(LUTECE_BASE_URL);

        return _instance;
    }

    private synchronized void init( )
    {
        if ( _dataProvider == null )
        {
            _dataProvider = SolrProvider.getInstance();
            AppLogService.info( "DatatProvider loaded : " + _dataProvider.getName( ) );
        }
    }

    public Map<String, List<InfoSlot>> getAvailableTimeSlotsAsList(AppointmentSlotsSearchPOJO search) throws HttpAccessException, JsonProcessingException {
        String response =  _dataProvider.getAvailableTimeSlot( search.getAppointmentIds(), search.getStartDate(), search.getEndDate(), search.getDocumentNumber() );

        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<SolrAppointmentSlotPOJO>> typeReference = new TypeReference<List<SolrAppointmentSlotPOJO>>() {};
        List<SolrAppointmentSlotPOJO> solrResponse = mapper.readValue(response, typeReference);

        return solrResponse.stream().collect(
                Collectors.groupingBy(
                        SolrAppointmentSlotPOJO::getUidFormString,
                        Collectors.mapping(
                                a -> new InfoSlot(buildDate(a.getUrl()), buildUrl(a.getUrl(), search.getDocumentNumber())),
                                Collectors.toList())
                )
        );
    }

    private static LocalDateTime buildDate(String strUrl) {
        return LocalDateTime.parse(getParamFromUrl(strUrl).get(AppointmentRestConstants.PARAMETER_STARTING_DATE), AppointmentRestConstants.SOLR_RESPONSE_DATE_FORMATTER);
    }

    public String buildUrl(String strUrl, Integer nbPlaceToTake) {
        Map<String, String> mapParamaters = getParamFromUrl(strUrl);

        UrlItem url = new UrlItem( _baseUrl /*+ AppointmentRestConstants.XPAGE_APPOINTMENT_ANTS */);
        url.addParameter( AppointmentRestConstants.PARAMETER_VIEW, AppointmentRestConstants.VIEW_APPOINTMENT_ANTS );
        url.addParameter( AppointmentRestConstants.PARAMETER_ID_FORM, mapParamaters.get(AppointmentRestConstants.PARAMETER_ID_FORM) );
        url.addParameter( AppointmentRestConstants.PARAMETER_STARTING_DATE, mapParamaters.get(AppointmentRestConstants.PARAMETER_STARTING_DATE) );
        url.addParameter( AppointmentRestConstants.PARAMETER_NB_PLACES_TO_TAKE, nbPlaceToTake );
        return url.getUrl( );
    }

    private static Map<String, String> getParamFromUrl(String strUrl) {
        List<NameValuePair> params;
        try {

            params = URLEncodedUtils.parse(new URI(strUrl), StandardCharsets.UTF_8);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        return params.stream().collect(
                Collectors.toMap(NameValuePair::getName, NameValuePair::getValue));
    }

}
