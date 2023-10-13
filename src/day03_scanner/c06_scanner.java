package day03_scanner;

import java.util.Scanner;

public class c06_scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen cemberin yari capini giriniz");
         double yariCap= scanner.nextDouble();
        System.out.println("cemberin cevresi:" + 2*3.14* yariCap);
        System.out.println("Dairenin alani:"+ 3.14*yariCap*yariCap);
    }
}
