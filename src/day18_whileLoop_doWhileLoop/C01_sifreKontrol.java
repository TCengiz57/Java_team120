package day18_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_sifreKontrol {
    public static void main(String[] args) {
        //Soru 4 : Main method'da kullanicidan sifre isteyip,
        //          olusturacagimiz bir method'da asagidaki sartlari kontrol edin
        //          ve method'dan true veya false dondurun
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         tum sartlari saglanincaya kadar tekrar deger isteyin
        //         ve sartlar saglaninca , "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmalicalısır.


        /*
        Bu soruyu day17 de cözduk
        ama javada daha profosyonel kodlama için
        iki duzeltme yapacagız

       1- while loop onundeki parantezin içi true oldugu muddetce loop calısır

        bu soruda sonuc varıable da boolen deger iceriyor.
        ama sorunun mantıgı acısından sonuc false oldugu muddetce loop calışmalı

       2-whileloop her calıstığında
        Scanner scanner = new Scanner(System.in);
        calısıyor ve yeni bir scanner objesi olusturuyor.

        bunun yerine daha guzel olanı looptan once objeyi olusturup
        loopun icerisinde sadece deger ataması yapmaktır.
         */

        boolean sonuc = false;
        Scanner scanner;
        String sifre;

        while (!sonuc){ //sonuc == false işleminin sonucu true
            scanner = new Scanner(System.in);
            System.out.println("Lutfen sifrenizi giriniz");
            sifre = scanner.nextLine();
            sonuc = sifreKontrolEt(sifre);
        }
        System.out.println("Sifreniz basariyla kaydedildi");
    }
    public static boolean sifreKontrolEt(String sifre) {
        int sayac = 0; // sayac hatalari saysin
        //         - ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) {
            System.out.println("ilk karakter kucuk harf olmali");
            sayac++;
        }
        //         - son karakter rakam olmali
        char sonKarakter = sifre.charAt(sifre.length() - 1);
        if (!(sonKarakter >= '0' && sonKarakter <= '9')) {
            System.out.println("Son karakter rakam olmali");
            sayac++;
        }
        //         - sifre bosluk icermemeli
        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");
            sayac++;
        }
        //         - uzunlugu en az 10 karakter olmali
        if (sifre.length() < 10) {
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmalidir");
            sayac++;
        }
        if (sayac == 0) {
            return true;
        } else {
            return false;
        }
    }
}

