/**
 *     Copyright 2012, 2013 Golden Gekko
 *
 *     This file is part of Meetr.
 *
 *     Meetr is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Meetr is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Meetr.  If not, see <http://www.gnu.org/licenses />.
 */
package com.goldengekko.meetr.service.sugarcrm;

/**
 * The login response from SugarCRM
 */
public class SugarCRMLoginResponse {

    /** The user login token */
    private String id;

    /** In case of failed log in, name will be set to "Invalid login" */
    private String name;


    // Get error message
    public boolean hasError() {
        return null == this.id;
    }

    public boolean isInvalidCredentials() {
        return name.equalsIgnoreCase("Invalid Login");
    }


    @Override
    public String toString() {
        return String.format("Token:%s", this.getId());
    }

    // Setters and Getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
