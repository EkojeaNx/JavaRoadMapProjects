// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int girilenSayi, girilecekSayi = 0, minSayi = 0, maxSayi = 0;
        
        // Kullanıcıdan kaç adet sayı gireceği bilgisi alınıyor
        System.out.print("Kaç tane sayı gireceksiniz: ");
        girilecekSayi = degerAl.nextInt();

        // Kullanıcıdan alınan adet kadar sayı girişi sağlatıyoruz
        for (int i = 0; i < girilecekSayi; i++) {
            System.out.print("Sayı giriniz: ");
            girilenSayi = degerAl.nextInt();

            // Minimum sayı hesaplıyoruz
            if (girilenSayi > maxSayi) {
                maxSayi = girilenSayi;
            } 

            // Maximum sayı hesaplıyoruz
            if (girilenSayi < minSayi) {
                minSayi = girilenSayi;
            }
        }

        // Min ve Max sayılarını ekrana yazdırıyoruz
        System.out.println("En büyük sayı: " + maxSayi);
        System.out.println("En küçük sayı: " + minSayi);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
