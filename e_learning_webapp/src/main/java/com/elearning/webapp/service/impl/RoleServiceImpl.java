package com.elearning.webapp.service.impl;

import java.util.List;

import com.elearning.webapp.Role;
import com.elearning.webapp.service.RoleService;
import com.elearning.webapp.service.dao.RoleServiceDAO;

public class RoleServiceImpl implements RoleService {
	protected RoleServiceDAO RoleServiceDao;

	public void saveRole(Role Role) {
		RoleServiceDao.saveRole(Role);

	}

	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return RoleServiceDao.getAllRoles();
	}

	public Role getRole(int RoleId) {
		// TODO Auto-generated method stub
		return RoleServiceDao.getRole(RoleId);
	}

	public void removeRole(Role Role) {
		RoleServiceDao.removeRole(Role);

	}

}
