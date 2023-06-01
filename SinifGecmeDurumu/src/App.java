// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int matematik = 0, fizik = 0, turkce = 0, kimya = 0, muzik = 0, sayac = 0;
        double ortalama = 0;

        // Ders notlarının veri girişi ve ortalamaya dahil edilip edilmeyeceği kontrolü
        System.out.print("Matematik ders notunu giriniz: ");
        matematik = degerAl.nextInt();

        if(matematik >= 0 && matematik <= 100)
        {
            ortalama += matematik;
            sayac++;
        }

        System.out.print("Fizik ders notunu giriniz: ");
        fizik = degerAl.nextInt();

        if(fizik >= 0 && fizik <= 100)
        {
            ortalama += fizik;
            sayac++;
        }

        System.out.print("Türkçe ders notunu giriniz: ");
        turkce = degerAl.nextInt();

        if(turkce >= 0 && turkce <= 100)
        {
            ortalama += turkce;
            sayac++;
        }

        System.out.print("Kimya ders notunu giriniz: ");
        kimya = degerAl.nextInt();

        if(kimya >= 0 && kimya <= 100)
        {
            ortalama += kimya;
            sayac++;
        }

        System.out.print("Müzik ders notunu giriniz: ");
        muzik = degerAl.nextInt();

        if(muzik >= 0 && muzik <= 100)
        {
            ortalama += muzik;
            sayac++;
        }

        // Ortalama hesaplama ve Sınıfı geçiş durumunu ekrana yazdırma

        ortalama /= sayac;

        if(ortalama >= 55)
            System.out.println("Tebrikler! Sınıfı geçtiniz");
        else
            System.out.println("Üzgünüz ortalamanın altında olduğunuz için sınıfta kaldınız!");
            
        System.out.println("Ortalama: " + ortalama);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
