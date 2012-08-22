package com.elearning.webapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departement")
public class Departement {
	private int departementId;
	private String departementName;

	@Id
	@GeneratedValue
	@Column(name = "departement_id")
	public int getDepartementId() {
		return departementId;
	}

	public void setDepartementId(int departementId) {
		this.departementId = departementId;
	}

	@Column(name = "departement_name")
	public String getDepartementName() {
		return departementName;
	}

	public void setDepartementName(String departementName) {
		this.departementName = departementName;
	}

}
