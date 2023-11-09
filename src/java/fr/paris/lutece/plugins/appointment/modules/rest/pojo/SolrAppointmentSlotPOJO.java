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

import com.fasterxml.jackson.annotation.JsonProperty;

public class SolrAppointmentSlotPOJO
{

    public static final String SOLR_FIELD_UID = "uid_form_string";
    public static final String SOLR_FIELD_DATE = "date";
    public static final String SOLR_FIELD_URL = "url";
    public static final String SOLR_FIELD_DAY_OPEN = "day_open_string";
    public static final String SOLR_FIELD_ENABLED = "enabled_string";
    public static final String SOLR_FIELD_APPOINTMENT_ACTIVE = "appointment_active_string";
    public static final String SOLR_FIELD_NB_CONSECUTIVES_SLOTS = "nb_consecutives_slots_long";
    public static final String SOLR_FIELD_MAX_CONSECUTIVES_SLOTS = "max_consecutives_slots_long";

    @JsonProperty( SOLR_FIELD_UID )
    String _strUidFormString;
    @JsonProperty( SOLR_FIELD_DATE )
    String _strDate;
    @JsonProperty( SOLR_FIELD_URL )
    String _strUrl;
    @JsonProperty( SOLR_FIELD_DAY_OPEN )
    String _strDayOpen;
    @JsonProperty( SOLR_FIELD_ENABLED )
    String _strEnabled;
    @JsonProperty( SOLR_FIELD_APPOINTMENT_ACTIVE )
    String _strAppointmentActive;
    @JsonProperty( SOLR_FIELD_NB_CONSECUTIVES_SLOTS )
    Long _lNbConsecutivesSlots;
    @JsonProperty( SOLR_FIELD_MAX_CONSECUTIVES_SLOTS )
    Long _lMaxConsecutivesSlots;

    private SolrAppointmentSlotPOJO( )
    {
    }

    public String getUidFormString( )
    {
        return _strUidFormString;
    }

    public void setUidFormString( String uidFormString )
    {
        _strUidFormString = uidFormString;
    }

    public String getDate( )
    {
        return _strDate;
    }

    public void setDate( String date )
    {
        _strDate = date;
    }

    public String getUrl( )
    {
        return _strUrl;
    }

    public void setUrl( String url )
    {
        _strUrl = url;
    }

    public String getDayOpen( )
    {
        return _strDayOpen;
    }

    public void setDayOpen( String strDayOpen )
    {
        this._strDayOpen = strDayOpen;
    }

    public String getEnabled( )
    {
        return _strEnabled;
    }

    public void setEnabled( String strEnabled )
    {
        this._strEnabled = strEnabled;
    }

    public String getAppointmentActive( )
    {
        return _strAppointmentActive;
    }

    public void setAppointmentActive( String strAppointmentActive )
    {
        this._strAppointmentActive = strAppointmentActive;
    }

    public Long getNbConsecutivesSlots( )
    {
        return _lNbConsecutivesSlots;
    }

    public void setNbConsecutivesSlots( Long lNbConsecutivesSlots )
    {
        this._lNbConsecutivesSlots = lNbConsecutivesSlots;
    }

    public Long getLMaxConsecutivesSlots( )
    {
        return _lMaxConsecutivesSlots;
    }

    public void setMaxConsecutivesSlots( Long lMaxConsecutivesSlots )
    {
        this._lMaxConsecutivesSlots = lMaxConsecutivesSlots;
    }
}
