// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int sayi, toplam = 0;
        String sonuc;

        // Kullanıcıdan sayı bilgisi alınıyor
        System.out.print("Bir sayı giriniz: ");
        sayi = degerAl.nextInt();

        // Mükemmel sayi hesaplanıp ekrana yazıdırılıyor
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        sonuc = sayi == toplam ? sayi + " Mükemmel bir sayıdır." : sayi + " Mükemmel bir sayı değildir.";

        System.out.println(sonuc);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
