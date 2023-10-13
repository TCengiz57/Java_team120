package day09_nestedifelse_ternary;

import java.util.Scanner;

public class C08_switchStatements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen yazdirmak istediginiz ayın numarasi giriniz");
        int ayNo= scanner.nextInt();

        if (ayNo==1) System.out.println("ocak");
        else if (ayNo==2) System.out.println("Subat");
        else if (ayNo==3) System.out.println("mart");
        else if (ayNo==4) System.out.println("nisan");
        else if (ayNo==5) System.out.println("mayis");
        else if (ayNo==6) System.out.println("haziran");
        else if (ayNo==7) System.out.println("temmuz");
        else if (ayNo==8) System.out.println("agustos");
        else if (ayNo==9) System.out.println("eylül");
        else if (ayNo==10) System.out.println("ekim");
        else if (ayNo==11) System.out.println("kasim");
        else if (ayNo==12) System.out.println("aralik");
        else System.out.println("ay numarasi degil");

        System.out.println("*************************");


        switch (ayNo){

            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziraz");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasim");
                break;
            case 12:
                System.out.println("arlik");
                break;

            default:
                System.out.println("Ay numarasi yanlis");

        }

    }
}
