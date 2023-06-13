// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int sayi;

        System.out.print("Bir sayı giriniz: ");
        sayi = degerAl.nextInt();

        // Yıldız(*) ile ters üçgen yapıyoruz
        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            for (int k = 2 * sayi - 1; k >= (2 * i + 1); k--) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
