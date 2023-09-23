package Gun03;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Pratik01 {
    public static void main(String[] args) {
        int fizik,kimya,matematik,muzik,turkce;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        matematik = inp.nextInt();

        System.out.print("Fizik Notunuzı Giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = inp.nextInt();

        int sonuc = fizik + kimya + matematik + muzik + turkce;
        double sonuc2= sonuc / 5;

        System.out.println("Ortalamanız : " + sonuc2);

        System.out.println(sonuc2 > 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");


    }
}
