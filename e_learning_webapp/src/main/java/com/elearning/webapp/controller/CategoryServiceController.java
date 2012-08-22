package com.elearning.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.elearning.webapp.Category;
import com.elearning.webapp.service.CategoryService;

@Controller
@RequestMapping("/CategoryRegistration.htm")
@SessionAttributes("Category")
public class CategoryServiceController {

	private CategoryService categoryService;

	@Autowired
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showCategoryForm(ModelMap model) {
		Category category = new Category();
		model.addAttribute(category);
		return "CategoryForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("Category") Category Category) {
		categoryService.saveCategory(Category);
		return "Category.htm";
	}

}