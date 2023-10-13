package day13_StringManupilations_forloop;

public abstract class c02Replace {
    public static void main(String[] args) {
        String str="1Ja4va 8c9an5dı6r.";

        System.out.println(str = str.replace("1", ""));

        System.out.println(str.replaceAll("\\d", "" ));


      /*  Regex (Regular Expressions)
    \\s : space     \\S : space olmayan hersey
    \\s+ : yanyana birden fazla space
    \\d : digits        \\D : digit olmayan hersey
    \\w : harf veya rakam   \\W : harf veya rakam olmayan hersey

       */

    }


}
