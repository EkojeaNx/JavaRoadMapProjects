// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        String kullaniciAdi, parola, dataKullaniciAdi = "ekrem", dataParola = "123456";
        boolean isKullaniciAdiValid = false, isParolaValid = false, isSifreSifirlaValid = false;

        // Kullanıcı giriş işlemleri
        // Kullanıcı girişini yapana kadar döngü çalıştırıyoruz
        do {
            // Kullanıcı adı bilgisini alıyoruz ve böyle kullanıcı varmı kontrolü sağlıyoruz
            System.out.print("Kullanıcı adını girin: ");
            kullaniciAdi = degerAl.nextLine();            

            if (kullaniciAdi.equals(dataKullaniciAdi)) {
                isKullaniciAdiValid = true;

                do {
                    // Parola bilgisini alıyoruz ve kullanıcı parolası kontrolü sağlıyoruz
                    System.out.print("Kullanıcı parolası giriniz: ");
                    parola = degerAl.nextLine();

                    if (parola.equals(dataParola)) {
                        System.out.println("Kullanıcı girişi başarılı!");
                        isParolaValid = true;
                    } else {
                        do {
                            // Parola sıfırlama bilgisini alıyoruz ve eğer aynı parola girilip girilmediği kontrolü sağlıyoruz
                            System.out.print("Paronalınızı unuttunuz mu?\nParola sıfıralamak ister misiniz? (E/H): ");
                            isSifreSifirlaValid = degerAl.nextLine().equals("E") ? true : false;
                            if (isSifreSifirlaValid) {
                                System.out.print("Yeni parolanızı giriniz: ");
                                parola = degerAl.nextLine();

                                if (parola.equals(dataParola)) {
                                    System.out.println("Eski parolanız ile aynı parola giremezsiniz!");
                                } else {
                                    dataParola = parola;
                                    isSifreSifirlaValid = false;
                                }
                            }
                        } while (isSifreSifirlaValid);
                    }
                } while (!isParolaValid);                                
            } else {
                System.out.println("Böyle bir kullanıcı adı bulunmamaktadır!");
            }
        } while (!isKullaniciAdiValid);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
