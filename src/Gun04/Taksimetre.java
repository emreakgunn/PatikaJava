package Gun04;
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        int kmyol;
        double ucret ,tutar,kmucret = 2.20,startPrice = 10;
        Scanner inp = new Scanner(System.in);

        System.out.print("Gideceğiniz Mesafeyi Giriniz : ");
        kmyol = inp.nextInt();

        ucret = (kmyol * kmucret) + startPrice;
        ucret = (ucret < 20) ? 20 : ucret;

        System.out.print("Ödeyeceğiniz Ücret : " + ucret);
    }
}
