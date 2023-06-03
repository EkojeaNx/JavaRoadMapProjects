// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int dogumYili;

        // Kullanıcıdan doğum yılını alıyoruz
        System.out.print("Doğum yılınızı giriniz: ");
        dogumYili = degerAl.nextInt();

        // Artık yılı hesaplıyoruz
        if (dogumYili % 4 == 0) {
            if (dogumYili % 100 == 0) {
                if (dogumYili % 400 == 0) {
                    System.out.println(dogumYili + " bir artık yıldır !");
                } else {
                    System.out.println(dogumYili + " bir artık yıldır değildir !");
                }
            } else {
                System.out.println(dogumYili + " bir artık yıldır !");
            }
        } else {
            System.out.println(dogumYili + " bir artık yıldır değildir !");
        }

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
