package day26_forEachLoopConstructors;

public class C01_EnBüyükElementiBulma {
    public static void main(String[] args) {

//Arraydeki elementlerden en büyüğünü bulun
        int[]arr={3,5,7,9,8,4,12,36,45,89,-99};

        int enBüyükElement=arr[0];


        for (int each:arr
             ) {
            if (each>enBüyükElement){
                enBüyükElement=each;
            }
        }

        System.out.println("Arraydeki en büyük element: "+enBüyükElement );


    }
}
