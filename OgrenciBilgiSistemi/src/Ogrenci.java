// Öğrenci sınıfı
public class Ogrenci {
    // Öğrenci sınıfının nitelikleri
    String no;
    String sinifi;
    String adi;
    String soyadi;
    double ortalama;
    boolean isDersDurum;

    Ders ders1;
    Ders ders2;
    Ders ders3;

    // Öğrenci sınıfının yapıcı(Constructor) metodu
    Ogrenci(String no, String sinifi, String adi, String soyadi, Ders ders1, Ders ders2, Ders ders3) {
        this.no = no;
        this.sinifi = sinifi;
        this.adi = adi;
        this.soyadi = soyadi;
        this.ders1 = ders1;
        this.ders2 = ders2;
        this.ders3 = ders3;

        this.ortalama = 0.0;
        this.isDersDurum = false;
    }

    // Öğrenci sınıfının metotları

    // ders notu ekleme metodu
    void dersNotuEkle(int ders1SozluNotu, int ders1SinavNotu, int ders2SozluNotu, int ders2SinavNotu, int ders3SozluNotu, int ders3SinavNotu) {
        this.ders1.sozluNotu = ders1SozluNotu >= 0 && ders1SozluNotu <= 100 ? ders1SozluNotu : 0;
        this.ders1.sinavNotu = ders1SinavNotu >= 0 && ders1SinavNotu <= 100 ? ders1SinavNotu : 0;

        this.ders2.sozluNotu = ders2SozluNotu >= 0 && ders2SozluNotu <= 100 ? ders2SozluNotu : 0;
        this.ders2.sinavNotu = ders2SinavNotu >= 0 && ders2SinavNotu <= 100 ? ders2SinavNotu : 0;

        this.ders3.sozluNotu = ders3SozluNotu >= 0 && ders3SozluNotu <= 100 ? ders3SozluNotu : 0;
        this.ders3.sinavNotu = ders3SinavNotu >= 0 && ders3SinavNotu <= 100 ? ders3SinavNotu : 0;
    }

    // ders notlarını ekrana yazan metot
    void dersNotlariYazdir() {
        System.out.println(this.ders1.adi + " Sözlü Notu: " + this.ders1.sozluNotu + " Sınav Notu: " + this.ders1.sinavNotu);
        System.out.println(this.ders2.adi + " Sözlü Notu: " + this.ders2.sozluNotu + " Sınav Notu: " + this.ders2.sinavNotu);
        System.out.println(this.ders3.adi + " Sözlü Notu: " + this.ders3.sozluNotu + " Sınav Notu: " + this.ders3.sinavNotu);
    }

    // öğrencinin sınıfını geçiş durumu hesaplayan metot (Sözlü notlarını %20 Sınav notlarını %80 olarak ortalama hesaplıyoruz)
    void isSinifGecisDurumu() {
        this.ortalama = (((this.ders1.sozluNotu * 0.20) + (this.ders1.sinavNotu * 0.80)) +
                        ((this.ders2.sozluNotu * 0.20) + (this.ders2.sinavNotu * 0.80)) +
                        ((this.ders3.sozluNotu * 0.20) + (this.ders3.sinavNotu * 0.80))) / 3;

        if (this.ortalama >= 50) {
            System.out.println("Sınıfı geçtiniz! Ortalama Notunuz: " + this.ortalama);
            this.isDersDurum = true;
        } else {
            System.out.println("Üzgünüm! Sınıfta kaldınız! Ortalama Notunuz: " + this.ortalama);
            this.isDersDurum = false;
        }
    }
}
