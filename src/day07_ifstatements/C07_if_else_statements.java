package day07_ifstatements;

import java.util.Scanner;

public class C07_if_else_statements {
    public static void main(String[] args) {
        // kullanicidan notunu isteyin
        //50 ve üzeri ise sinifi gecsin
        //degilse maalesef kaldin yazsin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not = scanner.nextDouble();

        if (not >= 50) System.out.println("Sinifi gectin");
        if (not <= 50) System.out.println("Maalesef kaldin");
        /*eger birsart icin sadece 2 durum söz konusu ise
        iki durumaayrı ayrı kontrol etmek yerine tek bir
        kontrol ilede yapabiliriz.

        Bagımısız if cumlelelrinden farklı olarak
        if else cumlelerinde ya if body si ya else body si calisir.
        İKİSİNİDE BİRDEN calısmasi mumkun olmadıgı gibi
        İKİSİNİNDE calısmaması mumkun degildir.
         */
        if (not >= 50) {
            System.out.println("Sinifi gectin");
        } else {
            System.out.println("Maalesef kaldin");
        }
    }
}
