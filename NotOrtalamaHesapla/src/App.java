// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz.
        Scanner degerAl = new Scanner(System.in);

        // Ortalamasını hesaplayacağımız derslerin değişkenleri
        int matematik = 0, fizik, kimya, turkce, tarih, muzik;

        // Derslerin ortalama bilgisini tutacağımız değişken
        double dersOrtalamasi;

        // Derslerin ortalaması hesaplandıktan sonra sınıfı geçip geçmediği bilgisinin tutulduğu değişken
        String dersSonuc;

        // Programın başlangıç cümlesi
        System.out.println("Not Ortalamasını Hesaplayan Program");
        System.out.println("------------------------------------");
        System.out.println("Ders Notları 0-100 arasında olmalıdır!");

        // Ders notlarının 0-100 arasında olması koşulu ile kullanıcıdan alınması
        do {
            System.out.print("Matematik Dersi Notunuz: ");
            matematik = degerAl.nextInt();
        } while (matematik < 0 || matematik > 100);
        
        do {
            System.out.print("Fizik Dersi Notunuz: ");
            fizik = degerAl.nextInt();
        } while (fizik < 0 || fizik > 100);        

        do {
            System.out.print("Kimya Dersi Notunuz: ");
            kimya = degerAl.nextInt();
        } while (kimya < 0 || kimya > 100);
        
        do {
            System.out.print("Türkçe Dersi Notunuz: ");
            turkce = degerAl.nextInt();
        } while (turkce < 0 || turkce > 100);
        
        do {
            System.out.print("Tarih Dersi Notunuz: ");
            tarih = degerAl.nextInt();
        } while (tarih < 0 || tarih > 100);
        
        do {
            System.out.print("Müzik Dersi Notunuz: ");
            muzik = degerAl.nextInt();
        } while (muzik < 0 || muzik > 100);
        
        // Derslerin not ortalamasının hesaplanması ve ekrana yansıtılması
        dersOrtalamasi = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("Derlerin Ortalaması: " + dersOrtalamasi);

        // Sınıfı geçip geçmediğini hesaplama ve ekrana yazdırma
        dersSonuc = dersOrtalamasi >= 60 ? "Sınıfı Geçtiniz!" : "Sınıfı Kaldınız!";
        
        System.out.println(dersSonuc);
    }
}
