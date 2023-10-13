package day20_arrays;

import java.util.Arrays;

public class C01_arrayOlusturma {
    public static void main(String[] args) {

        int[] sayilar={2,4,6,8};//index

        String harfler[]={"a","b","c",};//index

        System.out.println(sayilar[1]);
        System.out.println(harfler[2]);

        String[] ogrenciList={"Talat","Seval","Ecrin","Selim"};

        System.out.println(ogrenciList[2]);

        //5 kişilik sınıf olusturun

        String[] sinifListesi1={null,null,null,null,};

        String[] sinifListesi2=new String[5]; //uzunluk 5

        /*Bir array olusturlurken 2 sey mutlaka belirtilmelidir.
        1-İçine koyulacak datalarin türü
        2-Array'ın uzunlugu(Bir array'a uzunlugundan daha fazla element
        konulamaz.
         */

        //Bir array  in tümünü nasil yazdirabiliriz?

        System.out.println(sayilar);//[I@1d251891
        
        // dongü ile yazdiralim.

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i]+" ");
            
        }// 2 4 6 8
        System.out.println(" ");

        //Arrayin tamamini yazdirmak isterseniz arrays classından hazır
        //methot kullanırız.

        System.out.println(Arrays.toString(sayilar));

        //forloop ile elementleri yazdırırız.
        // Arrays.toString methotu ise array ın kendisini yazdirir.

        System.out.println(Arrays.toString(harfler));

        System.out.println(Arrays.toString(sinifListesi1));
        System.out.println(Arrays.toString(sinifListesi2));

        int[]notlar=new int[4];
        System.out.println(Arrays.toString(notlar));

        boolean[] blList=new boolean[8];
        System.out.println(Arrays.toString(blList));




    }
}
