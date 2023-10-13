package day06_concatenation_matematikselOperatorler;

public class C03_And_operatorur {
    public static void main(String[] args) {

        System.out.println(5>3 && 6>4);

        System.out.println(5<3 && 6>4);

        System.out.println(5>3 && 6<=4);

        System.out.println(5<=4 && 6<=4);

        // AND operatoru ile baglanan Boolen ifadeler kaç tane olursa olsun
        // hepsi true ise sonuç true dur.Bir tane dahi false varsa sonuç false dır.

    int sayi= 24;

        System.out.println(sayi%2 == 0 && sayi%3==0 && sayi%5 ==6);

    }
}
