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
package com.goldengekko.meetr.web;

import com.goldengekko.meetr.domain.DmMeeting;
import com.goldengekko.meetr.json.JMeeting;
import com.google.appengine.api.datastore.GeoPt;
import com.wadpam.open.mvc.CrudController;
import com.wadpam.open.mvc.CrudService;
import net.sf.mardao.core.geo.DLocation;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sosandstrom
 */
@RequestMapping("{domain}/meeting")
public class MeetingController extends CrudController<JMeeting, DmMeeting, Long, CrudService<DmMeeting, Long>> {

    public MeetingController() {
        super(JMeeting.class);
    }

    @Override
    public void convertDomain(DmMeeting from, JMeeting to) {
        convertLongEntity(from, to);

        // Meeting details
        to.setTitle(from.getTitle());
        to.setMeetingType(from.getMeetingType());
        to.setOrganizerId(from.getOrganizerId());
        to.setCompanyName(from.getCompanyName());
        to.setCompanyId(from.getCompanyId());
        to.setLocationId((from.getLocationId()));
        to.setAttendeeNames(from.getAttendeeNames());
        to.setAttendeeIds(from.getAttendeeIds());
        to.setStartDate(toLong(from.getStartDate()));
        to.setEndDate(toLong(from.getEndDate()));
        to.setRepeatMode(from.getRepeatMode());
        to.setActualStartDate(toLong(from.getActualStartDate()));
        to.setActualEndDate(toLong(from.getActualEndDate()));
        to.setActualDuration(from.getActualDuration());
        to.setAlertOffsetInMinutes(from.getAlertOffsetInMinutes());
        to.setPhoneNumber(from.getPhoneNumber());
        to.setAddress(from.getAddress());
        if (null != from.getMeetingLocation()) {
            to.setLatitude(from.getMeetingLocation().getLatitude());
            to.setLongitude(from.getMeetingLocation().getLongitude());
        }
        to.setDetailsNotes(from.getDetailsNotes());
        to.setImageUrl(from.getImageUrl());

        // Agenda items
        to.setAgendaItemIds(from.getAgendaItemIds());

        // Documents and files
        to.setFileNames(from.getFileNames());
        to.setFileIds(from.getFileIds());

        // Notes
        to.setNotes(from.getNotes());

        // Follow up
        to.setFollowUpLastSentDate(toLong(from.getFollowUpLastSentDate()));
        to.setFollowUpNotes(from.getFollowUpNotes());
        to.setFollowUpIncludeAgenda(from.getFollowUpIncludeAgenda());
        to.setFollowUpFileIds(from.getFollowUpFileIds());
    }

    @Override
    public void convertJson(JMeeting from, DmMeeting to) {
        convertJLong(from, to);

        // Meeting details
        to.setTitle(from.getTitle());
        to.setMeetingType(from.getMeetingType());
        to.setOrganizerId(from.getOrganizerId());
        to.setCompanyName(from.getCompanyName());
        to.setCompanyId(from.getCompanyId());
        to.setLocationId((from.getLocationId()));
        to.setAttendeeNames(from.getAttendeeNames());
        to.setAttendeeIds(from.getAttendeeIds());
        to.setStartDate(toDate(from.getStartDate()));
        to.setEndDate(toDate(from.getEndDate()));
        to.setRepeatMode(from.getRepeatMode());
        to.setActualStartDate(toDate(from.getActualStartDate()));
        to.setActualEndDate(toDate(from.getActualEndDate()));
        to.setActualDuration(from.getActualDuration());
        to.setAlertOffsetInMinutes(from.getAlertOffsetInMinutes());
        to.setPhoneNumber(from.getPhoneNumber());
        to.setAddress(from.getAddress());
        if (null != from.getLatitude() && null != from.getLongitude()) {
            to.setMeetingLocation(new DLocation(from.getLatitude(),from.getLongitude()));
        }
        to.setDetailsNotes(from.getDetailsNotes());
        to.setImageUrl(from.getImageUrl());

        // Agenda items
        to.setAgendaItemIds(from.getAgendaItemIds());

        // Documents and files
        to.setFileNames(from.getFileNames());
        to.setFileIds(from.getFileIds());

        // Notes
        to.setNotes(from.getNotes());

        // Follow up
        to.setFollowUpLastSentDate(toDate(from.getFollowUpLastSentDate()));
        to.setFollowUpNotes(from.getFollowUpNotes());
        to.setFollowUpIncludeAgenda(from.getFollowUpIncludeAgenda());
        to.setFollowUpFileIds(from.getFollowUpFileIds());
    }

}
