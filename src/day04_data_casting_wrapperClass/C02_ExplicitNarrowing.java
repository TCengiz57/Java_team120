package day04_data_casting_wrapperClass;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {
        double dbl1=123.6;
        int sayi1=(int)dbl1;
        System.out.println("sayi1:"+sayi1);

        byte by1=(byte) sayi1;
        System.out.println("by1:"+ by1);

        int sayi2=130;
        byte by2=(byte)sayi2;
        System.out.println("by2:"+ by2);

        int sayi3=2568;
        byte by3=(byte) sayi3;
        System.out.println("by3:"+by3);

    }
}
