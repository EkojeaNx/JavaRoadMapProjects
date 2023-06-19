// Öğretmen sınıfı
public class Ogretmen {
    // Öğretmen sınıfının nitelikleri
    String adi;
    String soyadi;
    String bolum;
    String telefonNumarasi;

    // Öğretmen sınıfının yapıcı(Constructor) metodu
    Ogretmen(String adi, String soyadi, String bolum, String telefonNumarasi) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.bolum = bolum;
        this.telefonNumarasi = telefonNumarasi;
    }

    // Öğretmen sınıfının metotları

    // öğretmen bilgilerini ekrana yazan metot
    void ogretmenBilgileri() {
        System.out.println("Öğretmenin Adı: " + this.adi);
        System.out.println("Öğretmenin Soyadı: " + this.soyadi);
        System.out.println("Öğretmenin Bölümü: " + this.bolum);
        System.out.println("Öğretmenin Telefon Numarası: " + this.telefonNumarasi);
    }
}
