package day14_forLoops;

import java.util.Scanner;

public class C04_forloop {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //         bu sayinin faktoryel degerini hesaplayin.
        //         Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner=new Scanner(System.in);
        System.out.println("20 den kucuk bir sayı giriniz");
        int sayı= scanner.nextInt();

        int carpım=1;

            for (int i = 1; i <=sayı; i++) {
                carpım*=i;

            }
            System.out.println("girilen sayı olan" + sayı+"! = "+carpım);

    }
}
