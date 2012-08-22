package com.elearning.webapp.service.impl;

import java.util.List;

import com.elearning.webapp.Payment;
import com.elearning.webapp.service.PaymentService;
import com.elearning.webapp.service.dao.PaymentServiceDAO;

public class PaymentServiceImpl implements PaymentService {
	protected PaymentServiceDAO PaymentServiceDao;

	public void savePayment(Payment Payment) {
		PaymentServiceDao.savePayment(Payment);

	}

	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return PaymentServiceDao.getAllPayments();
	}

	public Payment getPayment(int PaymentId) {
		// TODO Auto-generated method stub
		return PaymentServiceDao.getPayment(PaymentId);
	}

	public void removePayment(Payment Payment) {
		PaymentServiceDao.removePayment(Payment);

	}
}
