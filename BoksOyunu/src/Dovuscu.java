// Dovuscu sınıfı
public class Dovuscu {
    // Dovuscu sınıfının nitelikleri
    String adi;
    int hasar;
    int can;
    int agirlik;

    // Dovuscu sınıfının yapıcı(Constructor) metodu
    Dovuscu(String adi, int hasar, int can, int agirlik) {
        this.adi = adi;
        this.hasar = hasar;
        this.can = can;
        this.agirlik = agirlik;
    }

    // Dovuscu sınıfının metotları

    // Hasar vurma metodu
    int hasarVur(Dovuscu hasarVurulanDovuscu) {
        System.out.println(this.adi + " => " + hasarVurulanDovuscu.adi + " " + this.hasar + " hasar vurdu.");
        return this.hasar;
    }
}
