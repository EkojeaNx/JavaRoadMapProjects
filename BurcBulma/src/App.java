// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int gun, ay;
        String burc;

        // Gün ve ay bilgisi alıyoruz
        System.out.print("Doğduğunuz gün: ");
        gun = degerAl.nextInt();
        
        if(gun > 0 && gun < 32) {
            System.out.print("Doğduğunuz ay: ");
            ay = degerAl.nextInt();

            if(ay > 0 && ay < 13) {
                // Burç hesaplaması ve ekrana yazma
                if(ay == 1) {
                    burc = gun < 22 ? "Oğlak" : "Kova";
                } else if(ay == 2) {
                    burc = gun < 20 ? "Kova" : "Balık";
                } else if(ay == 3) {
                    burc = gun < 21 ? "Balık" : "Koç";
                } else if(ay == 4) {
                    burc = gun < 21 ? "Koç" : "Boğa";
                } else if(ay == 5) {
                    burc = gun < 22 ? "Boğa" : "İkizler";
                } else if(ay == 6) {
                    burc = gun < 23 ? "İkizler" : "Yengeç";
                } else if(ay == 7) {
                    burc = gun < 23 ? "Yengeç" : "Aslan";
                } else if(ay == 8) {
                    burc = gun < 23 ? "Aslan" : "Başak";
                } else if(ay == 9) {
                    burc = gun < 23 ? "Başak" : "Terazi";
                } else if(ay == 10) {
                    burc = gun < 23 ? "Terazi" : "Akrep";
                } else if(ay == 11) {
                    burc = gun < 22 ? "Akrep" : "Yay";
                } else {
                    burc = gun < 22 ? "Yay" : "Oğlak";
                }

                System.out.println("Burcunuz: " + burc);

            } else {
                System.out.print("Geçersiz ay bilgisi!");
            }
        } else {
            System.out.println("Geçersiz gün bilgisi!");
        }

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
