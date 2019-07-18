/**
 * Copyright (c) 2003 i>clicker (R) <http://www.iclicker.com/dnn/>
 *
 * This file is part of Sakai iclicker project base pom.
 *
 * Sakai iclicker project base pom is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Sakai iclicker project base pom is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Sakai iclicker project base pom.  If not, see <http://www.gnu.org/licenses/>.
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
     * Sakai userId (internal, not EID/USERNAME)
     */
    private String userId;

    /**
     * The encoded user key
     */
    private String userKey;

    private Date dateCreated;
    private Date dateModified;

    /**
     * Full constructor
     */
    public ClickerUserKey(String userKey, String userId) {
        this.userKey = userKey;
        this.userId = userId;
        this.dateCreated = new Date();
        this.dateModified = this.dateCreated;
    }

    /**
     * Special copy constructor which ensures we are not handing around the persistent object
     */
    public ClickerUserKey(ClickerUserKey cluk) {
        this.id = cluk.getId();
        this.userKey = cluk.getUserKey();
        this.userId = cluk.getUserId();
        this.dateCreated = cluk.getDateCreated();
        this.dateModified = cluk.getDateModified();
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
