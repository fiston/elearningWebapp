package com.elearning.webapp.service.dao;

import java.util.List;

import com.elearning.webapp.Material;

public interface MaterialServiceDAO {
	public void saveMaterial(Material Material);

	public List<Material> getAllMaterials();

	public Material getMaterial(int materialId);

	public void removeMaterial(Material Material);
}
