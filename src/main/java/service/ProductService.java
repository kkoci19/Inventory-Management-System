package service;

import converter.ProductConverter;
import dao.ProductDao;
import model.ProductRequest;
import validator.ProductRequestValidator;

public class ProductService {
    ProductDao productDao = new ProductDao();

    public static ProductRequest createProduct(ProductRequest request){
        //Validate user input
        ProductRequestValidator.validateProduct(request);
        //Convert model to entity
        ProductConverter.convertProductToEntity(request);
        //Insert product into Database
        ProductDao.createProductEntity(request);
    }
}
