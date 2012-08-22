package com.elearning.webapp.service;

import java.util.List;

import com.elearning.webapp.Payment;

public interface PaymentService {
	public void savePayment(Payment payment);

	public List<Payment> getAllPayments();

	public Payment getPayment(int paymentId);

	public void removePayment(Payment payment);
}
