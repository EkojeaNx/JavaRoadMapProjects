// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int dogumYili, sonuc;
        String cinZodyagi;

        // Kullanıcıdan doğum yılını alıyoruz
        System.out.print("Doğum yılınızı girin: ");
        dogumYili = degerAl.nextInt();

        // Çin zodyağını hesaplıyoruz ve ekrana yazıyoruz
        sonuc = dogumYili % 12;

        switch (sonuc) {
            case 0:
                cinZodyagi = "Maymun";                
                break;
            case 1:
                cinZodyagi = "Horoz";                
                break;
            case 2:
                cinZodyagi = "Köpek";                
                break;
            case 3:
                cinZodyagi = "Domuz";                
                break;
            case 4:
                cinZodyagi = "Fare";                
                break;
            case 5:
                cinZodyagi = "Öküz";                
                break;
            case 6:
                cinZodyagi = "Kaplan";                
                break;
            case 7:
                cinZodyagi = "Tavşan";                
                break;
            case 8:
                cinZodyagi = "Ejderha";                
                break;
            case 9:
                cinZodyagi = "Yılan";                
                break;
            case 10:
                cinZodyagi = "At";                
                break;
            case 11:
                cinZodyagi = "Koyun";                
                break;
            default:
                cinZodyagi = "Hatalı veri girdiniz!";
                break;
        }

        System.out.println("Çin Zodyağı: " + cinZodyagi);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
