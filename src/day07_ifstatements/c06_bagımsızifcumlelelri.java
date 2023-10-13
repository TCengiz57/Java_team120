package day07_ifstatements;

import java.util.Scanner;

public class c06_bagımsızifcumlelelri {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir tam sayi isteyin
        // sayi 3 veya 5 ile bolunebiliyorsa
        // "Guzel sayi" yazdirin
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam ayi giriniz");
        int girilenSayi= scanner.nextInt();

        if (girilenSayi%3==0 || girilenSayi%5==0)
            System.out.println("Guzel Sayi");

    }
}
