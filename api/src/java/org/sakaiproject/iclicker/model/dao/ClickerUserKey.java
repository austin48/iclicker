/**
 * Copyright (c) 2009 i>clicker (R) <http://www.iclicker.com/dnn/>
 *
 * This file is part of i>clicker Sakai integrate.
 *
 * i>clicker Sakai integrate is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * i>clicker Sakai integrate is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with i>clicker Sakai integrate.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.sakaiproject.iclicker.model.dao;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This represents a clicker user key which is assigned to instructors on demand when used with an
 * LMS which uses a single sign on system. They key is used in place of a password and is a randomly
 * generated alphanumeric char sequence.
 */
@Data
@NoArgsConstructor
public class ClickerUserKey implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * Sakai userId (internal, not EID/USERNAME).
     */
    private String userId;

    /**
     * The encoded user key.
     */
    private String userKey;

    private Date dateCreated;
    private Date dateModified;

    /**
     * Full constructor.
     *
     *  @param userKey the user key
     *  @param userId the user ID
     */
    public ClickerUserKey(String userKey, String userId) {
        this.userKey = userKey;
        this.userId = userId;
        this.dateCreated = new Date();
        this.dateModified = this.dateCreated;
    }

    /**
     * Special copy constructor which ensures we are not handing around the persistent object.
     *
     *  @param clickerUserKey clicker user key
     */
    public ClickerUserKey(ClickerUserKey clickerUserKey) {
        this.id = clickerUserKey.getId();
        this.userKey = clickerUserKey.getUserKey();
        this.userId = clickerUserKey.getUserId();
        this.dateCreated = clickerUserKey.getDateCreated();
        this.dateModified = clickerUserKey.getDateModified();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        ClickerUserKey other = (ClickerUserKey) obj;

        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }

        return true;
    }

}
