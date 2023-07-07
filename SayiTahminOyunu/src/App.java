// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;
// Rastgele sayı üretme kütüphanesi
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Rastgele sayı üretmek için random sınıfını kullanıyoruz
        Random sayiUret = new Random();

        // Değişkenler
        int maxHak = 5, hak = 0, maxDeger = 100, bulunacakSayi, girilenSayi;

        // Rastgele sayı üretiyoruz
        bulunacakSayi = sayiUret.nextInt(maxDeger);

        // Giriş cümlesi
        System.out.println("Sayı Tahmin Oyunu");
        System.out.println("-------------------------");
        System.out.println("Oyunun Kuralları;");
        System.out.println("Oyunda " + maxHak + " hakkınız vardır.");
        System.out.println("Tahmin edeceğiniz sayı aralığı 0 ile " + maxDeger + " arasındadır.");
        System.out.println("-------------------------");
        System.out.println("Oyunda başarılar dileriz!");
        System.out.println("-------------------------");

        // Haklar bitene kadar döngü sağlıyoruz
        while (hak != maxHak) {
            // Kullanıcıdan sayı tahminini alıyoruz
            System.out.print("Tahmininizi giriniz (0-100) : ");
            girilenSayi = degerAl.nextInt();

            // Girilen sayının oyunun kuralında geçen aralıkta olup olmadığını kontrol ediyoruz
            if (girilenSayi >= 0 && girilenSayi <= maxDeger) {
                // Hak değerini kullandığı için artırıyoruz
                hak++;

                // Kazanma durumu, hak bitmesi durumu ve oyundaki ipucu kontrolleri ve kullanıcıyı yönlendirme yapıyoruz
                if (girilenSayi == bulunacakSayi) {
                    System.out.println("----------------------------------------");
                    System.out.println("Tebrikler -_- Kazandınız!!!");
                    System.out.println(maxHak + " hakkınızdan " + (maxHak - hak) + " kala kazandınız!");
                    System.out.println("----------------------------------------");
                    break;
                } else if (girilenSayi < bulunacakSayi) {
                    if (hak != maxHak) {
                        System.out.println("----------------------------------------");
                        System.out.println(girilenSayi + "'dan daha büyük!");
                        System.out.println("|| Kalan hakkınız: " + (maxHak - hak));
                        System.out.println("----------------------------------------");
                    } else {
                        System.out.println("----------------------------------------");
                        System.out.println("|| Üzgünüz hiç hakkınız kalmadı! Hak: " + (maxHak - hak));
                        System.out.println("----------------------------------------");
                        break;
                    }                    
                } else {
                    if (hak != maxHak) {
                        System.out.println("----------------------------------------");
                        System.out.println(girilenSayi + "'dan daha küçük!");
                        System.out.println("|| Kalan hakkınız: " + (maxHak - hak));
                        System.out.println("----------------------------------------");
                    } else {
                        System.out.println("----------------------------------------");
                        System.out.println("|| Üzgünüz hiç hakkınız kalmadı! Hak: " + (maxHak - hak));
                        System.out.println("----------------------------------------");
                        break;
                    }                    
                }

            } else {
                System.out.println("----------------------------------------");
                System.out.println("Tahmininiz 0 ile 100 arasında olmalı!");
                System.out.println("Hakkınız değişmedi! Kalan hakkınız: " + (maxHak - hak));
                System.out.println("----------------------------------------");
            }
        }

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
