package day31_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        //Kullanıcının verdiği doğum tarihine göre
        //Kullanıcının yasını yıl ve ay olarak yazdıran birprogram hazırlayın.

        LocalDate dogumTarihi=LocalDate.of(1980, 07,12);
        LocalDate bugun=LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun));
    }
}
