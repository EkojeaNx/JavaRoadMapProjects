// Kullanıcıdan veri alma kütüphanesi
import java.util.Scanner;
// Rastgele sayı üretme kütüphanesi
import java.util.Random;
// Array kütüphanesi
import java.util.Arrays;

// Oyun sınıfı
public class MayinTarlasi {
    // Oyun sınıfının nitelikleri
    public int tarlaBoyutSatir;
    public int tarlaBoyutSutun;
    public int elemanSayisi;
    public int mayinSayisi;
    public String[][] tarla;

    // Rastgele sayı üretmek için random sınıfını kullanıyoruz
    Random sayiUret = new Random();

    // Kullanıcıdan veri almak için scanner sınıfını kullanıyoruz
    Scanner degerAl = new Scanner(System.in);

    // Oyun sınıfının yapıcı(Constructor) metodu
    public MayinTarlasi(int tarlaBoyutSatir, int tarlaBoyutSutun) {
        this.tarlaBoyutSatir = tarlaBoyutSatir;
        this.tarlaBoyutSutun = tarlaBoyutSutun;
        this.elemanSayisi = tarlaBoyutSatir * tarlaBoyutSutun;
        this.mayinSayisi = this.elemanSayisi / 4;
        this.tarla = new String[tarlaBoyutSatir][tarlaBoyutSutun];

        for (String[] i : this.tarla) {
            Arrays.fill(i, " - ");
        }
    }

    // Oyun sınıfının metotları

    // Oyunu başlatma metodu
    public void oyunuBaslat() {
        String[][] cevreKontrolTarla = new String[this.tarla.length + 2][this.tarla[0].length + 2];
        int secimSatir, secimSutun, hak = this.elemanSayisi - this.mayinSayisi;

        mayinla();

        System.out.println("Oyun Kuralları;");
        System.out.println("1. Oyunda Mayın Sayısı " + this.mayinSayisi + " 'dir.");
        System.out.println("2. Giriş yapacağınız değeri 0'dan \nbaşlayarak hesap edin.");
        System.out.println("=======================================");

        // Oyunu kazanma durumu için mayınların konumu göstermek için açıklamaları kaldırın.
        //mayinliTarlaGoster();
        //System.out.println("---------------------------------------");

        tarlaGoster();

        while (hak > 0) {
            System.out.print("Değer için Satır giriniz: ");
            secimSatir = degerAl.nextInt();
            System.out.print("Değer için Sütun giriniz: ");
            secimSutun = degerAl.nextInt();
            while (secimSatir < 0 || secimSutun < 0 || secimSatir >= this.tarla.length || secimSutun >= this.tarla[0].length) {
                System.out.print("Hatalı veri girdiniz! Değer için tekrar Satır giriniz: ");
                secimSatir = degerAl.nextInt();
                System.out.print("Hatalı veri girdiniz! Değer için tekrar Sütun giriniz: ");
                secimSutun = degerAl.nextInt();
            }

            tarlaOlustur(cevreKontrolTarla);

            if (this.tarla[secimSatir][secimSutun].equals(" * ")) {
                System.out.print("Üzgünüm! Kaybettiniz!");
                return;
            } else {
                if (this.tarla[secimSatir][secimSutun].equals(" - ")) {
                    this.tarla[secimSatir][secimSutun] = Integer.toString(getTarlaMayinliCevreHesapla(secimSatir, secimSutun, cevreKontrolTarla));
                    hak--;
                }
            }

            System.out.println("=======================================");
            tarlaGoster();
        }
        System.out.println("=======================================");
        System.out.print("Tebrikler. Kazandınız!");
        System.out.println("=======================================");
    }
        
    // Tarla oluşturma metodu
    public void tarlaOlustur(String[][] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                if (i == 0) {
                    dizi[i][j] = " - ";
                } else if (j == 0) {
                    dizi[i][j] = " - ";
                } else if (j == dizi[0].length - 1) {
                    dizi[i][j] = " - ";
                } else if (i == dizi.length - 1) {
                    dizi[i][j] = " - ";
                } else {
                    dizi[i][j] = this.tarla[i - 1][j - 1];
                }
            }
        }
    }

    // Tarlayı seçilen değerin çevresindeki mayın sayısını hesaplama metodu
    public int getTarlaMayinliCevreHesapla(int str, int stn, String[][] dizi) {
        int sayac = 0;
        for (int i = str; i < str + 3; i++) {
            for (int j = stn; j < stn + 3; j++) {
                if (dizi[i][j].equals(" * ")) {
                    sayac++;
                }
            }
        }
        return sayac;
    }

    // Tarlayı ekrana yazdırma metodu
    public void tarlaGoster() {
        for (String[] satir : this.tarla) {
            for (String eleman : satir) {
                if (eleman.equals(" * ") || eleman.equals(" - ")) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + eleman + " ");
                }//}
            }
            System.out.println();
        }
    }

    // Mayınlı tarlayı ekrana yazdırma metodu
    public void mayinliTarlaGoster() {
        System.out.println("Mayınların Konumu");
        for (String[] sat : this.tarla) {
            for (String ele : sat) {
                System.out.print(ele);
            }
            System.out.println();
        }
    }

    // Tarlayı rastgele mayınlama metodu
    public void mayinla() {
        int str, stn;
        for (int i = 0; i < this.mayinSayisi; i++) {
            str = sayiUret.nextInt(this.tarla.length);
            stn = sayiUret.nextInt(this.tarla[0].length);
            if (this.tarla[str][stn].equals(" - ")) {
                this.tarla[str][stn] = " * ";
            } else {
                i--;
            }
        }
    }

}