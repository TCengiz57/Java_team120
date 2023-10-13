package day08_ifelsetatements;

import java.util.Scanner;

public class C02_ifElseifstatements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilensayi= scanner.nextInt();

        if (girilensayi%3==0 && girilensayi%5==0 )
            System.out.println("Super sayi");

        else if (girilensayi%3==0)System.out.println("3'ün kati");

        else if (girilensayi%5==0) System.out.println("5'in kati");

        else System.out.println("yaramaz sayi");




    }
}
