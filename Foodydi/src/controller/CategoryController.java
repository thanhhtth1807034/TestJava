package controller;

import entity.Category;

import java.util.ArrayList;

public class CategoryController {
    private ArrayList<Category> listCategory = new ArrayList<>();
    public  ArrayList<Category> add(){

        listCategory.add(new Category("C01","Đồ ăn"));
        listCategory.add(new Category("C02","Điểm tâm"));
        listCategory.add(new Category("C03","Đồ uống có cồn"));
        listCategory.add(new Category("C04","Đồ uống không có cồn"));
        return  listCategory;

    }
}
