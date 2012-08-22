package com.elearning.webapp.service.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.elearning.webapp.Course;
import com.elearning.webapp.service.dao.CourseServiceDAO;

public class CourseServiceDAOImpl implements CourseServiceDAO {
	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {

		this.hibernateTemplate = new HibernateTemplate(sessionFactory);

	}

	public void saveCourse(Course course) {
		hibernateTemplate.save(course);

	}

	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	public Course getCourse(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeCourse(Course Course) {
		// TODO Auto-generated method stub

	}

}
