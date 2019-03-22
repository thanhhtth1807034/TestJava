package entity;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Food {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
    private String foodId;
    private Category categoryId;
    private String foodName;
    private String shortDes;
    private double price;
    private String createDate = simpleDateFormat.format(new Date());

    @Override
    public String toString() {
        return String.format(" %10s | %10s | %10s | %10s | %10s | %10f | %10s " ,
                this.foodId,this.categoryId.getCategoryId(), this.categoryId.getName(), this.foodName, this.shortDes, this.price, this.createDate
        );

    }

    public Food() {
    }

    public Food(SimpleDateFormat simpleDateFormat, String foodId, Category categoryId, String foodName, String shortDes, double price) {
        this.simpleDateFormat = simpleDateFormat;
        this.foodId = foodId;
        this.categoryId = categoryId;
        this.foodName = foodName;
        this.shortDes = shortDes;
        this.price = price;
    }

    public Food(String foodId, Category categoryId, String foodName, String shortDes, double price) {
        this.foodId = foodId;
        this.categoryId = categoryId;
        this.foodName = foodName;
        this.shortDes = shortDes;
        this.price = price;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getShortDes() {
        return shortDes;
    }

    public void setShortDes(String shortDes) {
        this.shortDes = shortDes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCreateDtae() {
        return createDate;
    }

    public void setCreateDtae(String createDtae) {
        this.createDate = createDtae;
    }

    public SimpleDateFormat getSimpleDateFormat() {
        return simpleDateFormat;
    }

    public void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
        this.simpleDateFormat = simpleDateFormat;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
