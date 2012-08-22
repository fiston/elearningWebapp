package com.elearning.webapp.service;

import java.util.List;

import com.elearning.webapp.Material;

public interface MaterialService {
	public void saveMaterial(Material Material);

	public List<Material> getAllMaterials();

	public Material getMaterial(int materialId);

	public void removeMaterial(Material Material);
}
