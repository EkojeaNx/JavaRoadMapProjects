// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz.
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        double tutar, kdvOran, kdvTutar, kdvliTutar;

        // Kullanıcıdan ücret bilgisi alınıyor
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = degerAl.nextDouble();

        // Kdv oranı 1000 tl üstünde %8 altında %18 koşulu ile hesaplanıyor
        kdvOran = tutar > 1000 ? 0.08 : 0.18;

        // Kdv tutarı ve kdv'li tutar hesaplanıyor ve ekrana yazdırılıyor.
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutar: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
