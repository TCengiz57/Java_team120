package day15_netedForLoop;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {
       /*
       *
        *  *
        *  *  *
        *  *  *  *
        *  *  *  *  *

        */


        Scanner scanner=new Scanner(System.in);
        System.out.println("olusturulacak seklin satir sayisini giriniz");
        int satir = scanner.nextInt();
        System.out.println("olusturulacak seklin sutun sayisini girin");
        int sutun = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");

            }
            System.out.println("");
        }

    }
}
