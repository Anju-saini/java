import java.util.Scanner;
import java.awt.*;

public class prec_01 {
    public static void main(String[] args) {
        System.out.println("$$$$$$$$$$$$$$$persentage calculater$$$$$$$$$$$$$$$$$");
        System.out.println("total no of subject");
        Scanner sc = new Scanner(System.in);
        int sub = sc.nextInt();
        System.out.println("enter sub 1 ");
        int a = sc.nextInt();
        System.out.println("enter sub 2 ");
        int b = sc.nextInt();
        System.out.println("enter sub 3 ");
        int c = sc.nextInt();
        System.out.println("enter sub 4 ");
        int d = sc.nextInt();
        System.out.println("enter sub 5 ");
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        float averge = ((sum)*100)/500;
        System.out.println("persentage");
        System.out.println(averge);



    }
}
