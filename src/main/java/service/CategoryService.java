package service;

import converter.CategoryConverter;
import converter.ProductConverter;
import dao.CategoryDao;
import dao.ProductDao;
import entity.Category;
import model.CategoryRequest;
import model.ProductRequest;
import validator.CategoryRequestValidator;
import validator.ProductRequestValidator;

import javax.persistence.Converter;
import java.util.List;

public class CategoryService {
    CategoryDao categoryDao = new CategoryDao();

    public CategoryRequest createCategory(CategoryRequest categoryRequest){
        //Validate user input
        CategoryRequestValidator.validateCategory(categoryRequest);
        //Convert model to entity
        Category category= CategoryConverter.convertCategoryRequest(categoryRequest);
        //Insert product into Database
        categoryDao.createCategoryEntity(category);
        return  categoryRequest;
    }

    public List<Category> displayAllCategory(){
        return categoryDao.displayCategory();
    }
}