package day03_scanner;

import java.util.Scanner;

public class c05_scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin iki " +
                "kenar uzunlugunu giriniz");
        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        System.out.println("Dikdortgenin alani:" + kenar2*kenar1);
    }
}
