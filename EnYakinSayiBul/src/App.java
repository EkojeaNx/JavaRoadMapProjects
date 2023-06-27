// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;
// Array kütüphanesi
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int diziBoyutu, girilenSayi;
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

        // Kullanıcıdan en yakin minimum ve maximum hesaplayacağımız değeri alıyoruz
        System.out.print("Sayı girin: ");
        girilenSayi = degerAl.nextInt();

        // Diziyi küçükten büyüğe sıralıyoruz
        Arrays.sort(dizi);

        // Diziyi ve girilen sayıyı ekrana yazdırıyoruz
        System.out.println("Dizi: " + Arrays.toString(dizi));
        System.out.println("Girilen Sayı: " + girilenSayi);

        // En yakın min ve max'ı metotlar ile hesaplayıp ekrana yazdırıyoruz
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + enYakinMin(dizi, girilenSayi));
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enYakinMax(dizi, girilenSayi));

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }

    // En yakın minimum sayısını hesaplayan metot
    static int enYakinMin(int[] dizi, int girilenSayi) {
        int enYakinMindeger = dizi[0];
        for (int eleman : dizi) {
            if (eleman < girilenSayi) {
                enYakinMindeger = eleman;
            }
        }
        return enYakinMindeger;
    }

    // En yakın maximum sayısını hesaplayan metot
    static int enYakinMax(int[] dizi, int girilenSayi) {
        int enYakinMaxdeger = dizi[0];
        for (int eleman : dizi) {
            if (eleman > girilenSayi) {
                enYakinMaxdeger = eleman;
                break;
            }    
        }
        return enYakinMaxdeger;
    }


}
