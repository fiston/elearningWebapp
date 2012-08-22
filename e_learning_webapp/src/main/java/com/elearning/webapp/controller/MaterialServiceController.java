package com.elearning.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.elearning.webapp.Material;
import com.elearning.webapp.service.MaterialService;

@Controller
@RequestMapping("/MaterialRegistration.htm")
@SessionAttributes("Material")
public class MaterialServiceController {

	private MaterialService materialService;

	@Autowired
	public void setMaterialService(MaterialService materialService) {
		this.materialService = materialService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showMaterialForm(ModelMap model) {
		Material material = new Material();
		model.addAttribute(material);
		return "MaterialForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("Material") Material material) {
		materialService.saveMaterial(material);
		return "Material.htm";
	}

}