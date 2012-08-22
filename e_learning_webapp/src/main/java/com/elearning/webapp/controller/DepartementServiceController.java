package com.elearning.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.elearning.webapp.Departement;
import com.elearning.webapp.service.DepartementService;

@Controller
@RequestMapping("/DepartementRegistration.htm")
@SessionAttributes("Departement")
public class DepartementServiceController {

	private DepartementService departementService;

	@Autowired
	public void setDepartementService(DepartementService departementService) {
		this.departementService = departementService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showDepartementForm(ModelMap model) {
		Departement departement = new Departement();
		model.addAttribute(departement);
		return "DepartementForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(
			@ModelAttribute("Departement") Departement Departement) {
		departementService.saveDepartement(Departement);
		return "Departement.htm";
	}

}
