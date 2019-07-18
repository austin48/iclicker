<%--

    Copyright (c) 2003 i>clicker (R) <http://www.iclicker.com/dnn/>

    This file is part of Sakai iclicker project base pom.

    Sakai iclicker project base pom is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Sakai iclicker project base pom is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Sakai iclicker project base pom.  If not, see <http://www.gnu.org/licenses/>.

--%>
<%@ include file="/views/includeHeader.jsp" %><%
// make the common values accessible on all the JSP pages
WebApplicationContext applicationContext = (WebApplicationContext) pageContext.findAttribute("applicationContext");
ToolController controller = (ToolController) pageContext.findAttribute("controller");
// need to also set the fmt localization settings again as well
%><fmt:setLocale value="${locale}" /><fmt:setBundle basename="${messageBundle}" />