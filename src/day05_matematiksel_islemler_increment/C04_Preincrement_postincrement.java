package day05_matematiksel_islemler_increment;

public class C04_Preincrement_postincrement {
    public static void main(String[] args) {

// java da  birönceki classta yaptığımız gibi
// artırmaa ve atama veya artırma ve yazdırna beraber olabililr.

        int a=20;
        int b=10;
        System.out.println(b=2*a);  // 40

        System.out.println(a=b-5); //35

        a =10;
        b=a++;

        System.out.println("a:"+a +"b:"+b);

        // önce a nın değerini 1 arttırın sonra b ye atayın.
        b=++a;
        System.out.println("a:"+a +"b:"+b);


        /* bu kullanım sadece a++,a--, ++a,--a için geçerlidir.
         burada ++ veya -- öncemi sonramı kullanacağımıza bizden istenen
        duruma göre karar veririz.
        arttırma önce ise ++a
        artırma sonra ise a++
     */
        a=20;

        System.out.println(a++);  //20
        System.out.println(a);  //21


   a=20;
        System.out.println(--a);
        System.out.println(a);



    }
}
