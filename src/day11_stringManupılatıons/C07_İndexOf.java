package day11_stringManupılatıons;

public class C07_İndexOf {
    public static void main(String[] args) {

        String str="Ali topu at, at ali at";

        // Ali'nin indexi nedir? 0
        System.out.println(str.indexOf("Ali"));

        // at'ın index i nedir? 9
        System.out.println(str.indexOf("at"));

        //op' un indexi nedir? 5
        System.out.println(str.indexOf("op"));

        System.out.println(str.indexOf('a'));

        System.out.println(str.indexOf("a", 10));//13

        System.out.println(str.indexOf("yusuf"));// -1




    }
}
