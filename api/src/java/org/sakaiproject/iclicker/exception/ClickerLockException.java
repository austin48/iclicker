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
package org.sakaiproject.iclicker.exception;

/**
 * Exception which indicates that the lock could not be obtained, most likely because it is already in use
 */
public class ClickerLockException extends RuntimeException {

    private static final long serialVersionUID = 7085116541839066408L;

    public String name;
    public String holder;

    public ClickerLockException(String message, String name, String holder) {
        super(message);
        this.name = name;
        this.holder = holder;
    }

}
