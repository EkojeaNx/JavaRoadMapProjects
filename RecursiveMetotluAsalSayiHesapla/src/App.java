// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz.
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int sayi;
        boolean sonuc;

        // Kullanıcıdan bir sayi değerini alıyoruz
        System.out.print("Bir sayı gir: ");
        sayi = degerAl.nextInt();

        // Recursive Metot çağırarak sonucu ekrana yazdırma
        sonuc = isAsalHesapla(sayi, sayi / 2);

        if (sonuc == true)
            System.out.println(sayi + " sayısı ASALDIR!");
        else
            System.out.println(sayi + " sayısı ASAL değildir!");

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }

    // Recursive Metot ile Asal sayi hesaplama
    static boolean isAsalHesapla(int sayi, int i) {
        if (i == 1)
            return true;
        else {
            if (sayi % i == 0)
                return false;
            else
                return isAsalHesapla(sayi, i-1);
        }
    }
}
