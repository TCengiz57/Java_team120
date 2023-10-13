package day06_concatenation_matematikselOperatorler;

public class C04_Or_operatorur {
    public static void main(String[] args) {

        //or operatoru iyimserdir.Yani tek bir true bile yeterlidir.
        //And operatoru mükemmelliyetcidir.
        // or operatorunda tüm mantiksal ifadeler false ise sonuç false olur..

        System.out.println( 3>5|| 6>4);

        System.out.println(3<5||6>4);

        System.out.println(3<5||6<4);
        System.out.println(3>5||6<4);

        int sayi=24;
        System.out.println(sayi%3==0 || sayi%5==0);

        System.out.println(sayi>=0 || sayi>=100);
    }
}
