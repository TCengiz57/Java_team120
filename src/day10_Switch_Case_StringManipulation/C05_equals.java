package day10_Switch_Case_StringManipulation;

public class C05_equals {
    public static void main(String[] args) {

        String str1="Mehmet";
        String str2="MEHMET";
        String str3="mehmet";
        String str4="MEhmet";

        System.out.println(str1==str2); //false

        System.out.println(str3==str4.toLowerCase());//false

        System.out.println(str2==str3.toUpperCase());//false

        /*
        Stringlerde == beklediğimiz sonucları DÖNMEYEBİLİR
        Bunun sebebi String Classını olustururken yapılan bazı özelliklerdir.Bu
        konu ileride detaylı bir sekilde anlatılacaktır.

        Verilen iki stringin metinsel olarak aynı olup olmadığını kontrol etmek
        için == yerine equals() kullanılır.

        EQUALS () birebir aynı olan iki metin için true farklı metinler için
        false sonucu uretir.(döndürür).
        bu karşılastırmada metnin aynı oması yanında buyuk kucuk harf durumunu da
        kontrol eder.(case sensıtıve)
        eger case sensitive olmadan metinleri karşılastımak isterseniz
        equalsIgnoreCase() kullanılır.


         */
        System.out.println(str1.equals(str2));//Mehmet -- MEHMET false

        System.out.println(str3.equals(str4.toLowerCase()));//mehmet==mehmet true

        System.out.println(str2.equals(str3.toUpperCase()));//MEHMET==MEHMET TRUE

        System.out.println(str1.equalsIgnoreCase(str2)); //Mehmet__MEHMET TRUE
        System.out.println(str3.equalsIgnoreCase(str4));//mehmet__MEhmet true
    }
}
