package day07_ifstatements;

public class C01_Bagimsiz_if_cumlelelri {
    public static void main(String[] args) {
         /*
            Bagimsiz if cumleleri
            isminden de anlasilacagi uzere
            kodun kalani ile ilgilenmez

            sadece boolean sarta odaklanir
            sartin sonucu true ise if body'si calisir
            bolean sartin sonucu false ise
            if body'si devreye girmez

            YANIII

            birden fazla bagimsiz if cumlesi olan bir kod calistiginda
            kac tane if body'sinin calisacagi verilen degerlere baglidir

            tum if body'leri calisabilir
            bazilari calisabilir
            ya da hic bir if body'si calismayabilir
                 */


        int a=20;
        int b=30;

        if (a>0){
            System.out.println("a sayisi pozitif");
        }

        if (a+b>100){
            System.out.println("sayilrin toplami100'den buyuk");// false oldugu icin yazdırmayacak.
        }

        if (b%3==0){
            System.out.println("b 3 ile bolunen bir tamsayidir");
        }

        if (b<100){
            System.out.println("b 100'den kucuk bir tamsyidir");
        }
    }
}
