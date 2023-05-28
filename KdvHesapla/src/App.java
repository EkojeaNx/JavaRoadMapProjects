// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz.
        Scanner degerAl = new Scanner(System.in);

        double para = 0, kdvli, kdv;

        System.out.print("Para: ");
        para = degerAl.nextDouble();

        kdv = para > 1000 ? 1.8 : 0.8;

        kdvli = para * kdv;

        System.out.println("KDV'siz Fiyat: " + para);
        System.out.println("KDV'li Fiyat: " + kdvli);
        System.out.println("KDV tutar: " + kdv);

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
