package com.elearning.webapp.service;

import java.util.List;

import com.elearning.webapp.Departement;

public interface DepartementService {
	public void saveDepartement(Departement Departement);

	public List<Departement> getAllDepartements();

	public Departement getDepartement(int departementId);
	
	public void removeDepartement(Departement Departement);

}
