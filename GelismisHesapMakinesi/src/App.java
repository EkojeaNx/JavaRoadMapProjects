// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz.
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        Byte islem;
        int sonuc = 0;

        // Programdan çıkmak isteyene kadar menüyü ekrana getiren döngü
        while (true) {
            menuler();

            // kullanıcıdan işlem bilgisini alma
            System.out.print("Yapacağınız işlemi seçiniz: ");
            islem = degerAl.nextByte();

            // İşlem 0 olunca programdan çıkış işlemi
            if (islem == 0) {
                System.out.println("Gelişmiş Hesap Makinesi iyi günler diler.");
                break;
            }
            
            // İşlemine göre metotları çağırıyoruz            
            switch (islem) {
                case 1:
                    sonuc = toplama();
                    break;
                case 2:
                    sonuc = cikarma();
                    break;
                case 3:
                    sonuc = carpma();
                    break;
                case 4:
                    sonuc = bolme();
                    break;
                case 5:
                    sonuc = us();
                    break;
                case 6:
                    sonuc = faktoriyel();
                    break;
                case 7:
                    sonuc = mod();
                    break;
                case 8:
                    dikdortgenAlanCevre();
                    break;        
                default:
                    System.out.println("Hatalı işlem girdiniz!");
                    break;
            }

            if (islem != 8)
                System.out.println("Sonuç: " + sonuc);

        }

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }

    // Programdaki menüleri bulunduran metot
    static void menuler() {
        String menu = "1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme İşlemi\n"
                    + "5- Üslü Sayı Hesaplama\n"
                    + "6- Faktoriyel Hesaplama\n"
                    + "7- Mod Alma\n"
                    + "8- Dikdörtgen Alan ve Çevre Hesaplama\n"
                    + "0- Çıkış Yap\n",
                cizgi = "-----------------------------------------\n";

        System.out.println(cizgi
                            + "Gelişmiş Hesap Makinesi\n"
                            + cizgi
                            + menu
                            + cizgi     
                            );
    }

    // toplama işlemi yapan metot
    static int toplama() {
        // Değişkenler
        int n, sayi, sonuc = 0;

        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz.
        Scanner degerAl = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz: ");
        n = degerAl.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Sayı gir: ");
            sayi = degerAl.nextInt();
            sonuc += sayi;
        }
        return sonuc;
    }
    
    // çıkarma işlemi yapan metot
    static int cikarma() {
        // Değişkenler
        int n, sayi, sonuc = 0;

        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz.
        Scanner degerAl = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz: ");
        n = degerAl.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Sayı gir: ");
            sayi = degerAl.nextInt();

            if (i == 0)
                sonuc = sayi;
            else
                sonuc -= sayi;
        }
        return sonuc;
    }

    // çarpma işlemi yapan metot
    static int carpma() {
        // Değişkenler
        int n, sayi, sonuc = 1;

        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz.
        Scanner degerAl = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz: ");
        n = degerAl.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Sayı gir: ");
            sayi = degerAl.nextInt();

            sonuc *= sayi;
        }
        return sonuc;
    }

    // bölme işlemi yapan metot
    static int bolme() {
        // Değişkenler
        int n, sayi, sonuc = 1;

        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz.
        Scanner degerAl = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz: ");
        n = degerAl.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Sayı gir: ");
            sayi = degerAl.nextInt();

            if (i == 0)
                sonuc = sayi;
            else
                sonuc /= sayi;
        }
        return sonuc;
    }

    // üs alma işlemi yapan metot
    static int us() {
        // Değişkenler
        int tabanDeger, usDeger, sonuc = 1;

        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz.
        Scanner degerAl = new Scanner(System.in);

        System.out.print("Taban değeri girin: ");
        tabanDeger = degerAl.nextInt();

        System.out.print("Üs değeri girin: ");
        usDeger = degerAl.nextInt();

        for (int i = 1; i <= usDeger; i++) {
            sonuc *= tabanDeger;
        }

        return sonuc;
    }

    // faktoriyel hesaplama işlemi yapan metot
    static int faktoriyel() {
        // Değişkenler
        int sayi, sonuc = 1;

        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz.
        Scanner degerAl = new Scanner(System.in);

        System.out.print("Sayı girin: ");
        sayi = degerAl.nextInt();

        for (int i = 1; i <= sayi; i++) {
            sonuc *=i;
        }

        return sonuc;
    }

    // mod alma işlemi yapan metot
    static int mod() {
        // Değişkenler
        int sayi1, sayi2, sonuc = 1;

        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz.
        Scanner degerAl = new Scanner(System.in);

        System.out.print("Sayı girin: ");
        sayi1 = degerAl.nextInt();

        System.out.print("Sayı girin: ");
        sayi2 = degerAl.nextInt();

        sonuc = sayi1 % sayi2;

        return sonuc;
    }

    // dikdörtgenin alan ve çevresini hesaplama işlemi yapan metot
    static void dikdortgenAlanCevre() {
        // Değişkenler
        int uzunKenar, kisaKenar, alan, cevre;

        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz.
        Scanner degerAl = new Scanner(System.in);

        System.out.print("Dikdörtgenin kısa kenarını girin: ");
        kisaKenar = degerAl.nextInt();

        System.out.print("Dikdörtgenin uzun kenarını girin: ");
        uzunKenar = degerAl.nextInt();

        alan = kisaKenar * uzunKenar;
        cevre = 2 * (kisaKenar + uzunKenar);

        System.out.println("Dikdörtgenin alanı: " + alan);
        System.out.println("Dikdörtgenin çevresi: " + cevre);
    }
}
