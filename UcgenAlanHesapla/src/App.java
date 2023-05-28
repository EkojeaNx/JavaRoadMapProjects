// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz.
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int birinciKenar, ikinciKenar, ucuncuKenar, u, alan;

        // Kullanıcıdan 3 kenar bilgisini alma
        System.out.print("Üçgenin Birinci Kenarı: ");
        birinciKenar = degerAl.nextInt();

        System.out.print("Üçgenin İkinci Kenarı: ");
        ikinciKenar = degerAl.nextInt();

        System.out.print("Üçgenin Üçüncü Kenarı: ");
        ucuncuKenar = degerAl.nextInt();

        // Alan hesaplama ve yazdırma
        u = (birinciKenar + ikinciKenar + ucuncuKenar) / 2;
        alan = (int) Math.sqrt(u * (u - birinciKenar) * (u - ikinciKenar) * (u - ucuncuKenar));

        System.out.println("Üçgenin alanı: " + alan);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
