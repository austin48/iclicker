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

package org.sakaiproject.iclicker.model;

import java.io.Serializable;
import java.util.Comparator;

import org.apache.commons.lang3.StringUtils;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a user in the system.
 * 
 */
@Data
@NoArgsConstructor
public class User {

    private String userId;
    private String username;
    private String name;
    private String fname;
    private String lname;
    private String email;
    private String sortName;

    /**
     * Constructor.
     *
     * @param userId the uzser ID
     * @param username the username
     * @param name the name
     */
    public User(String userId, String username, String name) {
        this(userId, username, name, null, null);
    }

    /**
     * Constructor.
     *
     *@param userId the uzser ID
     * @param username the username
     * @param name the name
     * @param sortName the sort name
     * @param email the email
     */
    public User(String userId, String username, String name, String sortName, String email) {
        this.userId = userId;
        this.username = username;
        this.name = name;
        this.sortName = sortName;
        this.email = email;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());

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

        User other = (User) obj;

        if (userId == null) {
            if (other.userId != null) {
                return false;
            }
        } else if (!StringUtils.equals(userId, other.userId)) {
            return false;
        }

        if (username == null) {
            if (other.username != null) {
                return false;
            }
        } else if (!StringUtils.equals(username, other.username)) {
            return false;
        }

        return true;
    }

    public static class UsernameComparator implements Comparator<User>, Serializable {

        private static final long serialVersionUID = -3706455898470651959L;

        /**
         * Compare.
         *
         *  @param o1 object 1
         *  @param o2 object 2
         *  @return return the match integer
         */
        public int compare(User o1, User o2) {
            return o1.username.compareTo(o2.username);
        }

    }

    public static class SortnameComparator implements Comparator<User>, Serializable {

        private static final long serialVersionUID = -1105332623637125172L;

        /**
         * Compare.
         *
         *  @param o1 object 1
         *  @param o2 object 2
         *  @return return the match integer
         */
        public int compare(User o1, User o2) {
            return o1.sortName.compareTo(o2.sortName);
        }

    }

}
