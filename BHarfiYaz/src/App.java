public class App {
    public static void main(String[] args) throws Exception {
        // B harfi için çok boyutlu dizi tanımlıyoruz.
        String[][] harf = new String[6][4];

        // B harfi yazdırabilmek için çoklu dizinin gerekli yerlere * ekleyen döngü
        for (int i = 0; i < harf.length; i++) {
            for (int j = 0; j < harf[i].length; j++) {
                if (i == 0 || i == 2 || i == 5) {
                    harf[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    harf[i][j] = " * ";
                } else {
                    harf[i][j] = "   .";
                }
            }
        }

        // B harfini ekrana yazdırıyoruz
        for (String[] satir : harf){
            for (String sutun : satir){
                System.out.print(sutun);
            }
            System.out.println();
        }
    }
}
