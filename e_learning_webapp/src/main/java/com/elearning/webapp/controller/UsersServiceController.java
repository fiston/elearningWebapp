package com.elearning.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.elearning.webapp.Users;
import com.elearning.webapp.service.UsersService;

@Controller
@RequestMapping("/UsersRegistration.htm")
@SessionAttributes("Users")
public class UsersServiceController {

	private UsersService usersService;

	@Autowired
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showUsersForm(ModelMap model) {
		Users users = new Users();
		model.addAttribute(users);
		return "UsersForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("Users") Users users) {
		usersService.saveUsers(users);
		return "Users.htm";
	}

}
