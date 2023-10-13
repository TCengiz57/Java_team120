package day08_ifelsetatements;

import java.util.Scanner;

public class C04_ifelseifstatements {
    public static void main(String[] args) {
    // Kullanicidan bir tam sayi isteyin
    // Sayi 3' e bolunuyorsa 3'un kati
    // sayi 5'e bolunuyorsa 5'in kati
    // ikisine birden bolunuyorsa super sayi yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilensayi= scanner.nextInt();

        if (girilensayi%3==0 && girilensayi%5==0){
            System.out.println("Super sayi");

        } else if (girilensayi%3==0) {
            System.out.println("3'un kati");


        } else if (girilensayi%5==0) {
            System.out.println("5'in kati");

        }


    }
}
