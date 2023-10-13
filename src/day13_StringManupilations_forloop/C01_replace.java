package day13_StringManupilations_forloop;

public class C01_replace {
    public static void main(String[] args) {

        String str="Javayı anlıyorum ama yazamıyorum";

        //var olan bir Stringin istediğimiz bolumunu degiştirebiliriz.

        System.out.println(str.replace('J', 'T'));
    //Tavayı anlıyorum......
        System.out.println(str.replace('a', '*'));
    // J*v* *.........
        System.out.println(str.replace("ama yazamıyorum", "ve yazabiliyorum"));
    //.........yazabliyorum

        System.out.println(str.replace("Java", "AA"));
    // AAyı anlıyorum ...........
    }
}
