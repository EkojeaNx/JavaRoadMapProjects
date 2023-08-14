public class Game {
    /* Metotlar */

    // Macera Oyununu başlatan metot
    public void start() {
        // Giriş cümlesi
        GameBase.title("MACERA OYUNU");
        GameBase.line();
        System.out.println(GameBase.PURPLE + "Macera Oyununa Hoş Geldiniz!" +  GameBase.RESET);

        // Oyun hakkındaki bilgileri metot ile çağırıyoruz
        about();        

        // Oyuncu adını alıyoruz ve ekrana basıyoruz
        GameBase.playerInput("Lütfen oyuncu isminizi giriniz: ");
        //String playerName = GameBase.scanner.nextLine();
        System.out.println();
        Player player = new Player("EKREM"/*playerName*/);
        GameBase.resetLine();

        // Oyuna başladığını belirtiyoruz
        System.out.println(GameBase.BLUE_BOLD_BRIGHT + "Bu puslu macera oyununa hoş geldin " + player.getName() + "!" + GameBase.RESET);

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

            GameBase.title("Bölgeler");
            System.out.println();   

            // Bölgeleri listeliyoruz
            for (Location e : locations) {
                System.out.println(
                    "Id: \t" + GameBase.RED + e.getId() + GameBase.RESET + 
                    " \tBölge: \t" + GameBase.RED + e.getName() + GameBase.RESET);
            }

            System.out.println();
            GameBase.line();

            // Bölgeyi oyuncudan alıyoruz
            GameBase.playerInput("Gideceğiniz bölgeyi seçin: ");
            selectLoc = GameBase.scanner.nextInt();

            // Seçilen bölgenin işlevlerini gerçekleştiriyorlar
            switch (selectLoc) {
                case 1:
                    location = locations[0];
                    break;
                case 2:
                    location = locations[1];
                    break;        
                default:
                    location = locations[0];
                    break;
            }

            GameBase.line();
            GameBase.informationText("Seçilen bölge: " + location.getName());
            //System.out.println(GameBase.RESET + GameBase.GREEN_BRIGHT + "Seçilen bölge: " + location.getName() + GameBase.RESET);
            
            location.onLocation();
        }
    }

    // Oyun hakkındakileri bilgilendirme metodu
    public void about() {
        System.out.println();
        System.out.println(GameBase.RED_UNDERLINED + "### Oyun Hakkında ###" + GameBase.RESET);
        System.out.println();
        System.out.println(GameBase.GREEN + 
        "$ Oyuna başladığınızda oyuncu isminizi giriyorsunuz.\n" + 
        "$ Karakter sınıfları listelenir ve id bilgisi ile karakter seçimi yapılır.\n" +
        "$ Karakter sınıfı seçiminde geçersiz bir değer girdiğinizde 1. Sınıfı otomatik seçim yapılır.\n" +
        "$ Bölgeler listelenir ve id bilgisi ile bölge seçimi yapılır.\n" +
        "$ Bölge seçiminde geçersiz bir değer girdiğinizde 1. Bölge (Güvenli Ev) otomatik seçim yapılır." +
        GameBase.RESET);
        System.out.println();
        GameBase.line();
    }
}
