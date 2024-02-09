package converter;

import entity.Category;
import entity.Product;
import model.ProductRequest;

public class ProductConverter {

    public static Product convertProductToEntity(ProductRequest request){
        Product product = new Product();
        product.setProductName(request.getProductName());
        product.setPrice(request.getPrice());
        product.setQuantity(request.getQuantity());
        product.setCategory(new Category(request.getCategory().getId()));
        product.setDescription(request.getProductDescription());
        return product;
    }
}
