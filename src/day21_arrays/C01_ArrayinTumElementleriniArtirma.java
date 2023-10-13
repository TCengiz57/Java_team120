package day21_arrays;

import java.util.Arrays;

public class C01_ArrayinTumElementleriniArtirma {
    public static void main(String[] args) {

        //Bir arrayin tum elementlerini 2 artırıp bize donduren bir
       // methot olusturun.arrayı yeni haliyle kaydedin.
        int[]arr={3,4,6,8,1};

        arr=arrayElementlerini2Artir(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[]arrayElementlerini2Artir(int[]arr){

        for (int i = 0; i < arr.length ; i++) {

            //arr[i]=arr[i]+2;
            arr[i]+=2;

        }

        return arr;
    }

}
