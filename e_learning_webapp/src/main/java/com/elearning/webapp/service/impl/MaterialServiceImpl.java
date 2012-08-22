package com.elearning.webapp.service.impl;

import java.util.List;

import com.elearning.webapp.Material;
import com.elearning.webapp.service.MaterialService;
import com.elearning.webapp.service.dao.MaterialServiceDAO;

public class MaterialServiceImpl implements MaterialService {
	protected MaterialServiceDAO MaterialServiceDao;

	public void saveMaterial(Material Material) {
		MaterialServiceDao.saveMaterial(Material);

	}

	public List<Material> getAllMaterials() {
		// TODO Auto-generated method stub
		return MaterialServiceDao.getAllMaterials();
	}

	public Material getMaterial(int MaterialId) {
		// TODO Auto-generated method stub
		return MaterialServiceDao.getMaterial(MaterialId);
	}

	public void removeMaterial(Material Material) {
		MaterialServiceDao.removeMaterial(Material);

	}
}
