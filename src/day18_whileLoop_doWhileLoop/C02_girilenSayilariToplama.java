package day18_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_girilenSayilariToplama {
    public static void main(String[] args) {
        // Kullanicidan toplanmak uzere sayilar alin
// girilen sayilarin toplami 500'u gecerse
// bu kadar sayi yeter, girilen sayilarin toplami .... oldu yazdirin
// girilen sayi adedi 10 veya daha yuksek olursa
// 10'dan fazla sayi giremezsin, girilen sayilarin toplami .... oldu yazdirin
// ve islemi bitirin

        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int sayi;

        while (sayac < 10 && toplam < 500) {// while loop içi true oldukca calısmaya devam edecek

            scanner = new Scanner(System.in);
            System.out.println("Lutfen toplanmak uzere sayi girin");
            sayi= scanner.nextInt();

            toplam+=sayi;
            sayac++;



        }
        //whilelopp bitti ise sartlardan biri saglanmadı demektir.

        if (sayac>=10){
            System.out.println("10'dan fazla sayi giremezsin, girilen sayilarin toplami "+toplam+" oldu ");
        }
        if (toplam>500){
            System.out.println("bu kadar sayi yeter, girilen sayilarin toplami "+toplam+" oldu");
        }
    }
}
