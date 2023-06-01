// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int n1, n2, islem, sonuc = 0;        

        // İşlem bilgileri
        System.out.println("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme");

        // Sayıların ve işlemin bilgisi alınır
        System.out.print("Sayı giriniz: ");
        n1 = degerAl.nextInt();

        System.out.print("Sayı giriniz: ");
        n2 = degerAl.nextInt();

        System.out.print("İşlem bilgisi: ");
        islem = degerAl.nextInt();

        // Hesaplama işlemleri ve sonucu ekrana yazdırma
        switch (islem) {
            case 1:
                sonuc = n1 + n2;
                break;
            case 2:
                sonuc = n1 - n2;
                break;
            case 3:
                sonuc = n1 * n2;
                break;
            case 4:
                if (n1 == 0 || n2 == 0)
                {
                    System.out.println("Bölme işleminde 0'a bölünme olmaz!");
                } else {
                    sonuc = n1 / n2;
                }
                break;       
            default:
                System.out.println("Böyle bir işlem mevcut değil!");
                break;
        }

        System.out.println("Sonuç: " + sonuc);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
