package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList();
        new ArrayList();
        System.out.println(isimler);
        isimler.add("Burhan");
        isimler.add("Seref");
        isimler.add("Gulsah");
        System.out.println(isimler);
        isimler.add(2, "Nergiz");
        System.out.println(isimler);
        isimler.add(1, "Omer");
        System.out.println(isimler);
        isimler.addAll(2, isimler);
        System.out.println(isimler);
        System.out.println(isimler.add("Eyup"));
        System.out.println(isimler);
    }
}
