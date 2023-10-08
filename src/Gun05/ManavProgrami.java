package Gun05;
import java.util.Scanner;
public class ManavProgrami {
    public static void main(String[] args) {

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5.00;

        double armutk,elmak,domatesk,muzk,patlıcank,toplam;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kilo Giriniz : ");
        armutk = inp.nextDouble();
        System.out.print("Elma Kilo Giriniz : ");
        elmak = inp.nextDouble();
        System.out.print("Domates Kilo Giriniz : ");
        domatesk = inp.nextDouble();
        System.out.print("Muz Kilo Giriniz : ");
        muzk = inp.nextDouble();
        System.out.print("Patlıcan Kilo Giriniz : ");
        patlıcank = inp.nextDouble();

        toplam = (armut*armutk) + (elma*elmak) + (domates*domatesk) + (muz*muzk) + (patlıcan*patlıcank);

        System.out.print("Toplam Tutar : " + toplam + "TL");


    }
}
