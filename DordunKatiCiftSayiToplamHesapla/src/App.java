// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int deger, toplam = 0;

        // Tek sayı girene kadar döngüye sokup değer alıyoruz
        do {
            // Kullanıcıdan değer alıyoruz
            System.out.print("Değer girin: ");
            deger = degerAl.nextInt();

            // 4'ün katı ve çift ise toplama ekliyoruz
            toplam += deger % 4 == 0 && deger % 2 == 0 ? deger : 0;
        } while (deger % 2 == 0);

        // 4'ün katı ve çift sayıların toplamını ekrana yazıyoruz
        System.out.println("4'ün katı ve çift sayıların toplamı: " + toplam);
        
        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
