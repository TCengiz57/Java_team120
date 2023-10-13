package day09_nestedifelse_ternary;

import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Scanner;

public class C06_ternary {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin


        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double sayi1= scanner.nextDouble();
        double sayi2= scanner.nextDouble();

        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);
    }
}
