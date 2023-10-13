package day07_ifstatements;

import java.util.Locale;
import java.util.Scanner;

public class c09ifelse {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise “Emekli olabilirsin” yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen Yasinizi Giriniz");
        int yas= scanner.nextInt();

        if (yas>=65){
            System.out.println("Emekli olabilirsin");
        }
        if (yas<65){
            System.out.println("Emekli olmak icin calısmaniz gereken yıl:"+ (65-yas));
        }






        //Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak
        // yazdirin, yoksa girilen harfi yazdirin


Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf yaziniz");
        String harf=scan.next().toUpperCase();

            System.out.println(harf.toUpperCase());






    }
}
