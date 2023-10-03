package Gun04;
import java.util.Scanner;
public class Dairealan {
    public static void main(String[] args) {
        int r ;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yarıçap Değerini Giriniz : ");
        r =inp.nextInt();

        double alan = r * r * pi;
        System.out.println("Dairenin Alanı : " + alan);

        double cevre = 2*(r * pi);
        System.out.println("Dairenin Çevresi : " + cevre);
    }
}
