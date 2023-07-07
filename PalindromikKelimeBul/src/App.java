// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        String kelime, tersKelime = "";

        // Kullanıcıdan kelimeyi alıyoruz
        System.out.println("Kelimenizi giriniz: ");
        kelime = degerAl.nextLine();

        // Kelimenin tersini buluyoruz ve ekrana yazıyoruz
        for (int i = kelime.length() - 1; i >= 0; i--) {
            tersKelime += kelime.charAt(i);
        }

        System.out.println("Kelimeniz: " + kelime + "\nKelimenizin tersi: " + tersKelime);
        
        // Kelimenin Palindromik olup olmadığını buluyoruz
        if (tersKelime.trim().toLowerCase().equals(tersKelime.trim().toLowerCase())) {
            System.out.println("Palindromik bir kelime girdiniz!");
        } else {
            System.out.println("Girdiğiniz kelime Palindromik değildir!");
        }

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
