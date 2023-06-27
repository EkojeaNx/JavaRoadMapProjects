// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int diziBoyutu;
        double toplam = 0, harmonikOrtalama;
        double[] dizi;

        // Kullanıcıdan dizinin boyutunu alıyoruz
        System.out.print("Dizinin boyutunu giriniz: ");
        diziBoyutu = degerAl.nextInt();

        // Kullanıcıdan alınan dizi boyutunda dizi tanımlıyoruz
        dizi = new double[diziBoyutu];

        // Kullanıcıdan dizinin elemanları alıyoruz
        System.out.println("Dizi elemanlarını giriniz: ");
        for (int i = 0; i < diziBoyutu; i++) {
            dizi[i] = degerAl.nextDouble();

            // Harmonik Seriyi buluyoruz
            toplam += 1.0 / dizi[i];
        }

        // Harmonik ortalamayı hesaplayıp ekrana yazıyoruz
        harmonikOrtalama = diziBoyutu / toplam;

        System.out.println("Dizinin harmonik ortalaması: " + harmonikOrtalama);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
