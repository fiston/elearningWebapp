package com.elearning.webapp.service;

import java.util.List;

import com.elearning.webapp.Role;

public interface RoleService {
	public void saveRole(Role role);

	public List<Role> getAllRoles();

	public Role getRole(int roleId);

	public void removeRole(Role role);

}
