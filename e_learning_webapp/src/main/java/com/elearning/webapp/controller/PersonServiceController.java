package com.elearning.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.elearning.webapp.Person;
import com.elearning.webapp.service.PersonService;

@Controller
@RequestMapping("/PersonRegistration.htm")
@SessionAttributes("Person")
public class PersonServiceController {

	private PersonService personService;

	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showPersonForm(ModelMap model) {
		Person person = new Person();
		model.addAttribute(person);
		return "PersonForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("Person") Person person) {
		personService.savePerson(person);
		return "Person.htm";
	}

}
