// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int nDeger, rDeger, nFaktoriyel = 1, rFaktoriyel = 1, kombinasyonFaktoriyel = 1;
        double kombinasyon;

        // Kullanıcıdan N ve R bilgisi alınıyor
        System.out.print("N değerini giriniz: ");
        nDeger = degerAl.nextInt();

        System.out.print("R değerini giriniz: ");
        rDeger = degerAl.nextInt();

        // N faktöriyeli hesaplıyoruz ve ekrana yazıyoruz
        for (int i = 1; i <= nDeger; i++) {
            nFaktoriyel *= i;
        }

        System.out.println("N değerinin faktöriyeli: " + nFaktoriyel);

        // R faktöriyeli hesaplıyoruz ve ekrana yazıyoruz
        for (int i = 1; i <= rDeger; i++) {
            rFaktoriyel *= i;
        }

        System.out.println("R değerinin faktöriyeli: " + rFaktoriyel);

        // (N-R)Kombinasyon faktöriyeli hesaplıyoruz ve ekrana yazıyoruz
        for (int i = 1; i <= (nDeger - rDeger); i++) {
            kombinasyonFaktoriyel *= i;
        }

        System.out.println("N-R değerlerinin faktöriyeli: " + kombinasyonFaktoriyel);

        // Kombinasyonu hesaplıyoruz ve ekrana yazıyoruz
        kombinasyon = nFaktoriyel / (rFaktoriyel * kombinasyonFaktoriyel);

        System.out.println("Kombinasyon: " + kombinasyon);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
