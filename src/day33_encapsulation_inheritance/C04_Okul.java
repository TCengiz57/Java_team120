package day33_encapsulation_inheritance;

public class C04_Okul {

   private String okulAdi="Yildiz Koleji";
   private int ogrenciSayisi=234;

   public  String okulAdresi="Ankara";


    /* Bazı developerlar erişim yetkisini sınırlamak için değil
    yapılan işe vurgu olması için getter ve setter kullanabilirler.
    Bu uygulamanın tek artısı yapılan işleme vurgu yapmasıdır.
     */

    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }
}
