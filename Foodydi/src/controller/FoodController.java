package controller;

import entity.Category;
import entity.Food;
import entity.MenuCategory;


import java.util.ArrayList;

import java.util.Scanner;

public class FoodController {
    private ArrayList<Food> list = new ArrayList<>();


    public void addFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã món ăn: ");
        String foodId = scanner.nextLine();
//        System.out.println("Nhập mã danh mục: ");
//        String categoryId = scanner.nextLine();
        MenuCategory Category = new MenuCategory();
        Category categoryId = Category.createMenuCategory();
        System.out.println("Nhập tên món: ");
        String foodName = scanner.nextLine();
        System.out.println("Nhập mô tả món ăn: ");
        String shortDes = scanner.nextLine();
        System.out.println("Nhập giá: ");
        Double price = scanner.nextDouble();
        scanner.nextLine();
        Food food = new Food(foodId, categoryId, foodName, shortDes, price);
        list.add(food);
    }

    public void printList() {

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).toString());
//        }

        for (Food food : list) {
            System.out.println(food.toString());
        }
    }
}
