package day03_scanner;

import java.util.Scanner;

public class c03_scanner {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("lutfen bir double sayi giriniz");
        double girilenDouble= scanner.nextDouble();
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenint= scanner.nextInt();

        System.out.println("iki sayinin toplami:"+ (girilenDouble+girilenint));
        System.out.println("iki sayinin carpimi:"+ girilenDouble*girilenint);
    }
}
