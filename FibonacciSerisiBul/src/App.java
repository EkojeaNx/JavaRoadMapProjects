// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int elemanSayisi, toplam = 0, sayi1 = 0, sayi2 = 1;

        // Kullanıcıdan Fibonacci Serisinin eleman sayını alıyoruz
        System.out.print("Fibonacci Serisinin eleman sayısı:  ");
        elemanSayisi = degerAl.nextInt();

        // 0 ve 1 değeri Fibonacci Serisinin elemanları olduğu için döngüya dahil etmeden alıyoruz.
        System.out.print(elemanSayisi + " Elemenalı Fibonacci Serisi: " + sayi1 + " " + sayi2);

        // 2 den başlayarak eleman sayısına kadar Fibonacci Serisini hesaplayıp ekrana yazıyoruz
        for (int i = 2; i <= elemanSayisi; i++) {
            toplam = sayi1 + sayi2;
            System.out.print(" " + toplam);

            sayi1 = sayi2;
            sayi2 = toplam;
        }

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
