// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int sayi1, sayi2, ebob = 1, ekok = 0, sayac = 0;

        // Kullanıcıdan Sayı1 ve Sayı2 değerlerini alıyoruz
        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = degerAl.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = degerAl.nextInt();

        // Ebob hesaplıyoruz ve ekrana yazdırıyoruz
        while (sayac != sayi1) {
            sayac++;
            if (sayi1 % sayac == 0 && sayi2 % sayac == 0) {
                ebob = sayac;
            }            
        }

        System.out.println("Ebob: " + ebob);

        // Ekok hesaplıyoruz ve ekrana yazdırıyoruz
        ekok = (sayi1 * sayi2) / ebob;

        System.out.println("Ekok: " + ekok);
        
        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
