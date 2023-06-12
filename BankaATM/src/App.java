// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        String kullaniciAdi, parola;
        Byte hak = 3, islem = 0;
        double bakiye = 1500, tutar = 0;

        // Kullanıcı giriş kontrolü
        while (hak > 0) {
            System.out.print("Kullanıcı Adınız: ");
            kullaniciAdi = degerAl.nextLine();
            System.out.print("Parolanız: ");
            parola = degerAl.nextLine();

            if (kullaniciAdi.equals("admin") && parola.equals("123456")) {
                // Kullanıcı giriş yaptıktan sonra giriş cümlesi ve menü
                System.out.println("Başarı ile giriş yaptınız!");
                System.out.println("-------------------------------------");
                System.out.println("EkoBank'a Hoş Geldiniz!");
                System.out.println("-------------------------------------");

                do {
                    // Menü için döngü
                    System.out.println("1.Para Yatır\n2.Para Çek\n3.Bakiye Sorgula\n4.Çıkış");
                    System.out.println("-------------------");

                    System.out.print("İşleminizi Giriniz: ");
                    islem = degerAl.nextByte();

                    switch (islem) {
                        case 1:
                            // Para yatırma işlemi
                            System.out.println("-------------------");
                            System.out.println("Para Yatır");
                            System.out.println("-------------------");

                            System.out.print("Yatıracağınız Tutar: ");
                            tutar = degerAl.nextDouble();

                            if (tutar < 0) {
                                System.out.println("Geçersiz Tutar!");
                            } else {
                                bakiye += tutar;
                            }

                            System.out.println("-------------------");
                            System.out.println("Bakiye: " + bakiye);
                            System.out.println("-------------------");
                            break;
                        case 2:
                            // Para çekme işlemi
                            System.out.println("-------------------");
                            System.out.println("Para Çek");
                            System.out.println("-------------------");

                            System.out.print("Çekeceğiniz Tutar: ");
                            tutar = degerAl.nextDouble();

                            if (tutar > bakiye) {
                                System.out.println("Bakiye yetersiz!");
                            } else {
                                bakiye -= tutar;
                            }

                            System.out.println("-------------------");
                            System.out.println("Bakiye: " + bakiye);
                            System.out.println("-------------------");
                            break;
                        case 3:
                            // Bakiye sorgulama işlemi
                            System.out.println("-------------------");
                            System.out.println("Bakiye Sorgula");
                            System.out.println("-------------------");

                            System.out.println("-------------------");
                            System.out.println("Bakiye: " + bakiye);
                            System.out.println("-------------------");                            
                            break;
                        case 4:
                            // Çışış işlemi
                            System.out.println("Görüşmek Üzere! EkoBank iyi günler diler!");
                            break;                    
                        default:
                            // Hatalı işlem seçimi
                            System.out.println("Hatalı işlem!");
                            break;
                    }
                } while (islem != 4);

                break;
            } else {
                hak--;
                System.out.println("Hatalı Giriş Yaptınız!");
                if (hak == 0 ) {
                    System.out.println("Hesabınız bloke olmuştur. Banka ile iletişime geçiniz!");
                } else {
                    System.out.println("Kalan hakkınız: " + hak);
                }                
            }
        }

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
