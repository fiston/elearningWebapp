package com.elearning.webapp.service.impl;

import java.util.List;

import com.elearning.webapp.Course;
import com.elearning.webapp.service.CourseService;
import com.elearning.webapp.service.dao.CourseServiceDAO;

public class CourseServiceImpl implements CourseService {
	protected CourseServiceDAO CourseServiceDao;

	public void saveCourse(Course Course) {
		CourseServiceDao.saveCourse(Course);

	}

	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return CourseServiceDao.getAllCourses();
	}

	public Course getCourse(int CourseId) {
		// TODO Auto-generated method stub
		return CourseServiceDao.getCourse(CourseId);
	}

	public void removeCourse(Course Course) {
		CourseServiceDao.removeCourse(Course);

	}

}
