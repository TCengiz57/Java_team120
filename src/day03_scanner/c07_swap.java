package day03_scanner;

import java.util.Scanner;

public class c07_swap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi  giriniz");
       int ilkSayi= scanner.nextInt();
        System.out.println("Lutfen ikinci sayiyi  giriniz");
       int ikinciSayi= scanner.nextInt();

       int temp= ilkSayi;
       ilkSayi= ikinciSayi;
       ikinciSayi=temp;


        System.out.println("ilk Sayinin yeni degeri:"+ ilkSayi);
        System.out.println("ikinci Sayinin yeni degeri:"+ikinciSayi);



    }
}
