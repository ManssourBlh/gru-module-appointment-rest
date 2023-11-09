/*
 * Copyright (c) 2002-2023, City of Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.appointment.modules.rest.pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect( fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE )
public class MeetingPointPOJO
{

    public static final String DEFAULT_WEBSITE_URL_RDV = "https://teleservices.paris.fr/rdvtitres/jsp/site/Portal.jsp?page=appointmenttitresearch";

    @JsonProperty( "id" )
    private String _strId;
    @JsonProperty( "name" )
    private String _strName;
    @JsonProperty( "longitude" )
    private String _strLongitude;
    @JsonProperty( "latitude" )
    private String _strLatitude;
    @JsonProperty( "public_entry_address" )
    private String _strPublicAdress;
    @JsonProperty( "zip_code" )
    private String _strZipCode;
    @JsonProperty( "city_name" )
    private String _strCityName;
    @JsonProperty( "website" )
    private String _strWebsite;
    @JsonProperty( "city_logo" )
    private String _strCityLogo;

    public MeetingPointPOJO( )
    {
    }

    public MeetingPointPOJO( String strId, String strName, String strLongitude, String strLatitude, String strPublicAdress, String strZipCode,
            String strCityName, String strWebsite, String strCityLogo )
    {
        this._strId = strId;
        this._strName = strName;
        this._strLongitude = strLongitude;
        this._strLatitude = strLatitude;
        this._strPublicAdress = strPublicAdress;
        this._strZipCode = strZipCode;
        this._strCityName = strCityName;
        this._strWebsite = strWebsite;
        this._strCityLogo = strCityLogo;
    }

    public String getId( )
    {
        return _strId;
    }

    public void setId( String strId )
    {
        this._strId = strId;
    }

    public String getName( )
    {
        return _strName;
    }

    public void setName( String strName )
    {
        this._strName = strName;
    }

    public String getLongitude( )
    {
        return _strLongitude;
    }

    public void setLongitude( String strLongitude )
    {
        this._strLongitude = strLongitude;
    }

    public String getLatitude( )
    {
        return _strLatitude;
    }

    public void setLatitude( String strLatitude )
    {
        this._strLatitude = strLatitude;
    }

    public String getPublicAdress( )
    {
        return _strPublicAdress;
    }

    public void setPublicAdress( String strPublicAdress )
    {
        this._strPublicAdress = strPublicAdress;
    }

    public String getZipCode( )
    {
        return _strZipCode;
    }

    public void setZipCode( String strZipCode )
    {
        this._strZipCode = strZipCode;
    }

    public String getCityName( )
    {
        return _strCityName;
    }

    public void setCityName( String strCityName )
    {
        this._strCityName = strCityName;
    }

    public String getWebsite( )
    {
        return _strWebsite;
    }

    public void setWebsite( String strWebsite )
    {
        this._strWebsite = strWebsite;
    }

    public String getCityLogo( )
    {
        return _strCityLogo;
    }

    public void setCityLogo( String strCityLogo )
    {
        this._strCityLogo = strCityLogo;
    }
}
