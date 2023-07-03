// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;
// Array kütüphanesi
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int diziBoyutu;
        int[] dizi;

        // Kullanıcıdan dizinin boyutunu alıyoruz
        System.out.print("Dizinin boyutunu giriniz: ");
        diziBoyutu = degerAl.nextInt();

        // Kullanıcıdan alınan dizi boyutunda dizi tanımlıyoruz
        dizi = new int[diziBoyutu];

        // Kullanıcıdan dizinin elemanları alıyoruz
        System.out.println("Dizi elemanlarını giriniz; ");
        for (int i = 0; i < diziBoyutu; i++) {
            System.out.print((i + 1) + ". Elemanını Gir: ");
            dizi[i] = degerAl.nextInt();
        }

        // Diziyi küçükten büyüğe sıralıyoruz 
        Arrays.sort(dizi);

        // Dizinin sıralı halini ekrana yazıyoruz
        System.out.print("Sıralama: ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
