package day03_scanner;

import java.util.Scanner;

public class c04_scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir İsim giriniz");
        String girilenIsim= scanner.nextLine();
        System.out.println("Lutfen Soyisminizi Giriniz");
        String girilenSoyisim= scanner.nextLine();
        System.out.println("Lutfen Yasinizi Giriniz");
        int girilenYas= scanner.nextInt();

        System.out.println("İsminiz:"+ girilenIsim);
        System.out.println("Soyisminiz:"+ girilenSoyisim);
        System.out.println("Yasiniz:"+ girilenYas);
        System.out.println("Kaydiniz Basariyle Tamamlanmıstır.");

        System.out.println("İsminiz:"+ girilenIsim +
                " \n Soyisminiz:"+ girilenSoyisim +
                "\nYasiniz:"+ girilenYas +
                "\n Kaydiniz Basariyle Tamamlanmıstır.");
    }
}
