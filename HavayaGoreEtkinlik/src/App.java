// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int sicaklik;
        String durum;

        // Sıcaklık bilgisini alıp entiklik önerme işlemi
        System.out.print("Sıcaklık değerini giriniz: ");
        sicaklik = degerAl.nextInt();

        durum = sicaklik < 5 ? "Saçınıza kaynak yaptırabilirsiniz!" 
        : (sicaklik >= 5 && sicaklik < 15 ? "Sinemaya gitmenizi öneririm hava çok güzel!" 
        : (sicaklik >= 15 && sicaklik < 25 ? "Tam piknik havası var." : "Yüzme bu sıcakta iyi gelir."));

        System.out.println(durum);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
