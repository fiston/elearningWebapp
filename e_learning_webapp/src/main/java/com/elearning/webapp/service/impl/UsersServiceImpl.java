package com.elearning.webapp.service.impl;

import java.util.List;

import com.elearning.webapp.Users;
import com.elearning.webapp.service.UsersService;
import com.elearning.webapp.service.dao.UsersServiceDAO;

public class UsersServiceImpl implements UsersService {
	protected UsersServiceDAO UsersServiceDao;

	public void saveUsers(Users Users) {
		UsersServiceDao.saveUsers(Users);

	}

	public List<Users> getAllUserss() {
		// TODO Auto-generated method stub
		return UsersServiceDao.getAllUserss();
	}

	public Users getUsers(int UsersId) {
		// TODO Auto-generated method stub
		return UsersServiceDao.getUsers(UsersId);
	}

	public void removeUsers(Users Users) {
		UsersServiceDao.removeUsers(Users);

	}

}
