package day32_StringBuilder;

public class C06_Runner {
    public static void main(String[] args) {


        C05 obj = new C05();

       // System.out.println(PrivateSayi);

        System.out.println(obj.defaultSayi);
        obj.defaultSayi=20;
        System.out.println(obj.defaultSayi);

        System.out.println(obj.protectedSayi);
        obj.protectedSayi=30;
        System.out.println(obj.protectedSayi);

        System.out.println(obj.publicSayi);
        obj.publicSayi=40;
        System.out.println(obj.publicSayi
        );


    }
}