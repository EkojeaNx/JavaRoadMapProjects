// Ders sınıfı
public class Ders {
    // Ders sınıfının nitelikleri
    Ogretmen ogretmen;
    String adi;
    String dersId;
    String prefix;
    int sozluNotu;
    int sinavNotu;
    // Ders sınıfının yapıcı(Constructor) metodu
    Ders(String adi, String dersId, String prefix) {
        this.adi = adi;
        this.dersId = dersId;
        this.prefix = prefix;
        this.sozluNotu = 0;
        this.sinavNotu = 0;
    }

    // Ders sınıfının metotları

    // Öğretmen ekleme metodu
    void ogretmenEkle(Ogretmen ogretmen) {
        if (ogretmen.bolum.equals(this.prefix))
            this.ogretmen = ogretmen;
        else
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor!");
    }

    // Öğretmen bilgilerini ekrana yazan metot
    void dersOgretmeniBilgileri() {
        this.ogretmen.ogretmenBilgileri();
    }
}
