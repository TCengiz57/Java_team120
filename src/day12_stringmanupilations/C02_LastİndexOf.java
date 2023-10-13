package day12_stringmanupilations;

public class C02_LastİndexOf {
    public static void main(String[] args) {

        String str="Javayi ögrenecegiz, baska yolu yok";
        //a harfinin ilkkullanım indexi

        System.out.println(str.indexOf('a'));
        //a harfinin son kullanım indexi

        System.out.println(str.lastIndexOf('a'));

        //j harfinin ilkkullanım indexi
        System.out.println(str.indexOf('J'));
        //J harfinin son kullanım indexi

        System.out.println(str.lastIndexOf('J'));

        //Metne bakmadan e harfinin 2 veya daha fazla kullanılıp
       // kullanılmadıgını yazdırın.

        int ilkİndex=str.indexOf('e');
        int Sonİndex=str.lastIndexOf('e');

        if (ilkİndex == -1) {

            System.out.println("Hiçkullanılmamıs");

        }else if (ilkİndex==Sonİndex){
            System.out.println("sadece 1 kere kullanılmış");

        }else {
            System.out.println("2 veya daha fazla kullanılmış");
        }

        // "Javayi ogrenecegiz, baska yolu yok";
        // o harfinin son index'ini yazdirin
        System.out.println(str.lastIndexOf("o")); // 32
        // o harfinin son kullanimindan bir onceki kullaniminin index'ini yazdirin
        System.out.println(str.lastIndexOf("o", 31)); // 27
        // k harfinin son kullaniminin indexini yazdiralim
        System.out.println(str.lastIndexOf('k')); // 33
    }
}
