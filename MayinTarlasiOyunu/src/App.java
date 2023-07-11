// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int tarlaBoyutSatir, tarlaBoyutSutun;

        // Oyun Tanıtımı
        System.out.println("---------------------------------------");
        System.out.println("||           Mayın Tarlası           ||");
        System.out.println("---------------------------------------");

        // Kullanıcıdan matrisimizin boyutunu alıyoruz
        System.out.print("Mayın Tarlası Satır boyutunu giriniz: ");
        tarlaBoyutSatir = degerAl.nextInt();

        System.out.print("Mayın Tarlası Sütun boyutunu giriniz: ");
        tarlaBoyutSutun = degerAl.nextInt();

        System.out.println("=======================================");

        // Oyunun sınıfını tanımlıyoruz
        MayinTarlasi oyun = new MayinTarlasi(tarlaBoyutSatir, tarlaBoyutSutun);

        // Oyunu başlatan metodu çağırıyoruz
        oyun.oyunuBaslat();

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
