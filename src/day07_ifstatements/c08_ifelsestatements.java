package day07_ifstatements;

import java.util.Scanner;

public class c08_ifelsestatements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");
        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3= scanner.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar2>0){
            System.out.println("Eskenar ucgen");

        }else {
            System.out.println("Eskenar ucgen degil");
        }
    }
}
