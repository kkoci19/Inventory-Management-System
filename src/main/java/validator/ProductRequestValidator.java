package validator;

import model.ProductRequest;

import java.util.InputMismatchException;

public class ProductRequestValidator {
    public static void validateProduct(ProductRequest request){
        if (request.getProductName() == null){
            throw new InputMismatchException();
        }
        if (request.getPrice() <=0){
            throw new InputMismatchException();
        }
        if (request.getQuantity() <0 ){
            throw new InputMismatchException();
        }
        if (request.getCategory().getId() <=0){
            throw new InputMismatchException();
        }
    }
}
