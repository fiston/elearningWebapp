package com.elearning.webapp.service.dao;

import java.util.List;

import com.elearning.webapp.Users;

public interface UsersServiceDAO {
	public void saveUsers(Users users);

	public List<Users> getAllUserss();

	public Users getUsers(int usersId);

	public void removeUsers(Users users);

}
