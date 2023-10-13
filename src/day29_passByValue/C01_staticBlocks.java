package day29_passByValue;

public class C01_staticBlocks {

    C01_staticBlocks(){

        System.out.println("Parametresiz constructor calisti");
    }

    public static void main(String[] args) {

        System.out.println("main methot calısti");
        C01_staticBlocks obj=new C01_staticBlocks();
        System.out.println("obje olusturuldu");
    }
    static {
        System.out.println("static blok calisti");//2 static blok varsa önce yukarıdaki calışır.
    }
    static {
        System.out.println("static blok 2 calisti");
    }
    {
        System.out.println("static olmayan blok calisti");
        // obje olusturuldugunda calişir.
    }
}
