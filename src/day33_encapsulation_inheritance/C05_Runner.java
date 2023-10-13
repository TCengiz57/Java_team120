package day33_encapsulation_inheritance;

public class C05_Runner {
    public static void main(String[] args) {
        C04_Okul okul=new C04_Okul();

        System.out.println(okul.getOkulAdi());

        okul.setOkulAdi("Java Koleji");
        System.out.println(okul.getOkulAdi());

        System.out.println(okul.okulAdresi);
        okul.okulAdresi="Ankara/Çankaya";

        System.out.println(okul.okulAdresi);
    }


}
