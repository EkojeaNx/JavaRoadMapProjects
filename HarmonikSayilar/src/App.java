// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int sayi;
        double sonuc = 0.0;

        // Kullanıcıdan sayı bilgisi alınıyor
        System.out.print("Değer girin: ");
        sayi = degerAl.nextInt();

        // Harmonik seri hesaplanıyor ve ekrana yazdırılıyor
        for (double i = 1; i <= sayi; i++) {
            sonuc += (1/i);
        }

        System.out.println("Harmoni sayı: " + sonuc);        

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
