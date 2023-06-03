// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        double ortalama = 0;
        int deger, sayac = 0;

        // Kullanıcıdan değer alıyoruz
        System.out.print("Sayı girin: ");
        deger = degerAl.nextInt();

        // 3 ve 4 'e tam bölünenlerin ortalamasını hesaplıyor ve ekrana yazıyoruz
        for (int i = 0; i < deger; i++) {
            if (i % 3 == 0 || i % 4 == 0)
                ortalama +=i;

            sayac++;
        }

        ortalama /= sayac;

        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
