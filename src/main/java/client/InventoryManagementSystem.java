package client;

import model.CategoryRequest;
import service.CategoryService;

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

            switch (choice){
                case 1:{
                    createCategory(sc);
                    break;
                }
                case 2:{

                }
                case 3:{

                }
                case 4:{

                }
                case 5:{

                } default:{

                }
            }

        } while (choice > 5);
        sc.close();
    }

    public static void createCategory (Scanner sc){
        CategoryRequest categoryRequest = new CategoryRequest();
        System.out.println("Please insert category name:");
        sc.nextLine();
        CategoryService categoryService=new CategoryService();
        categoryService.createCategory(categoryRequest);
    }


}
