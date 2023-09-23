package Gun02;

public class AtamaOperator {
    public static void main(String[] args) {
        //  int a = 7;
        //  int b = a;

        /*

        int a = 7 , b =  1 ;
         b = b + a;
        System.out.println(b);     // baya saçma bir olay aynı değeri değişiriyoruz.

         */

        int x = 1, y = 2 ,r = 3;
        r *= x + y ;
        System.out.println(r);     // 9 çıktısı alınıyor.

        //  boolean sonuc = ( 1 == 5);
        //  System.out.println(sonuc);

        /*

        int a = 5, b = 5 , c = 6;
        boolean kosul1 = (a == c);
        boolean kosul2 = (a >= b);
        boolean sonuc = (kosul1||kosul2);
        boolean sonuc2 = ((a == c) || (a >= b));   // Hepsini tek kodda yazmak için.
        String str = sonuc ? "Doğru" : "Yanlış";    // Farklı bir şekilde çıktı almak için kod.
        System.out.println(str);
        System.out.println(sonuc2);

         */

        int a = -12 , b = -5 ;
        int sonuc = a%b;            // kalan hesaplama
        System.out.println(sonuc);


    }
}
