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
package org.sakaiproject.iclicker.model;

import java.util.List;
import java.util.Vector;

import org.apache.commons.lang.StringUtils;

import lombok.Data;

/**
 * This holds the values of all the items in a gradebook and the users/scores
 */
@Data
public class Gradebook {
    private String id;
    private String courseId;

    private List<Student> students = new Vector<>();
    private List<GradebookItem> items = new Vector<>();

    public Gradebook(String id) {
        this.id = id;
        this.courseId = id;
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

        Gradebook other = (Gradebook) obj;

        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!StringUtils.equals(id, other.id)) {
            return false;
        }

        return true;
    }

}
