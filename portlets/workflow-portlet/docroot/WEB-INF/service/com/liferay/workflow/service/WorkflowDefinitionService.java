/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.workflow.service;

/**
 * <a href="WorkflowDefinitionService.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public interface WorkflowDefinitionService {
	public com.liferay.workflow.model.WorkflowDefinition addDefinition(
		java.lang.String xml, boolean addCommunityPermissions,
		boolean addGuestPermissions)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public com.liferay.workflow.model.WorkflowDefinition addDefinition(
		java.lang.String xml, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public com.liferay.workflow.model.WorkflowDefinition addDefinition(
		java.lang.String xml, java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public void addDefinitionResources(com.liferay.portal.model.User user,
		long definitionId, boolean addCommunityPermissions,
		boolean addGuestPermissions)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public void addDefinitionResources(com.liferay.portal.model.User user,
		long definitionId, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;

	public com.liferay.workflow.model.WorkflowDefinition getDefinition(
		long definitionId)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException;
}