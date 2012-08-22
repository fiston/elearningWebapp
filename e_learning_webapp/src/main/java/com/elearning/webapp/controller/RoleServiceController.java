package com.elearning.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.elearning.webapp.Role;
import com.elearning.webapp.service.RoleService;

@Controller
@RequestMapping("/RoleRegistration.htm")
@SessionAttributes("Role")
public class RoleServiceController {

	private RoleService roleService;

	@Autowired
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showRoleForm(ModelMap model) {
		Role role = new Role();
		model.addAttribute(role);
		return "RoleForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("Role") Role role) {
		roleService.saveRole(role);
		return "Role.htm";
	}

}