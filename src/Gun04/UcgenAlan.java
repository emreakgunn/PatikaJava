package Gun04;
import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        int a,b,c,cevre,u,alan;
        Scanner inp = new Scanner(System.in);
        System.out.print("A Kenarını Giriniz : ");
        a = inp.nextInt();
        System.out.print("B Kenarını Giriniz : ");
        b = inp.nextInt();
        System.out.print("C Kenarını Giriniz : ");
        c = inp.nextInt();

        u = (a+b+c) / 2 ;
        cevre = 2*u;
        alan=u*(u-a)*(u-b)*(u-c);
        System.out.println(alan);


    }
}
