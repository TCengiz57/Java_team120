package day05_matematiksel_islemler_increment;

public class C03_İncrement_Decrement {
    public static void main(String[] args) {
        int sayi= 10;
        //sayi variablenın değerini 2 katının
        //5fazlası yapınız

        sayi= 2 * sayi +5;
        System.out.println(sayi);
        sayi=10;
        sayi*=2;
        sayi+=5;
        System.out.println(sayi);

        sayi=10;
        sayi*=3;
        sayi-=3;
        sayi/=3;
        System.out.println(sayi);

        int a=10;
        //a yı degerini yeni olusturduğumuz b ye atayıp sonra da a nın
        // değerini 1 arttırun.
        // a ve b yi yazdırın

        int b= a;
        a++;
        System.out.println("a:"+a +"b:"+b);

        // a nın değerini 1 arttırın.sonra a nın değerini  b ye atayın.
        a=10;
        a++;
        b=a;
        System.out.println("a:"+a +"b:"+b);



    }
}
