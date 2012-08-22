package com.elearning.webapp.service.dao;

import java.util.List;

import com.elearning.webapp.Category;

public interface CategoryServiceDAO {
	public void saveCategory(Category category);

	public List<Category> getAllCategorys();

	public Category getCategory(int categoryId);
	
	public void removeCategory(Category Category);

}
