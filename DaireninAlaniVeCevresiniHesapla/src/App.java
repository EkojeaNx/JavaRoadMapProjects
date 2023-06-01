// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int r;
        double pi = 3.14, alan, cevre, daireDilimAlan, merkezAciOlcusu;

        // Kullanıcıdan dairenin yarı çapı ve merkez açı ölçüsü bilgisi alınıyor
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = degerAl.nextInt();

        System.out.print("Merkez Açısının Ölçüsü: ");
        merkezAciOlcusu = degerAl.nextInt();

        // Dairenin alanı, çevresi ve dilim alanı hesaplanıyor ve ekrana yazdırılıyor
        alan = pi * r * r;
        cevre = 2 * pi * r;

        daireDilimAlan = (pi * (r * r) * merkezAciOlcusu) / 360;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Dairenin Merkez Açı Ölçüsü: " + merkezAciOlcusu);
        System.out.println("Dairenin Dilim Alanı: " + daireDilimAlan);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
