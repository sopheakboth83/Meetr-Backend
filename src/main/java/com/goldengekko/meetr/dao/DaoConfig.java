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
package com.goldengekko.meetr.dao;

import java.util.HashMap;
import java.util.Map;
import net.sf.mardao.core.dao.DaoImpl;
import com.goldengekko.meetr.domain.DmFile;
import com.goldengekko.meetr.domain.DmContact;
import com.goldengekko.meetr.domain.DmMeeting;
import com.goldengekko.meetr.domain.DmTask;
import com.goldengekko.meetr.domain.DmAgendaItem;
import com.goldengekko.meetr.domain.DmAccount;

/**
 * Context to define the Dao beans.
 * This file is generated by mardao, but edited by developers.
 * It is not overwritten by the generator once it exists.
 *
 * Generated on 2013-07-19T15:33:33.389+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class DaoConfig {

    public static Map<Class, DaoImpl> createDaos() {
        final HashMap<Class, DaoImpl> map = new HashMap<Class, DaoImpl>();

        // first, create and map Dao instances:
        final DmFileDaoBean dmFileDao =
            new DmFileDaoBean();
        map.put(DmFile.class, dmFileDao);
        final DmContactDaoBean dmContactDao =
            new DmContactDaoBean();
        map.put(DmContact.class, dmContactDao);
        final DmMeetingDaoBean dmMeetingDao =
            new DmMeetingDaoBean();
        map.put(DmMeeting.class, dmMeetingDao);
        final DmTaskDaoBean dmTaskDao =
            new DmTaskDaoBean();
        map.put(DmTask.class, dmTaskDao);
        final DmAgendaItemDaoBean dmAgendaItemDao =
            new DmAgendaItemDaoBean();
        map.put(DmAgendaItem.class, dmAgendaItemDao);
        final DmAccountDaoBean dmAccountDao =
            new DmAccountDaoBean();
        map.put(DmAccount.class, dmAccountDao);

        // next, wire parents;

        // finally, wire many-to-ones;
	
        return map;
    }
}