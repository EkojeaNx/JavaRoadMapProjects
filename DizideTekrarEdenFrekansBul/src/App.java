// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;
// Array kütüphanesi
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int diziBoyutu, sayac = 1;
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

        // Diziyi ekrana yazıyoruz
        System.out.println(Arrays.toString(dizi));

        // Diziyi küçükten büyüğe sıralıyoruz 
        Arrays.sort(dizi);

        // Tekrar eden sayıların frekansını hesaplıyoruz ve ekrana yazıyoruz
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < dizi.length; i++) {
            if (i == 0) {
                for (int j = 0; j < dizi.length; j++) {
                    if ((i != j) && (dizi[i] == dizi[j])) {
                        sayac++;
                    }
                }
                System.out.println(dizi[i] + " sayısı " + sayac + " kere tekrar edildi.");
            } else if(dizi[i] != dizi[i-1]) {
                for (int j = 0; j < dizi.length; j++) {
                    if ((i != j) && (dizi[i] == dizi[j])) {
                        sayac++;
                    }
                }
                System.out.println(dizi[i] + " sayısı " + sayac + " kere tekrar edildi.");
            }

            sayac = 1;
        }

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }


}
