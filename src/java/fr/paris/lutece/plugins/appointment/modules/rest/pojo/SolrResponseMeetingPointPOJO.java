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
import java.util.List;

@JsonIgnoreProperties( ignoreUnknown = true )
public class SolrResponseMeetingPointPOJO
{

    @JsonProperty( "grouped" )
    private Grouped _grouped;

    public Grouped getGrouped( )
    {
        return _grouped;
    }

    public void setGrouped( Grouped grouped )
    {
        this._grouped = grouped;
    }

    @JsonIgnoreProperties( ignoreUnknown = true )
    public static class Grouped
    {

        @JsonProperty( "uid" )
        private GroupedByUidForm _groupedByUidForm;

        public GroupedByUidForm getGroupedByUidForm( )
        {
            return _groupedByUidForm;
        }

        public void setGroupedByUidForm( GroupedByUidForm groupedByUidForm )
        {
            this._groupedByUidForm = groupedByUidForm;
        }
    }

    @JsonIgnoreProperties( ignoreUnknown = true )
    public static class GroupedByUidForm
    {

        @JsonProperty( "groups" )
        private List<Group> _groups;

        public List<Group> getGroups( )
        {
            return _groups;
        }

        public void setGroups( List<Group> groups )
        {
            this._groups = groups;
        }

    }

    @JsonIgnoreProperties( ignoreUnknown = true )
    public static class Group
    {

        @JsonProperty( "groupValue" )
        private String _groupValue;
        @JsonProperty( "doclist" )
        private DocList _docList;

        public String getGroupValue( )
        {
            return _groupValue;
        }

        public void setGroupValue( String groupValue )
        {
            this._groupValue = groupValue;
        }

        public DocList getDocList( )
        {
            return _docList;
        }

        public void setDocList( DocList docList )
        {
            this._docList = docList;
        }

    }

    @JsonIgnoreProperties( ignoreUnknown = true )
    public static class DocList
    {

        @JsonProperty( "docs" )
        private List<SolrMeetingPointPOJO> _docs;

        public List<SolrMeetingPointPOJO> getDocs( )
        {
            return _docs;
        }

        public void setDocs( List<SolrMeetingPointPOJO> docs )
        {
            this._docs = docs;
        }
    }
}
