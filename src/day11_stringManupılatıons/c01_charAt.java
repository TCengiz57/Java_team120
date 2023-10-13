package day11_stringManupılatıons;

public class c01_charAt {
    public static void main(String[] args) {
        String str="java candır";

        //ilk harfi yazdırın
        System.out.println(str.charAt(0));

        //7.harfi yazdırın
        System.out.println(str.charAt(6));

        //bu metnin uzunluğu
        //son harfi yazdırın
        System.out.println(str.charAt(11-1));
        //sondan ücüncü harf yazdırın

        System.out.println(str.charAt(11-3));

        //eger sondan başa doğru gelecek sekilde bir char isteniyorsa
        //charAt(uzunluk-sondankacıncı karakter)
        // metnin uzunlugundan daha buyuk bir sıradaki karakter istenirse
        //çalışmaz

        //4. harfi yazdırın

        System.out.println(str.toUpperCase().charAt(3));

         /*
            charAt()'u bize char data turunde bir sonuc verir (döndürür)
            toUpperCase() gibi method'lar String variable'lar ile calistigindan
            charAt() calistiktan sonra String Manipulation YAPILAMAZ
            eger manipulation ihtiyaci varsa, charAt() kullanilmadan once yapilmalidir

         */


    }
}
