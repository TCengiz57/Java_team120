package day05_matematiksel_islemler_increment;

import java.util.Scanner;

public class C02_Rakamlar_toplamini_bulma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen 3 basamakli birsayigiriniz");

        int girilensayi= scanner.nextInt();

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi = girilensayi%10;
        rakamlarToplami=rakamlarToplami + birlerBasamagi;
        girilensayi=girilensayi/10;


        birlerBasamagi= girilensayi%10;
        rakamlarToplami=rakamlarToplami + birlerBasamagi;
        girilensayi=girilensayi/10;


        birlerBasamagi= girilensayi%10;
        rakamlarToplami=rakamlarToplami + birlerBasamagi;
        girilensayi=girilensayi/10;

        System.out.println("Rakamlar Toplami:" + rakamlarToplami);

    }
}
