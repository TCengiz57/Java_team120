package day31_DateTime;

import java.time.LocalDateTime;

public class C02_LocalDateTime {
    public static void main(String[] args) {

            LocalDateTime tarihSaat=LocalDateTime.now();
            System.out.println(tarihSaat);

            //bir forloop olusturup 1den 10000000 e kadar olan sayilari toplayin.
            //işlem suresini nano saniye olarak yazdirin.

            LocalDateTime baslamaZamani=LocalDateTime.now();
           int baslangicZamani= baslamaZamani.getNano();

        int toplam=0;

        for (int i = 1; i <10000000 ; i++) {
            toplam+=i;


        }
         LocalDateTime bitirmeZamani=LocalDateTime.now();
        int bitisZamani= bitirmeZamani.getNano();

        System.out.println("İşlem suresi :"+ (bitisZamani-baslangicZamani));




    }
}
