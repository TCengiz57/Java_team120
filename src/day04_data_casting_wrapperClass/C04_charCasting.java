package day04_data_casting_wrapperClass;

import java.util.Scanner;

public class C04_charCasting {
    public static void main(String[] args) {
        // Kullanicidan bir char isteyin
        // girilen char'dan sonraki 3 karakteri yazdirin
        // Orn : input : a   output : b,c,d
        Scanner scanner=new Scanner(System.in);
        System.out.println( "Lutfen ascii tablosundan bir karakter giriniz");
        char girilenk = scanner.next().charAt(0);
        System.out.println("Girilen Karakter:"+girilenk);
        System.out.println("Girilen karakterden sonraki3 karakter:"+
                (char)(girilenk+1) +" ,"+
                (char)(girilenk+2) +","+
                (char)(girilenk+3));

    }
}
