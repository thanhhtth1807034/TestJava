package main;

import entity.Game;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên Game: ");
        String name = scanner.nextLine();
        System.out.println("Nhập mô tả: ");
        String description = scanner.nextLine();
        System.out.println("Nhập giá: ");
        Double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ngày phát hành: ");
        String releaseDate = scanner.nextLine();
        System.out.println("Nhập Website :");
        String home = scanner.nextLine();
        Game game = new Game(name, description, price,releaseDate,home );
        System.out.println(game.toString());
    }
}
