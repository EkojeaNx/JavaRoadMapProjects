// Rastgele veri üretme kütüphanesi
import java.util.Random;

// Musabaka sınıfı
public class Musabaka {
    // Musabaka sınıfının nitelikleri
    Dovuscu dovuscu1;
    Dovuscu dovuscu2;

    int minAgirlik;
    int maxAgirlik;

    // Musabaka sınıfının yapıcı(Constructor) metodu
    Musabaka(Dovuscu dovuscu1, Dovuscu dovuscu2, int minAgirlik, int maxAgirlik) {
        this.dovuscu1 = dovuscu1;
        this.dovuscu2 = dovuscu2;
        this.minAgirlik = minAgirlik;
        this.maxAgirlik = maxAgirlik;

        System.out.println("Dövüş başladı!");
        System.out.println("------------------");
        System.out.println(this.dovuscu1.adi + " " + this.dovuscu1.can);
        System.out.println(this.dovuscu2.adi + " " + this.dovuscu2.can);
    }

    // Musabaka sınıfının metotları

    // Musabaka başlatma metodu
    public void musabakaBaslat() {
        // Dövüşçülerin ağırlık kontrolünü sağlayan metot çağrılıyor
        if (isAgirlikKontrol()) {
            // Kazanan olana kadar döngü kuruyoruz
            while (this.dovuscu1.can > 0 && this.dovuscu2.can > 0) {
                // Rastgele hasar vuruşu
                if (isHasarVur()) {
                    this.dovuscu2.can -= this.dovuscu1.hasarVur(dovuscu2);
                } else {
                    this.dovuscu1.can -= this.dovuscu2.hasarVur(dovuscu1);
                }
                
                // Kazanan olunca programı durduruyoruz
                if (isKazanan()) {
                    break;
                }
            }            
        } else {
            System.out.println("Dövüşçülerin sikletleri uyuşmamaktadır!");
        }
    }

    // Kazananı belirten metot
    boolean isKazanan() {
        if (this.dovuscu1.can <= 0) {
            System.out.println("Kazanan: " + this.dovuscu2.adi);
            return true;
        } else if (this.dovuscu2.can <= 0) {
            System.out.println("Kazanan: " + this.dovuscu1.adi);
            return true;
        } else {
            return false;
        }
    }

    // Hasarı rastgele kimin vuracağını belirleyen metot(True: dovuscu1 hasar vuruşu, False: dovuscu2 hasar vuruşu)
    boolean isHasarVur() {
        // Rastgele veri üretmek için random sınıfını kullanıyoruz
        Random random = new Random();
        return random.nextBoolean();
    }

    // Dövüşçülerin ağırlık bilgilerini kontrol eden metot
    boolean isAgirlikKontrol() {
        return (this.dovuscu1.agirlik >= this.minAgirlik && this.dovuscu1.agirlik <= this.maxAgirlik) && (this.dovuscu2.agirlik >= this.minAgirlik && this.dovuscu2.agirlik <= this.maxAgirlik);
    }
    
}
