package service;

import converter.ProductConverter;
import dao.ProductDao;
import entity.Product;
import model.ProductRequest;
import validator.ProductRequestValidator;

public class ProductService {
    ProductDao productDao = new ProductDao();

    public  ProductRequest createProduct(ProductRequest request){
        //Validate user input
        ProductRequestValidator.validateProduct(request);
        //Convert model to entity
        Product product= ProductConverter.convertProductToEntity(request);
        //Insert product into Database
        productDao.createProductEntity(product);
        return request;
    }
}
