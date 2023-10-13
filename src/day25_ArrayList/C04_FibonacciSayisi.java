package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_FibonacciSayisi {
    public C04_FibonacciSayisi() {
    }

    public static void main(String[] args) {
        System.out.println(fibonacciListesiOlustur(26));
    }

    public static List<Integer> fibonacciListesiOlustur(int fibonacciSayiAdedi) {
        List<Integer> fibonacciSerisi = new ArrayList();
        int ilk = 0;
        int ikinci = 1;
        if (fibonacciSayiAdedi <= 0) {
            System.out.println("Lutfen giciklik yapmayiniz");
            return fibonacciSerisi;
        } else if (fibonacciSayiAdedi == 1) {
            fibonacciSerisi.add(ilk);
            return fibonacciSerisi;
        } else {
            fibonacciSerisi.add(ilk);
            fibonacciSerisi.add(ikinci);

            for(int i = 1; i <= fibonacciSayiAdedi - 2; ++i) {
                fibonacciSerisi.add(ilk + ikinci);
                int temp = ilk + ikinci;
                ilk = ikinci;
                ikinci = temp;
            }

            return fibonacciSerisi;
        }
    }
}
