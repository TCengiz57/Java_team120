package day17_methotOlusturmaAndMethotOverLoading;

import java.util.Scanner;

public class C02_TamBolenlerSayısınıBulma {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayı giriniz");
        int sayi= scanner.nextInt();

        System.out.println(tamBolenlerSayisi((sayi)));


    }

    public static int tamBolenlerSayisi(int sayi){

        int sayac=0;

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                sayac++;
            }
        }

        return sayac;
    }

}
