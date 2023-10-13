package day09_nestedifelse_ternary;

import java.util.Scanner;

public class C04_ternary {
    public static void main(String[] args) {

        int input=20;

       // input%3==0? "3 ile tam bolunuyor" : "3 ile tam bolunmuyor";
        // bu soruda ternary bize bir string donduruyor.
        // bunu ya direk yazdırmalısınız
        //veya bir string variable atamalısınız.
        System.out.println(input%3==0? "3 ile tam bolunuyor" : "3 ile tam bolunmuyor");
        String sonuc=input%3==0? "3 ile tam bolunuyor" : "3 ile tam bolunmuyor";


    // verilen input cift sayi ise "cift sayi" yazdırın,
        // input tek sayi ise 2*input sonucunu veren nir ternary yazın.

        System.out.println(input % 2 == 0 ? "cift sayi" : 2 * input);


 /*
            Eger ternary'de true durumu ile false durumu
            bize farkli data turunde sonuclar donduruyorsa
            sonucu bir variable'a atayamayiz
            ama direk yazdirabiliriz
         */
    }
}
