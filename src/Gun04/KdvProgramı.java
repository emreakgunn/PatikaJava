package Gun04;
import java.util.Scanner;

public class KdvProgramı {
    public static void main(String[] args) {
        double tutar,kdvOran;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = inp.nextDouble();

        kdvOran = tutar < 1000 ? 0.18 : 0.8;
        double kdvtutar = tutar * kdvOran;
        double toplamkdv = tutar + kdvtutar;

        System.out.println("Kdvsiz Fiyat : " + tutar);
        System.out.println("Kdvli Fiyat : " + toplamkdv);
        System.out.println("Kdv Tutarı : " + kdvtutar);
        System.out.println("Kdv Oranı : " + kdvOran);


    }
}
