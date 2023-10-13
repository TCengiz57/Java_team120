package day21_arrays;

import java.util.Arrays;

public class C06_baskaClasstanMethotKullanma {
    public static void main(String[] args) {

        int[] arr = {2,4,6,8};
        System.out.println("eski array : " + Arrays.toString(arr)); // eski array : [2, 4, 6, 8]

        arr =C02_arrayElementleriniistenenKadarArtirma.elementleriArtir(arr,4);
        System.out.println("yeni array : " + Arrays.toString(arr)); // yeni array : [6, 8, 10, 12]
        System.out.println(C03_pozitifElementleriTopla.pozitifElementleriTopla(arr)); // 36
        C04_elementSay.elemanSay(arr,6); // method void oldugu icin bizim sout yapmamiza gerek yok
        // kullanicidan deger alarak int[] olusturmak istiyorum
        int[] kullaniciArrayi = C05_arrayOlustur.arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));
    }
}
