// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int sayi, basamakSayac = 0, toplam = 0, basamakDeger;

        // Kullanıcıdan sayı alınıyor
        System.out.print("Sayı giriniz: ");
        sayi = degerAl.nextInt();

        // Girilen sayının basamak sayısını ve basamak sayılarının toplamını hesaplıyoruz
        while (sayi != 0) {
            basamakDeger = sayi % 10;
            toplam += basamakDeger;
            sayi /= 10;
            basamakSayac++;
        }

        System.out.println("Basamak sayısı: " + basamakSayac);
        System.out.println("Basamak sayılarının toplamı: " + toplam);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
