package day19_scope;

public class C03_baskaClasstanClassVariablelaraUlasım {
    public static void main(String[] args) {


        System.out.println(C02_ClassLevelVariablelar.bls);
        System.out.println(C02_ClassLevelVariablelar.strs);
        System.out.println(C02_ClassLevelVariablelar.sayis);
        System.out.println(C02_ClassLevelVariablelar.chrs);


    C02_ClassLevelVariablelar obj=new C02_ClassLevelVariablelar();
        System.out.println(obj.bli);
        System.out.println(obj.stri);
        System.out.println(obj.sayii);
        System.out.println(obj.chri);

        System.out.println(obj.bls);
        System.out.println(obj.strs);
        System.out.println(obj.sayis);
        System.out.println(obj.chrs);


    }
}
