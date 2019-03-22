package entity;

import controller.FoodController;

import java.util.Scanner;

public class MenuCreator {
    public  void  createMenu() {
        Scanner scanner = new Scanner(System.in);
        FoodController foodController = new FoodController();
        while (true){
            System.out.println("--------Foodydi-------");
            System.out.println("1.Thêm món ăn");
            System.out.println("2.Hiển thị danh sách món ăn");
            System.out.println("3.Thoát chương trình.");
            System.out.println("-----------------------");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    foodController.addFood();
                    break;
                case 2:
                    foodController.printList();
                    break;
                case 3:
                    System.out.println("Thoát chương trình");
                    System.exit(1);
                    break;
                default:
                    System.out.println("CHọn sai , vui lòng chọn lại .");
                    break;
            }
            if (choice == 3){
                System.out.println("hẹn gặp lại.");
                break;
            }
        }
    }
}
