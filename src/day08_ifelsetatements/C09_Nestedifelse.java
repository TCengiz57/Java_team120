package day08_ifelsetatements;

import java.util.Scanner;

public class C09_Nestedifelse {
    public static void main(String[] args) {
        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz");
        char cinsiyet= scanner.next().toUpperCase().charAt(0);



        System.out.println("Lutfen yasinizi giriniz");
        double yas= scanner.nextDouble();

        if (cinsiyet=='E'){
            if (yas<0 || yas>100){
                System.out.println("Gecersiz yas girisi");
            } else if (yas>=65) {
                System.out.println("Erkek Emekli olailir");

            }else {
                System.out.println("Emekli olmak icin "+ (65-yas)+ " yil daha calısmalisiniz");
            }


        } else if (cinsiyet=='K') {
            if (yas < 0 || yas > 100) {
                System.out.println("Gecersiz yas girisi");
            } else if (yas >= 60) {
                System.out.println("Kadin Emekli olailir");

            } else {
                System.out.println("Emekli olmak icin " + (60 - yas) + " yil daha calısmalisiniz");
            }
        }else{
                System.out.println("Cinsiyet hatali girildi");




        }


    }
}
