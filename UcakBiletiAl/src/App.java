// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        double mesafeBasiUcret = 0.10, tutar = 0;
        int mesafe;
        byte yas, yolculukTipi;

        // Geçersiz veri kontrolü yaparak mesafe, yaş ve yolculuk tipi bilgilerini alıyoruz
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = degerAl.nextInt();

        if (mesafe > 0) {
            System.out.print("Yaşınızı giriniz : ");
            yas = degerAl.nextByte();

            if (yas > 0) {
                System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
                yolculukTipi = degerAl.nextByte();

                if (yolculukTipi == 1 || yolculukTipi == 2) {
                    // Mesafeli tutarı hesaplıyoruz
                    tutar = mesafe * mesafeBasiUcret;

                    // Yaşına göre indirim uyguluyoruz
                    if (yas < 12) {
                        tutar -= tutar * 0.50;
                    } else if(yas < 24) {
                        tutar -= tutar * 0.10;
                    } else if(yas > 65) {
                        tutar -= tutar * 0.30;
                    }

                    // Yolculuk tipi gidiş-dönüş ise indirim uygulayıp çift bilet alındığı için toplam bilet tutarını hesaplıyoruz
                    tutar -= yolculukTipi == 2 ? tutar * 0.20 : 0 ;
                    tutar *= yolculukTipi == 2 ? 2: 1;
                } else {
                    System.out.println("Yolculuk tipini hatalı girdiniz!");
                }
            } else {
                System.out.println("Yaşınızı hatalı girdiniz!");
            }
        } else {
            System.out.println("Mesafeyi hatalı girdiniz!");
        }

        // Tüm kampanya indirimlerini uyguladıktan sonra uçak bilet fiyatını ekrana yansıtıyoruz 
        System.out.println("Uçak biletinin ücreti: " + tutar + " TL");

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}