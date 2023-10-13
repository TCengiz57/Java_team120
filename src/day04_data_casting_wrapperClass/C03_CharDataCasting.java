package day04_data_casting_wrapperClass;

public class C03_CharDataCasting {
    public static void main(String[] args) {
        /*char data turu ozel bir data turudur
        her ne kadar char data turu
        '' icerisinde sayi,harf,ozel karakter alsa da
        ascii tablosundaki sayisal degerleri de kullanabilir
        ayni sekilde
        char data turundeki bir variable'i
        matematiksel islemde kullanirsaniz
        ascii tablosundaki degeri ile matematiksel isleme girer*/


        char ch1='a';
        int sayi1=ch1;
        System.out.println("ch1:"+ch1);

        System.out.println("ch1:"+sayi1);

        String str1="java";
        String str2=" ";
        String str3= "Candir";
        System.out.println(str1+str2+str3);

        char ch2='a';
        char ch3='b';
        System.out.println(ch2 + ch3);

        int karakter=255;
        char ascidegeri=(char) (karakter);
        System.out.println("Verile degeri ascii " +
                "tablosundaki karsiligi:"+ascidegeri);



    }

}
