package day16_methotOlusturma_kullanma;

public class C02_baskaClasstanMethotOlusturma {
    public static void main(String[] args) {

        C01_MethotOlusturma.altString("Bu is cok guzel", 3,10); // is cok
        System.out.println(C03_MethotOlusturma.isimDuzenle("bugra", "CAN"));

        // C01_MethodOlusturma.altString('m',"ali",true);
        /*
            Bir method call sirasinda yazdigimiz degerlere ARGUMENT
            method deklarasyonundaki parantez icindeki variable'lara PARAMETRE denir
            public static void altString(String metin, int basIndex, int bitIndex ) parametre
            C01_MethodOlusturma.altString('m',"ali",true); argument
            String metin = 'm';
            int basIndex = "ali";
            int bitIndex = true;
            argument'ler ile parametreler uyumlu olmazsa java CTE (altini kirmizi cizer) verir
         */
    }

}
