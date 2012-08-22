package com.elearning.webapp.service.dao;

import java.util.List;

import com.elearning.webapp.Payment;

public interface PaymentServiceDAO {
	public void savePayment(Payment payment);

	public List<Payment> getAllPayments();

	public Payment getPayment(int paymentId);

	public void removePayment(Payment payment);
}
