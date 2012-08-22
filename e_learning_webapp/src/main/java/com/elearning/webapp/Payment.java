package com.elearning.webapp;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Payment {
	private long paymentId;
	private Person person;
	private List<Course> course;

	@Id
	@GeneratedValue
	@Column(name = "payment_id")
	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	@OneToOne(cascade = CascadeType.ALL)
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@OneToMany(cascade = CascadeType.ALL)
	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

}
