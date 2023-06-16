// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz.
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int sayi;

        // Kullanıcıdan sayi bilgisini alma ve metot çağırarak ekrana yazdırma
        System.out.print("Sayı gir: ");
        sayi = degerAl.nextInt();

        System.out.println(isPalindrom(sayi));

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }

    // Girilen sayının Palindrom olup olmadığını hesaplayan metot
    static String isPalindrom(int sayi) {
        // Değişkenler
        int temelSayi = sayi, sayiTersi = 0, sonBasamak;

        // Palindrom hesaplama ve sonuç bilgisini gönderme
        while (temelSayi != 0) {
            sonBasamak = temelSayi % 10;
            sayiTersi = (sayiTersi * 10) + sonBasamak;
            temelSayi /= 10;
        }

        return sayi == sayiTersi ? sayi + " Palindrom bir sayıdır": sayi + " Palindrom bir sayı değildir.";
    }
}
