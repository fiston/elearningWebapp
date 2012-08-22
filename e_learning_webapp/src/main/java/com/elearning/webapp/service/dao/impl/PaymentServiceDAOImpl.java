package com.elearning.webapp.service.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.elearning.webapp.Payment;
import com.elearning.webapp.service.dao.PaymentServiceDAO;

public class PaymentServiceDAOImpl implements PaymentServiceDAO {
	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {

		this.hibernateTemplate = new HibernateTemplate(sessionFactory);

	}

	public void savePayment(Payment payment) {
		hibernateTemplate.save(payment);

	}

	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	public Payment getPayment(int paymentId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removePayment(Payment payment) {
		// TODO Auto-generated method stub

	}
}
