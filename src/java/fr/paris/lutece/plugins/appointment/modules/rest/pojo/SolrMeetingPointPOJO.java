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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties( ignoreUnknown = true )
public class SolrMeetingPointPOJO
{
    public static final String SOLR_FIELD_UID = "uid";
    public static final String SOLR_FIELD_TITLE = "title";
    public static final String SOLR_FIELD_ADDRESS = "appointment_address_text";
    public static final String SOLR_FIELD_GEOLOC = "appointment_geoloc";
    public static final String SOLR_FIELD_TYPE = "type";
    public static final String SOLR_FIELD_TYPE_APPOINTMENT = "appointment";

    @JsonProperty( SOLR_FIELD_UID )
    String _strUid;
    @JsonProperty( SOLR_FIELD_TITLE )
    String _strTitle;
    @JsonProperty( SOLR_FIELD_ADDRESS )
    String _strAddressText;
    @JsonProperty( SOLR_FIELD_GEOLOC )
    String _strGeoloc;

    public String getUid( )
    {
        return _strUid;
    }

    public void setUid( String strUid )
    {
        this._strUid = strUid;
    }

    public String getTitle( )
    {
        return _strTitle;
    }

    public void setTitle( String strTitle )
    {
        this._strTitle = strTitle;
    }

    public String getAddressText( )
    {
        return _strAddressText;
    }

    public void setAddressText( String strAddressText )
    {
        this._strAddressText = strAddressText;
    }

    public String getGeoloc( )
    {
        return _strGeoloc;
    }

    public void setGeoloc( String strGeoloc )
    {
        this._strGeoloc = strGeoloc;
    }
}
