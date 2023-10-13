package day11_stringManupılatıons;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir mail adresi giriniz");
        String mail= scanner.nextLine();

        if (!mail.contains("@")){
            System.out.println("Gecersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        }
    }
}
