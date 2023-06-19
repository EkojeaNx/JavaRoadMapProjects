public class App {
    public static void main(String[] args) throws Exception {

        // Öğretmenlerin tanımlanması
        Ogretmen tarihOgretmeni = new Ogretmen("Bahadır", "Yücel", "TRH", "05555555555");
        Ogretmen matematikOgretmeni = new Ogretmen("Bilal", "Koçyiğit", "MAT", "0555555555");
        Ogretmen fizikOgretmeni = new Ogretmen("Zalim", "Kral", "FZK", "055555555");
        
        
        // Derslerin tanımlanması ve derslere öğretmen eklenmesi
        Ders tarihDersi = new Ders("Tarih", "101", "TRH");
        tarihDersi.ogretmenEkle(tarihOgretmeni);
        Ders matematikDersi = new Ders("Matematik", "102", "MAT");
        matematikDersi.ogretmenEkle(matematikOgretmeni);
        Ders fizikDersi = new Ders("Fizik", "103", "FZK");
        fizikDersi.ogretmenEkle(fizikOgretmeni);

        // Öğrencinin tanımlanması ve öğrenciye not girişi
        Ogrenci ogr1 = new Ogrenci("1", "1-A", "Türkeş Ekrem", "ŞENTÜRK", tarihDersi, matematikDersi, fizikDersi);

        ogr1.dersNotuEkle(100, 50, 40, 10, 50, 50);

        // Öğrencinin derslerinin öğretmen bilgilerini ekrana yazdırıyoruz
        ogr1.ders1.dersOgretmeniBilgileri();
        System.out.println("-------------------------------");
        ogr1.ders2.dersOgretmeniBilgileri();
        System.out.println("-------------------------------");
        ogr1.ders3.dersOgretmeniBilgileri();
        System.out.println("-------------------------------");

        // Öğrencinin derslerinin notlarını ekrana yazdırıyoruz
        ogr1.dersNotlariYazdir();

        // Öğrencinin sınıfı geçiş durumunu ekrana yazdırıyoruz
        ogr1.isSinifGecisDurumu();
        
    }
}
