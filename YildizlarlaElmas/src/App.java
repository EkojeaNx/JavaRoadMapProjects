public class App {
    public static void main(String[] args) throws Exception {
        // Değişkenler
        int sayi = 5, bosluk = sayi - 1, uzunluk = 1;

        // Yıldız(*) ile elmas yapıyoruz
        for (int i = 1; i <= sayi * 2 - 1; i++) {

            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }

            for (int d = 0; d <= uzunluk; d++) {
                System.out.print("*");
            }

            if (i < sayi) {
                bosluk--;
                uzunluk += 2;
            } else {
                bosluk++;
                uzunluk -= 2;
            }

            System.out.println();
        }
    }
}
