// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int deger;

        // Kullanıcıdan değer alıyoruz
        System.out.print("Değeri giriniz: ");
        deger = degerAl.nextInt();

        // 4'ün kuvvetlerini ekrana yazdırıyoruz
        System.out.println("4'ün kuvetleri");
        for (int i = 1; i <= deger; i*=3) {
            System.out.println(i);
        }

        // 5'ün kuvvetlerini ekrana yazdırıyoruz
        System.out.println("5'ün kuvetleri");
        for (int i = 1; i <= deger; i*=5) {
            System.out.println(i);
        }

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
