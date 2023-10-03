package Gun04;
import java.util.Scanner;
public class HipotenusProgram {
    public static void main(String[] args) {
        int a,b;
        double hipo;
        Scanner inp = new Scanner(System.in);
        System.out.print("A Kenarının Uzunluğunu Giriniz : ");
        a = inp.nextInt();
        System.out.print("B Kenarının Uzunluğunu Giriniz : ");
        b = inp.nextInt();

        hipo = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüs Değeri : " + hipo);
    }
}
