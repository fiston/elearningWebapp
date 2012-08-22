package com.elearning.webapp.service.impl;

import java.util.List;

import com.elearning.webapp.Category;
import com.elearning.webapp.service.CategoryService;
import com.elearning.webapp.service.dao.CategoryServiceDAO;

public class CategoryServiceImpl implements CategoryService {
	protected CategoryServiceDAO CategoryServiceDao;

	public void saveCategory(Category category) {
		CategoryServiceDao.saveCategory(category);

	}

	public List<Category> getAllCategorys() {
		// TODO Auto-generated method stub
		return CategoryServiceDao.getAllCategorys();
	}

	public Category getCategory(int categoryId) {
		// TODO Auto-generated method stub
		return CategoryServiceDao.getCategory(categoryId);
	}

	public void removeCategory(Category category) {
		CategoryServiceDao.removeCategory(category);

	}
}
