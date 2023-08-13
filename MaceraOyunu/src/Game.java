/* Kütüphaneler */

import java.util.Scanner;

public class Game {
    /* Nitelikler */

    private Scanner scanner = new Scanner(System.in);

    /* Kurucu Metot */

    /* Metotlar */

    // Macera Oyununu başlatan metot
    public void start() {
        // Giriş cümlesi
        System.out.println(
            Colors.BLUE + "##########" + Colors.RESET + " " +
            Colors.GREEN_UNDERLINED + "MACERA OYUNU" + Colors.RESET + " " +
            Colors.BLUE + "##########" + Colors.RESET);

        System.out.println(Colors.RED + "----------------------------------" + Colors.RESET);
        System.out.println(Colors.PURPLE + "Macera Oyununa Hoş Geldiniz!" +  Colors.RESET);

        // Oyun hakkındaki bilgileri metot ile çağırıyoruz
        about();        

        // Oyuncu adını alıyoruz ve ekrana basıyoruz
        System.out.print(Colors.YELLOW + "# Lütfen oyuncu isminizi giriniz: " + Colors.RESET + 
        Colors.GREEN_BOLD);
        //String playerName = scanner.nextLine();
        System.out.println();
        Player player = new Player("EKREM"/*playerName*/);
        System.out.println(Colors.RESET +
            Colors.RED + "----------------------------------" + Colors.RESET);
        System.out.println(Colors.BLUE_BOLD_BRIGHT + "Bu puslu macera oyununa hoş geldin " + player.getName() + "!" + Colors.RESET);

        // Oyuncunun karakter sınıfını listeleyip seçimini selectChar metodu ile yaptırıyoruz
        player.selectChar();

        // Oyundaki Bölgeler
        Location[] locations = {
                new SafeHouse(player),
                new ToolStore(player)
        };

        // Bölgeler listelenip bölge seçimi
        while (true) {
            int selectLoc = 0;
            Location location = null;

            System.out.println(
            Colors.BLUE + "##########" + Colors.RESET + " " +
            Colors.GREEN_UNDERLINED + "Bölgeler" + Colors.RESET + " " +
            Colors.BLUE + "##########" + Colors.RESET);
            System.out.println();   

            // Bölgeleri listeliyoruz
            for (Location e : locations) {
                System.out.println("Id: \t" + Colors.RED + e.getId() + Colors.RESET + 
                " \tBölge: \t" + Colors.RED + e.getName() + Colors.RESET);
            }

            System.out.println();
            System.out.println(Colors.RED + "----------------------------------" + Colors.RESET);

            // Bölgeyi oyuncudan alıyoruz
            System.out.print(Colors.YELLOW + "# Gideceğiniz bölgeyi seçin: " + Colors.RESET + Colors.GREEN_BOLD);
            selectLoc = scanner.nextInt();

            // Seçilen bölgenin işlevlerini gerçekleştiriyorlar
            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;        
                default:
                    location = new SafeHouse(player);
                    break;
            }

            System.out.println(Colors.RED + "----------------------------------" + Colors.RESET);
            System.out.println(Colors.RESET + Colors.GREEN_BRIGHT + "Seçilen bölge: " + location.getName() + Colors.RESET);
            
            location.onLocation();
        }
    }

    // Oyun Hakkındaki Metot
    public void about() {
        System.out.println();
        System.out.println(Colors.RED_UNDERLINED + "### Oyun Hakkında ###" + Colors.RESET);
        System.out.println();
        System.out.println(Colors.GREEN + 
        "$ Oyuna başladığınızda oyuncu isminizi giriyorsunuz.\n" + 
        "$ Karakter sınıfları listelenir ve id bilgisi ile karakter seçimi yapılır.\n" +
        "$ Karakter sınıfı seçiminde geçersiz bir değer girdiğinizde 1. Sınıfı otomatik seçim yapılır.\n" +
        "$ Bölgeler listelenir ve id bilgisi ile bölge seçimi yapılır.\n" +
        "$ Bölge seçiminde geçersiz bir değer girdiğinizde 1. Bölge (Güvenli Ev) otomatik seçim yapılır." +
        Colors.RESET);
        System.out.println();
        System.out.println(Colors.RED + "----------------------------------" + Colors.RESET);
    }

    /* Kapsülleme */
}
