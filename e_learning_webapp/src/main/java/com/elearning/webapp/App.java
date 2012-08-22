package com.elearning.webapp;

import com.elearning.webapp.service.dao.impl.CategoryServiceDAOImpl;
import com.elearning.webapp.service.dao.impl.CourseServiceDAOImpl;
import com.elearning.webapp.service.dao.impl.DepartementServiceDAOImpl;
import com.elearning.webapp.service.dao.impl.MaterialServiceDAOImpl;
import com.elearning.webapp.service.dao.impl.PaymentServiceDAOImpl;
import com.elearning.webapp.service.dao.impl.PersonServiceDAOImpl;
import com.elearning.webapp.service.dao.impl.RoleServiceDAOImpl;
import com.elearning.webapp.service.dao.impl.UsersServiceDAOImpl;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		PersonServiceDAOImpl p = new PersonServiceDAOImpl();
		p.savePerson(new Person());
		DepartementServiceDAOImpl d = new DepartementServiceDAOImpl();
		d.saveDepartement(new Departement());
		CategoryServiceDAOImpl c = new CategoryServiceDAOImpl();
		c.saveCategory(new Category());
		CourseServiceDAOImpl co = new CourseServiceDAOImpl();
		co.saveCourse(new Course());
		MaterialServiceDAOImpl m = new MaterialServiceDAOImpl();
		m.saveMaterial(new Material());
		PaymentServiceDAOImpl pa = new PaymentServiceDAOImpl();
		pa.savePayment(new Payment());
		RoleServiceDAOImpl role = new RoleServiceDAOImpl();
		role.saveRole(new Role());
		UsersServiceDAOImpl u = new UsersServiceDAOImpl();
		u.saveUsers(new Users());

		System.out.println("Hello World!");
	}
}
