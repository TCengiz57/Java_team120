package day18_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C04_RakamlarToplamınıBulma {
    public static void main(String[] args) {


        /* Soru 2- While loop kullanarak kullanicidan
    alinan sayinin rakamlar toplamini bulun
        */
       Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen rakamlar toplamini bulmak istediginiz sayiyi yaziniz");

        int girilenSayi= scanner.nextInt();

        int sayi=girilenSayi;
        int birlerBasmagi=0;
        int rakamlarToplami=0;

        while (sayi>0){
            birlerBasmagi=sayi%10;
            rakamlarToplami+=birlerBasmagi;
            sayi/=10;

            System.out.println("Girilen "+ girilenSayi+ " sayisinin rakamlar toplami:" + rakamlarToplami);
        }


    }
}
