public class SafeHouse extends NormalLoc {
    /* Kurucu Metot */
    public SafeHouse(Player player) {
        super(1, player, "Güvenli Ev");
    }

    /* Metotlar */

    // Güvenli Ev bölgesindeki işlemler
    @Override
    public boolean onLocation() {
        // Başlık
        GameBase.line();
        GameBase.title("Güvenli Ev");

        System.out.println();

        // İşlemler
        System.out.println(GameBase.YELLOW + ">" + GameBase.RESET + GameBase.BLUE_BOLD_BRIGHT + " Canınız yenilendi!" + GameBase.RESET);

        GameBase.line();
        return true;
    }   
    
}
