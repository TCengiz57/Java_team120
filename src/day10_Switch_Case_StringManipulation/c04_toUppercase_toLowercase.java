package day10_Switch_Case_StringManipulation;

import java.util.Locale;

public class c04_toUppercase_toLowercase {
    public static void main(String[] args) {
        String str="Java Candır";
        System.out.println(str.toUpperCase());//JAVA CANDIR
        str=str.toUpperCase(); //JAVA CANDIR

        System.out.println(str.toLowerCase());//java candır

        //eger yerelbir dile göre büyük kucuk harf degişimi yapmak istersek
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));//java candır

    }
}
