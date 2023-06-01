// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int birinciSayi, ikinciSayi, ucuncuSayi;

        // Kullanıcıdan sayı bilgilerini alıyoruz
        System.out.print("Birinci sayıyı giriniz: ");
        birinciSayi = degerAl.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        ikinciSayi = degerAl.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        ucuncuSayi = degerAl.nextInt();


        // Küçükten > büyüğe doğru sıralama
        if(birinciSayi < ikinciSayi && birinciSayi < ucuncuSayi) {
            if(ikinciSayi < ucuncuSayi) {
                System.out.println(birinciSayi + " < " + ikinciSayi + " < " + ucuncuSayi);
            } else {
                System.out.println(birinciSayi + " < " + ucuncuSayi + " < " + ikinciSayi);
            }
        } else if(ikinciSayi < birinciSayi && ikinciSayi < ucuncuSayi) {
            if(birinciSayi < ucuncuSayi) {
                System.out.println(ikinciSayi + " < " + birinciSayi + " < " + ucuncuSayi);
            } else {
                System.out.println(ikinciSayi + " < " + ucuncuSayi + " < " + birinciSayi);
            }
        } else {
            if(birinciSayi < ikinciSayi) {
                System.out.println(ucuncuSayi + " < " + birinciSayi + " < " + ikinciSayi);
            } else {
                System.out.println(ucuncuSayi + " < " + ikinciSayi + " < " + birinciSayi);
            }
        }

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
