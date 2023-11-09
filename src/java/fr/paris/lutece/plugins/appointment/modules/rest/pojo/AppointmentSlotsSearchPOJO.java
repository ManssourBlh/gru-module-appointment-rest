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

import java.time.LocalDate;
import java.util.List;

public class AppointmentSlotsSearchPOJO
{
    private List<String> _appointmentIds;
    private LocalDate _startDate;
    private LocalDate _endDate;
    private String _strReason;
    private Integer _nDocumentNumber;

    public AppointmentSlotsSearchPOJO( )
    {
    }

    public AppointmentSlotsSearchPOJO( List<String> appointmentIds, LocalDate startDate, LocalDate endDate )
    {
        this._appointmentIds = appointmentIds;
        this._startDate = startDate;
        this._endDate = endDate;
    }

    public AppointmentSlotsSearchPOJO( List<String> appointmentIds, LocalDate startDate, LocalDate endDate, String strReason, Integer nDocumentNumber )
    {
        this._appointmentIds = appointmentIds;
        this._startDate = startDate;
        this._endDate = endDate;
        this._strReason = strReason;
        this._nDocumentNumber = nDocumentNumber;
    }

    public List<String> getAppointmentIds( )
    {
        return _appointmentIds;
    }

    public void setAppointmentIds( List<String> appointmentIds )
    {
        this._appointmentIds = appointmentIds;
    }

    public LocalDate getStartDate( )
    {
        return _startDate;
    }

    public void setStartDate( LocalDate startDate )
    {
        this._startDate = startDate;
    }

    public LocalDate getEndDate( )
    {
        return _endDate;
    }

    public void setEndDate( LocalDate endDate )
    {
        this._endDate = endDate;
    }

    public String getReason( )
    {
        return _strReason;
    }

    public void setReason( String reason )
    {
        this._strReason = reason;
    }

    public Integer getDocumentNumber( )
    {
        return _nDocumentNumber;
    }

    public void setDocumentNumber( Integer documentNumber )
    {
        this._nDocumentNumber = documentNumber;
    }
}
