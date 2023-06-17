// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz.
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int tabanDeger, usDeger, sonuc = 0;

        // Kullanıcıdan taban ve üs değerini alıyoruz
        System.out.print("Taban değeri girin: ");
        tabanDeger = degerAl.nextInt();

        System.out.print("Üs değeri girin: ");
        usDeger = degerAl.nextInt();

        // Recursive Metot çağırarak sonucu ekrana yazdırma
        sonuc = isUsHesapla(tabanDeger, usDeger);

        System.out.println("Sonuç: " + sonuc);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }

    // Recursive Metot ile üs hesaplama
    static int isUsHesapla(int tabanDeger, int usDeger) {
        int sonuc = 1;
        if (usDeger == 0) {
            return sonuc;
        }

        return sonuc *= tabanDeger * isUsHesapla(tabanDeger, --usDeger);
    }
}
