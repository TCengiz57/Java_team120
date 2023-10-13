package day16_methotOlusturma_kullanma;

public class c04_BaskaClastakiMethotuKullanma {
    public static void main(String[] args) {

        C01_MethotOlusturma.altString("Method",1,3); // et

        System.out.println(C03_MethotOlusturma.isimDuzenle("bugra", "CAN")); // Bugra Can

        String isimDuzenli = C03_MethotOlusturma.isimDuzenle("mehmet","kemal");

        // duzenlenis ismin uzunlugunu yazdirin

        System.out.println(isimDuzenli.length());
      /*
        Void olan method'da sonucu KAYDEDEMEYIZ, sadece yazdiririz
        bize deger DÖNDÜREN method'da ise sonucu
        istersek direk yazdirir, istersek de kaydederiz
       */
    }
}
