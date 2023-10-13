package day11_stringManupılatıons;

import java.util.Scanner;

public class C02_length {
    public static void main(String[] args) {

        String isim="Ramazan Uzunkavaklaraltındayataruyumazoglu";
        //Son harfi yazdırın

        System.out.println("isim uzunlugu:" + isim.length());
        System.out.println("Son harf:" + isim.charAt(isim.length()-1));

        //sondan 5. hARF
        System.out.println(isim.charAt(isim.length()-5));

        //kullanıcıdan ismini alın
        //ve ortadaki harfi yazdırın
        //ismin uzunlıgı çift sayı ise orta kısımdaki 2. harfi yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isminizi yazınız");
        String isim1=scanner.nextLine();

        int uzunluk=isim1.length();

        if (uzunluk % 2 == 0){ // uzunluk ciftse
            System.out.println("Uzunluk ciftse, ortadaki ikinci harf : " +
                  isim1.charAt(uzunluk/2 -1)+
                 isim1.charAt(uzunluk/2));
        }else { // uzunluk tekse
            System.out.println("Uzunluk tekse, ortadaki harf : " + isim1.charAt((uzunluk - 1) / 2));
        }

    }
}
