package client;

import dao.ProductDao;
import model.CategoryRequest;
import model.ProductRequest;
import service.CategoryService;
import service.ProductService;

import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Inventory Management System");
            System.out.println("1. Add Category.");
            System.out.println("2. Display all products.");
            System.out.println("3. Notify for low stock.");
            System.out.println("4. Add product.");
            System.out.println("5. Display all categories.");

            choice=sc.nextInt();
            ProductService productService= new ProductService();
            CategoryService categoryService= new CategoryService();


            switch (choice){
                case 1:{
                    createCategory(sc);
                    break;
                }
                case 2:{
                    System.out.println(productService.displayAllProducts());
                    break;

                }
                case 3:{
                    System.out.println(categoryService.displayAllCategory());
                    break;

                }
                case 4:{
                    createProduct(sc);
                    break;

                }
                case 5:{
                    System.out.println(productService.notifyProductsLowStock());
                    break;

                } default:{
                    System.out.println("Option not valid");
                    break;

                }
            }

        } while (choice > 5);
        sc.close();
    }

    public static void createCategory (Scanner sc){
        CategoryRequest categoryRequest = new CategoryRequest();
        System.out.println("Please insert category name:");
        sc.next();
        CategoryService categoryService=new CategoryService();
        categoryService.createCategory(categoryRequest);
    }

    public static void createProduct (Scanner sc){
        ProductRequest productRequest = new ProductRequest();
        System.out.println("Please insert product name:");
        sc.next();
        System.out.println("Please insert product description");
        sc.next();
        System.out.println("Please insert product price");
        sc.nextDouble();
        System.out.println("Please insert product quantity");
        sc.nextInt();
        System.out.println("Please insert product category id");
        sc.nextInt();
        ProductService productService=new ProductService();
        productService.createProduct(productRequest);

    }


}
