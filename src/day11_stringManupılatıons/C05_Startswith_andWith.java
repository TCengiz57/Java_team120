package day11_stringManupılatıons;

public class C05_Startswith_andWith {
    public static void main(String[] args) {

        String str= "Java cok guzel";

        // str Java ile mi baslıyor?
        System.out.println(str.startsWith("Java"));

        //str J ile baslıyor.

        System.out.println(str.startsWith("J"));


        //str Ja ile baslıyor
        System.out.println(str.startsWith("Ja"));


        //str "Java cok guzel ile mi baslıyor?

        System.out.println(str.startsWith("Java cok guzel"));

        System.out.println(str.startsWith(" "));

        //5.indexten sonrası c ile mi başlar*

        System.out.println(str.startsWith("c" , 5));

        //6. indexten sonrası ok ile mi baslar?

        System.out.println(str.startsWith("ok" ,6));


    }
}
