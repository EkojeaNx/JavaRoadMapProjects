// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int km, baslangicTutar = 10, minTutar = 20;
        double odenecekTutar = 0, kmBasiTutar = 2.20;

        // Kullanıcıdan km cinsinden gideceği mesafe bilgisini alıyoruz
        System.out.print("Mesafeyi girin (KM): ");
        km = degerAl.nextInt();

        // Mesafeye göre ödenecek tutarı hesaplıyoruz.
        odenecekTutar += (kmBasiTutar * km) + baslangicTutar;

        // Mesafeye göre tutarın minimum tutarın altında olma durumunu kontrol edip ekrana yazıdırıyoruz
        odenecekTutar = odenecekTutar < minTutar ? minTutar : odenecekTutar;

        System.out.println("Tutar: " + odenecekTutar);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
