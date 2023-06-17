// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz.
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int sayi;

        // Kullanıcıdan bir sayi değerini alıyoruz
        System.out.print("Bir sayı gir: ");
        sayi = degerAl.nextInt();

        // Metot çağırma
        isDeseneGoreMetot(sayi);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }

    // Desene göre metot
    public static void isDeseneGoreMetot(int sayi) { 
        if (sayi <= 0) { 
            System.out.print(sayi + " "); 
            return; 
        } 
        System.out.print(sayi + " "); 
        isDeseneGoreMetot(sayi - 5); 
        System.out.print(sayi + " "); 
    }
}
