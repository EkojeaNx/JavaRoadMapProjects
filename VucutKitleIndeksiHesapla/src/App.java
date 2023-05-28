// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        double vucutKitleIndeksi, boy;
        int kilo;

        // Kullanıcıdan boy ve kilo bilgisi alınıyor
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = degerAl.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = degerAl.nextInt();

        // Vucüt kitle indeksi hesaplanıp ekrana yazdırılıyor
        vucutKitleIndeksi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + vucutKitleIndeksi);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
