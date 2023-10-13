package day31_DateTime;

public class c06_VarargsKurallar {
    public static void main(String[] args) {
        //Kullanıcı kac tane argument verirse versin ilk element hariç
        //diğer elementleri toplayıp
        //bulunan toplamı ilk element ile çarpıp sonucu yazdıran bir methot
        //yazdırın.

        islemYap(3,4,5);
        islemYap(2,4,7,8,1,9);

    }

    public static void islemYap(int ilkSayi, int ...kalanlar) {
    int toplam=0;
        for (int eachSayi:kalanlar
             ) {
            toplam+=eachSayi;

        }
            int sonuc=ilkSayi * toplam;
        System.out.println("İstenen işlemin sonucu :"+ sonuc);
        }

        /* Varargs sinirisiz sayıda element alabildiğinden
        gelen her elemani alacaktır.
        Bu ozelliğinden dolayı varargs bir methotta parametre olarak kullanılacaksa
        SON PARAMETRE olarak yazılmak zorundadır.
        Bu kuralın doğal sonucu olarak bir methotta birden fazla varargs
        parametre olamaz.
         */
    }

