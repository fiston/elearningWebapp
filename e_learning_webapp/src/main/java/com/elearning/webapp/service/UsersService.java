package com.elearning.webapp.service;

import java.util.List;

import com.elearning.webapp.Users;

public interface UsersService {
	public void saveUsers(Users users);

	public List<Users> getAllUserss();

	public Users getUsers(int usersId);

	public void removeUsers(Users users);

}
