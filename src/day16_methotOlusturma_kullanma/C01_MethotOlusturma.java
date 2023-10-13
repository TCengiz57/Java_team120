package day16_methotOlusturma_kullanma;

public class C01_MethotOlusturma {

  /*  Soru 1- Kullanicidan input olarak verilen bir String,
  baslangic ve bitis indexlerine gore baslangic index’i dahil,
  bitis index’i  haric olacak sekilde aradaki harfleri yazdiran
   bir method olusturun.

    - kullanici baslangic degeri olarak,
     bitis degerinden buyuk bir sayi girerse, hata mesaji verin
      - kullanici str’da olan index’lerden daha buyuk bir index
       girerse hata mesaji yazdirin.
   */

       public static void main(String[]args){
           altString("Java guzeldir",3,7);
           altString("Biraz sabır",5,4);
           altString("bu da mı gol degil",11,33);


           String str="Aramız bozulmasın";
           altString(str,5,10);

       }//main method sonu

       public static void altString(String metin,int basIndex, int bitIndex){
          if (basIndex>bitIndex){
              System.out.println("Baslangıç index'i bitiş indexinden büyük olamaz");
          } else if (basIndex>=metin.length() || bitIndex>=metin.length()) {
              System.out.println("Verilen index sınırların dısında");

          }else {

              for (int i =basIndex; i <bitIndex ; i++) {
                  System.out.print(metin.charAt(i));

              }
          }
           System.out.println("");
       }

}// class sonu

