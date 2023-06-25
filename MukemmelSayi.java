import java.util.Scanner;
// kullanıcıdan alınan sayının mükemmel sayı olup olmadığını kontrol eeden program
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        int toplama = 0;
        System.out.println("Bir Sayı Giriniz : ");
        int sayi = veri.nextInt();
        for (int i = 1 ; i<sayi ; i++) {
            int sonuc = sayi%i ;
            if (sonuc==0) {  toplama = toplama + i ; }
        }
        if (toplama==sayi) {
            System.out.println(sayi + " Bir Mükemmel Sayıdır");
        }
        else System.out.println(sayi + " Bir Mükemmel Sayı Değildir");
    }
}
