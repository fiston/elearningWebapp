package com.elearning.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elearning.webapp.Category;

@Controller
@RequestMapping("/index.*")
public class WelcomeController {
	@RequestMapping(method = RequestMethod.GET)
	public String showCategoryForm(ModelMap model) {

		return "index";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("Category") Category Category) {

		return "redirect:index.htm";
	}

}
