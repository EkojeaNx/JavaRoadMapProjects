public class App {
    public static void main(String[] args) throws Exception {
        // Birinci Dövüşçüyü tanımlıyoruz
        Dovuscu adamWolker = new Dovuscu("Adam Wolker", 50, 150, 100);
        // İkinci Dövüşçüyü tanımlıyoruz
        Dovuscu bruceLee = new Dovuscu("Bruce Lee", 74, 100, 80);

        // Müsabaka tanımlıyoruz
        Musabaka mac = new Musabaka(adamWolker, bruceLee, 80, 150);

        // Müsabakayı başlatıyoruz
        mac.musabakaBaslat();
    }
}
