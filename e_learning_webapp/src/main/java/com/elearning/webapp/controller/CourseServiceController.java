package com.elearning.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.elearning.webapp.Course;
import com.elearning.webapp.service.CourseService;

@Controller
@RequestMapping("/CourseRegistration.htm")
@SessionAttributes("Course")
public class CourseServiceController {

	private CourseService courseService;

	@Autowired
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showCourseForm(ModelMap model) {
		Course course = new Course();
		model.addAttribute(course);
		return "CourseForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("Course") Course Course) {
		courseService.saveCourse(Course);
		return "Course.htm";
	}

}
