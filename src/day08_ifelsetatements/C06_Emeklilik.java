package day08_ifelsetatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz");
        char cinsiyet= scanner.next().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas= scanner.nextDouble();


        if (cinsiyet== 'E' && yas>=65){
            System.out.println("Erkek emekli olabilir");
        } else if (cinsiyet=='E' && yas<=65 ) {
            System.out.println("Erkek emekli olamaz "+(65-yas) + "yil daha calısmalısınız");

        } else if (cinsiyet=='K' && yas >=60) {
            System.out.println("Kadin emekliolabilir");


        } else if (cinsiyet=='E'&& yas<=60) {
            System.out.println("Kadin emekli olamaz"+(60-yas)+"yil daha calısmalısız");

        }
    }
}
