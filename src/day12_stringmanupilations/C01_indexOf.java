package day12_stringmanupilations;

public class C01_indexOf {
    public static void main(String[] args) {
        String str = "Ali topu at, topu at ali ";

        // ilk top kelimesinin indexini yazdeırın

        System.out.println(str.indexOf("top"));

        //ikinci top metin parcasının indexi yazdırın

        System.out.println(str.indexOf("top", 5));

        System.out.println(str.indexOf("top", str.indexOf("top") + 1));

        // at kelimesinin 2 kere kullanılıp kullanılmadıgını metnebakmadan bulun

        int ilkIndex = str.indexOf("at"); // ya -1 veya sıfır veya buyuk sayı olur

        if (ilkIndex == -1) { //hiç kullanılmamış
            System.out.println("2 kerekullanılmamış");

        } else { // en az bir kere kullanılmış.


            int ikinciİndex = str.indexOf("at", ilkIndex + 1);

            // ikinci defa kullanımışsa doğal sayı olur.

            if (ikinciİndex == -1) {// sadece 1 kere kullanılmış. kullanım yok
                System.out.println("2. kere kullanılmamış");

            } else {
                System.out.println("2 defa veya daha fazla kullanılmış");
            }
        }
    }

}
