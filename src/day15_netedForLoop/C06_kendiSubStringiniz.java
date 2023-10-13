package day15_netedForLoop;

public class C06_kendiSubStringiniz {
    public static void main(String[] args) {

        String str="Java Candır";
        int baslangic=3;
        int bitis=7;

        /*
        1-bitis degeri baslangıctan kucukse hata mesajı yazdırın
        2-baslangıc veya bitis degerleri index degerleri ile uyusmuyorsa
        hata mesajı verin
        3-degerler uygunsa baslangıc indexinden (dahil) bitis indexine(hariç)
        kadar
         */

        if (baslangic>bitis){
            System.out.println("baslangıc degeri bitis degerinden buyuk olamaz");

        } else if (baslangic<0 || bitis<0 || baslangic>=str.length() ||bitis>=str.length()) {
            System.out.println("indexler hatalı");

        }else {
            for (int i = baslangic ; i < bitis; i++) {
                System.out.print(str.charAt(i));
            }
            System.out.println("");
        }

        System.out.println(str.substring(baslangic,bitis));

        str.substring(5);
        /*
            Bu method bize "Candir" döndürür
            ancak
            yazdırmazsak veya bır variable'a atamazsak
            bu method'un dondurdugu sonuc bir ise yaramaz
         */

        String strIstenenBolum = str.substring(5); // kaydeder ama yazdirmaz
        System.out.println(str.substring(5)); // yazdirir ama kaydetmez


    }


}
