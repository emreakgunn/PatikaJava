package Gun05;
import java.util.Scanner;
public class BoyEndeksProgrami {
    public static void main(String[] args) {

        double boy,kilo,endeks;
        Scanner inp =new Scanner(System.in);

        System.out.print("Kilonuzu Giriniz : ");
        kilo =inp.nextDouble();

        System.out.print("Boyunuzu Giriniz : ");
        boy = inp.nextDouble();

        endeks = kilo / (boy * boy);
        System.out.print("Vücut Endeksiniz : " + endeks);


    }

}
