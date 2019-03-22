package entity;

import controller.CategoryController;


import java.util.ArrayList;
import java.util.Scanner;

public class MenuCategory {
    public Category createMenuCategory() {
        Scanner scanner = new Scanner(System.in);
        CategoryController categoryController = new CategoryController();
        ArrayList<Category> listCategory = categoryController.add();
        while (true) {
            System.out.println("--------Category Foodydi-------");
            for (int i = 0; i < listCategory.size(); i++) {
                System.out.println((i + 1) + ". " + listCategory.get(i).getName());
            }
            System.out.println("Nhập lựa chọn của bạn : ");
            int ch = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < listCategory.size(); i++) {
                if (ch == i + 1) {
                    return listCategory.get(i);
                }
            }
        }
    }
}
