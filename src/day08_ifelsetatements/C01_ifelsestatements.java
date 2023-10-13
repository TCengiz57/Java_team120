package day08_ifelsetatements;

import java.util.Scanner;

public class C01_ifelsestatements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter=scanner.next().charAt(0);
        if (girilenKarakter>='A'&& girilenKarakter<='Z'){
            System.out.println("Girilen Karakter Büyük Harf");
        }else {
            System.out.println("Girilen Karakter BüyükHarf Degil");
        }

    }

}
