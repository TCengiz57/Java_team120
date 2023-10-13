package day11_stringManupılatıons;

public class C04_Contains {
    public static void main(String[] args) {

        String str="Javagun gectikce guzellesiyor";
        // str java iceriyor mu?

        System.out.println(str.contains("Java"));

        //str java icerir mi?
        System.out.println(str.contains("java"));

        //str a icrir mi?

        System.out.println(str.contains("a"));

        /*** contains metodu aranan metnin sayısıyla ilgilenmez.
         sadece var veya yoksonucu döndürür.
         */

    }
}
