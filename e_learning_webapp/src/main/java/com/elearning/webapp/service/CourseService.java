package com.elearning.webapp.service;

import java.util.List;

import com.elearning.webapp.Course;

public interface CourseService {
	public void saveCourse(Course Course);

	public List<Course> getAllCourses();

	public Course getCourse(int courseId);
	
	public void removeCourse(Course Course);

}
