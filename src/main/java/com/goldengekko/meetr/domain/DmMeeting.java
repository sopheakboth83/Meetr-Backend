/**
 *     Copyright 2012, 2013 Golden Gekko
 *
 *     This file is part of Meetr.
 *
 *     Meetr is free software: you can use it, modify it and / or
 *     redistribute it as is or with your changes under the terms of the
 *     GNU General Public License as published by the Free Software
 *     Foundation, either version 3 of the License, or (at your option)
 *     any later version.
 *
 *     Meetr is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Meetr.  If not, see <http://www.gnu.org/licenses />.
 */
package com.goldengekko.meetr.domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;

import com.google.appengine.api.datastore.GeoPt;
import net.sf.mardao.core.GeoLocation;
import net.sf.mardao.core.domain.AbstractLongEntity;
import net.sf.mardao.core.geo.DLocation;

/**
 * 
 * @author sosandstrom
 */
@Entity
public class DmMeeting extends AbstractLongEntity {

    // Meeting details

    /** Meeting title */
    @Basic
    private String title;

    /** Meeting type can be PHONE_CALL, VISIT, BAKERY, OTHER
     * Not used by Meetr */
    @Basic
    private Long meetingType;

    /** The registered organizer of this meeting */
    @Basic
    private String organizerId;

    /** The name of the company this meeting relates to */
    @Basic
    private String companyName;

    /** Reference to company entity */
    @Basic
    private String companyId;

    /** A reference to the store where this visit took place
     * Not used by Meetr, replaced by companyId*/
    @Basic
    private Long locationId;

    /** The external attendees for this meeting */
    @Basic
    private Collection<String> attendeeNames;

    /** Reference to attendee entities. */
    @Basic
    private Collection<String> attendeeIds;

    /** Date and time this meeting will start */
    @Basic
    private Date startDate;

    /** Date and time this meeting will end */
    @Basic
    private Date endDate;

    /** repeat mode can be NONE, DAILY, WORKING_DAYS, WEEKLY, BI-WEEKLY, MONTHLY, YEARLY
     * Not used by Meetr */
    @Basic
    private Integer repeatMode;

    /** Date and time this meeting is started
     * Not used by Meetr */
    @Basic
    private Date actualStartDate;

    /** Date and time this meeting is ended
     * Not used by Meetr */
    @Basic
    private Date actualEndDate;

    /** Meeting actual duration in milliseconds
     * - this cannot indicate actual start/end datetime as user may pause the meeting.
     * Not used by Meetr */
    @Basic
    private Long actualDuration;

    /** How many minutes from the meeting should the alarm go off */
    @Basic
    private Integer alertOffsetInMinutes;

    /** Customers phone number */
    @Basic
    private String phoneNumber;

    /** The address where the meeting tak place, often the company address */
    @Basic
    private String address;

    /** The geographical point of the meeting in latitude and longitude */
    @Basic
    @GeoLocation
    private DLocation meetingLocation;

    /** Meeting details notes */
    @Basic
    private String detailsNotes;

    /** Meeting image URL
     * Not used by Meetr */
    @Basic
    private String imageUrl;


    // Agenda items

    /** Reference to the agenda item entities. */
    @Basic
    private Collection<String> agendaItemIds;


    // Documents and files

    /** Files related to this meeting. */
    @Basic
    private Collection<String> fileNames;

    /** Files related to this meeting. */
    @Basic
    private Collection<String> fileIds;


    // Notes (from the meeting)

    /** Meeting notes */
    @Basic
    private String notes;


    // Follow up

    /** The date then the last followup email were sent */
    @Basic
    private Date followUpLastSentDate;

    /** Notes included in the followup email */
    @Basic
    private String followUpNotes;

    /** Did the follow up email include the agenda points */
    @Basic
    private Boolean followUpIncludeAgenda;

    /** References to files included in sent follow up emails */
    @Basic
    private Collection<String> followUpFileIds;


    // Getter and setters

    public Long getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(Long actualDuration) {
        this.actualDuration = actualDuration;
    }

    public Date getActualEndDate() {
        return actualEndDate;
    }

    public void setActualEndDate(Date actualEndDate) {
        this.actualEndDate = actualEndDate;
    }

    public Date getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(Date actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Collection<String> getAgendaItemIds() {
        return agendaItemIds;
    }

    public void setAgendaItemIds(Collection<String> agendaItemIds) {
        this.agendaItemIds = agendaItemIds;
    }

    public Integer getAlertOffsetInMinutes() {
        return alertOffsetInMinutes;
    }

    public void setAlertOffsetInMinutes(Integer alertOffsetInMinutes) {
        this.alertOffsetInMinutes = alertOffsetInMinutes;
    }

    public Collection<String> getAttendeeIds() {
        return attendeeIds;
    }

    public void setAttendeeIds(Collection<String> attendeeIds) {
        this.attendeeIds = attendeeIds;
    }

    public Collection<String> getAttendeeNames() {
        return attendeeNames;
    }

    public void setAttendeeNames(Collection<String> attendeeNames) {
        this.attendeeNames = attendeeNames;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDetailsNotes() {
        return detailsNotes;
    }

    public void setDetailsNotes(String detailsNotes) {
        this.detailsNotes = detailsNotes;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Collection<String> getFileIds() {
        return fileIds;
    }

    public void setFileIds(Collection<String> fileIds) {
        this.fileIds = fileIds;
    }

    public Collection<String> getFileNames() {
        return fileNames;
    }

    public void setFileNames(Collection<String> fileNames) {
        this.fileNames = fileNames;
    }

    public Collection<String> getFollowUpFileIds() {
        return followUpFileIds;
    }

    public void setFollowUpFileIds(Collection<String> followUpFileIds) {
        this.followUpFileIds = followUpFileIds;
    }

    public Boolean getFollowUpIncludeAgenda() {
        return followUpIncludeAgenda;
    }

    public void setFollowUpIncludeAgenda(Boolean followUpIncludeAgenda) {
        this.followUpIncludeAgenda = followUpIncludeAgenda;
    }

    public Date getFollowUpLastSentDate() {
        return followUpLastSentDate;
    }

    public void setFollowUpLastSentDate(Date followUpLastSentDate) {
        this.followUpLastSentDate = followUpLastSentDate;
    }

    public String getFollowUpNotes() {
        return followUpNotes;
    }

    public void setFollowUpNotes(String followUpNotes) {
        this.followUpNotes = followUpNotes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public DLocation getMeetingLocation() {
        return meetingLocation;
    }

    public void setMeetingLocation(DLocation meetingLocation) {
        this.meetingLocation = meetingLocation;
    }

    public Long getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(Long meetingType) {
        this.meetingType = meetingType;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(String organizerId) {
        this.organizerId = organizerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getRepeatMode() {
        return repeatMode;
    }

    public void setRepeatMode(Integer repeatMode) {
        this.repeatMode = repeatMode;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
