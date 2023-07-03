// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;
// Array kütüphanesi
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int diziBoyutu, sayac = 0;
        int[] dizi, tekrarEdenDizi;

        // Kullanıcıdan dizinin boyutunu alıyoruz
        System.out.print("Dizinin boyutunu giriniz: ");
        diziBoyutu = degerAl.nextInt();

        // Kullanıcıdan alınan dizi boyutunda dizi tanımlıyoruz
        dizi = new int[diziBoyutu];
        tekrarEdenDizi = new int[diziBoyutu];

        // Kullanıcıdan dizinin elemanları alıyoruz
        System.out.println("Dizi elemanlarını giriniz; ");
        for (int i = 0; i < diziBoyutu; i++) {
            System.out.print((i + 1) + ". Elemanını Gir: ");
            dizi[i] = degerAl.nextInt();
        }

        // Diziyi küçükten büyüğe sıralıyoruz 
        Arrays.sort(dizi);

        // Dizideki tekrar eden sayıları bulan döngü
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j]) && (dizi[i] % 2 == 0)) {  
                    if (!isTekrarEdenDeger(tekrarEdenDizi, dizi[i])) {
                        tekrarEdenDizi[sayac] = dizi[i];
                        sayac++;
                    }       
                }
            }
        }

        // Dizideki tekrar eden çift değerleri ekrana yazıyoruz
        System.out.print("Tekrar Eden Çift Değerler: ");
        for (int deger : tekrarEdenDizi) {
            if (deger != 0) {
                System.out.print(deger + " - ");
            }
        }

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }

    // Dizide tekrar eden kayıt sayısı 2'den fazla olmasını engelleyen metot
    static boolean isTekrarEdenDeger(int[] dizi, int deger) {
        for (int i : dizi) {
            if (i == deger) {
                return true;
            }
        }

        return false;
    }

}
