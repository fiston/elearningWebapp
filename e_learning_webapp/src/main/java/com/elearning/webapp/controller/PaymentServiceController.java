package com.elearning.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.elearning.webapp.Payment;
import com.elearning.webapp.service.PaymentService;

@Controller
@RequestMapping("/PaymentRegistration.htm")
@SessionAttributes("Payment")
public class PaymentServiceController {

	private PaymentService paymentService;

	@Autowired
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showPaymentForm(ModelMap model) {
		Payment payment = new Payment();
		model.addAttribute(payment);
		return "PaymentForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("Payment") Payment payment) {
		paymentService.savePayment(payment);
		return "Payment.htm";
	}

}