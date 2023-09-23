package Gun02;

public class İntergerVeri {
    public static void main(String[] args) {

        int numberOne = 10;
        numberOne = 6;   // Bu şekilde değişkenin değerini değiştiriyoruz.
        System.out.println(numberOne);

        int toplam = 1,toplam2 = 3,toplam3 =12 ;
        toplam3 = toplam + toplam3;
        System.out.println(toplam3);     // verileri beraber toplama işlemi yaparak değer yapılabilir.

        int kisakenar = 10, uzunkenar = 20;
        int alan = kisakenar * uzunkenar;
        int cevre = 2 * (kisakenar+uzunkenar);
        System.out.println(alan);
        System.out.println(cevre);
    }
}
