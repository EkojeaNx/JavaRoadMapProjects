// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int sayi, us, sonuc = 1;

        // Kullanıcıdan sayı ve üs bilgisi alınıyor
        System.out.print("Sayıyı giriniz: ");
        sayi = degerAl.nextInt();

        System.out.print("Üssü giriniz: ");
        us = degerAl.nextInt();

        // sayının üssünü hesaplıyoruz ve ekrana yazıyoruz
        for (int i = 1; i <= us; i++) {
            sonuc *= sayi;
        }

        System.out.println(sayi + "^" + us + " : " + sonuc);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
