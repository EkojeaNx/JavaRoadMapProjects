public class App {
    public static void main(String[] args) throws Exception {
        // Değişkenler
        int sayac = 0, kontrol = 0;

        // 1-100 arasındaki asal sayıları bulup ekrana yazdırıyoruz
        for (int sayi = 2; sayi <= 100; sayi++) {
            kontrol = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    kontrol = 1;
                    break;
                }
            }

            if (kontrol == 0) {
                System.out.print(sayi + " ");
                sayac++;
            }
        }
    }
}
