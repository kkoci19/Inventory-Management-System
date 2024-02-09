package service;

import converter.CategoryConverter;
import converter.ProductConverter;
import dao.CategoryDao;
import dao.ProductDao;
import model.CategoryRequest;
import model.ProductRequest;
import validator.CategoryRequestValidator;
import validator.ProductRequestValidator;

public class CategoryService {
    CategoryDao categoryDao = new CategoryDao();

    public static CategoryRequest createCategory(CategoryRequest categoryRequest){
        //Validate user input
        CategoryRequestValidator.validateCategory(categoryRequest);
        //Convert model to entity
        CategoryConverter.convertCategoryRequest(categoryRequest);
        //Insert product into Database
        CategoryDao.createCategoryEntity(categoryRequest);
    }
}