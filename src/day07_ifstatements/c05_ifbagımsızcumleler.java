package day07_ifstatements;

import java.util.Scanner;

public class c05_ifbagımsızcumleler {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir ücgenin 3 kenar uzunlugunu giriniz");
        double kenar1= scanner.nextDouble();
        double kenar2=scanner.nextDouble();
        double kenar3=scanner.nextDouble();

 /*
            java'da 3'lu karsilastirma OLMAZ
            ikili karsilastirmalar yapip
            && veya || operatorleri ile birlestirmeliyiz
         */

        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0){
            System.out.println("Eskenar ucgen");
        }

    }
}
