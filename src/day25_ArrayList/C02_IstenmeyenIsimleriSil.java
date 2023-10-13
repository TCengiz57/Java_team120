package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_IstenmeyenIsimleriSil {
    public C02_IstenmeyenIsimleriSil() {
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"Mehmet", "Ramazan", "Ozan", "Berk", "Nergiz", "Ayfer", "Bugra"};
        List<String> isimler = new ArrayList();

        for(int i = 0; i < arr.length; ++i) {
            isimler.add(arr[i]);
        }

        System.out.println("isimler listesi : " + isimler);
        System.out.println(istenmeyenleriSil(isimler, "a"));

    }

    public static List<String> istenmeyenleriSil(List<String> isimler, String istenmeyenHarf) {
        List<String> yeniList = new ArrayList();

        for(int i = 0; i < isimler.size(); ++i) {
            if (!((String)isimler.get(i)).contains(istenmeyenHarf)) {
                yeniList.add((String)isimler.get(i));
            }
        }

        return yeniList;
    }
}
