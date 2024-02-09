package converter;

import entity.Category;
import entity.Product;
import model.CategoryRequest;
import model.ProductRequest;

public class CategoryConverter {

    public static Category convertCategoryRequest(CategoryRequest categoryRequest){
        Category category = new Category();
        category.setCategoryName(categoryRequest.getName());
        return category;

    }
}
