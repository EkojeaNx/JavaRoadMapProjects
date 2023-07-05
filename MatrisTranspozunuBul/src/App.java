// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
        Scanner degerAl = new Scanner(System.in);

        // Değişkenler
        int satir, sutun;
        int[][] matris, transpozeMatris;

        // Kullanıcıdan dizinin satır bilgisini alıyoruz
        System.out.print("Dizinin satırını giriniz: ");
        satir = degerAl.nextInt();

        // Kullanıcıdan dizinin sutun bilgisini alıyoruz
        System.out.print("Dizinin boyutunu giriniz: ");
        sutun = degerAl.nextInt();

        // Kullanıcıdan alınan satır ve sutun bilgisi ile çok boyutlu dizi tanımlıyoruz
        matris = new int[satir][sutun];
        transpozeMatris = new int[matris[0].length][matris.length];

        // Kullanıcıdan dizinin elemanları alıyoruz
        System.out.println("Dizi elemanlarını giriniz; ");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print((i + 1) + ". Satırın " + (j + 1) + " Elemanını Gir: ");
                matris[i][j] = degerAl.nextInt();
            }
        }

        // Matrisi ekrana yazdırıyoruz
        System.out.println("Matris: ");
        for (int[] dizi : matris) {
            for (int eleman : dizi) {
                System.out.print(eleman + "  ");
            }
            System.out.println();
        }

        // Transpoze Matrisini buluyoruz
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                transpozeMatris[j][i] = matris[i][j];
            }
        }

        // Transpoze Matrisini ekrana yazdırıyoruz.
        System.out.println("Transpoze: ");
        for (int[] dizi : transpozeMatris) {
            for (int eleman : dizi) {
                System.out.print(eleman + "  ");
            }
            System.out.println();
        }

        // Scanner sınıfını kapatıyoruz
        degerAl.close();
    }
}
