package day15_netedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {
  /*
        Kullanicidan satir sayisi olarak bir rakam alin
        ve asagidaki gibi bir sekil cizdirin
        *
        *  *
        *  *  *
        *  *  *  *
        *  *  *  *  *
         */

        int satir = 5;
        int sutun = 7;


        for (int i = 1; i <=satir ; i++) { //satır

            for (int j = 1; j <=sutun ; j++) {//sutun
                System.out.print(i+" ,"+j+"     ");
            }
            System.out.println("");
        }

        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(i+","+j+"   ");

            }
            System.out.println("");
        }



            }
        }



