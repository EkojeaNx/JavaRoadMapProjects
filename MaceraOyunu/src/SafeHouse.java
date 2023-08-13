/* Kütüphaneler */

public class SafeHouse extends NormalLoc {
    /* Nitelikler */

    /* Kurucu Metot */

    public SafeHouse(Player player) {
        super(1, player, "Güvenli Ev");
    }

    /* Metotlar */

    // Güvenli Ev bölgesindeki işlemler
    @Override
    public boolean onLocation() {
        System.out.println(Colors.RED + "----------------------------------" + Colors.RESET);
        System.out.println(
            Colors.BLUE + "##########" + Colors.RESET + " " +
            Colors.GREEN_UNDERLINED + "Güvenli Ev" + Colors.RESET + " " +
            Colors.BLUE + "##########" + Colors.RESET);
        System.out.println();

        System.out.println(Colors.YELLOW + ">" + Colors.RESET + Colors.BLUE_BOLD_BRIGHT + " Canınız yenilendi!" + Colors.RESET);
        //System.out.println(Colors.YELLOW + ">" + Colors.RESET + Colors.BLUE_BOLD_BRIGHT + " Canınız: " + this.getPlayer().getHealth() + Colors.RESET);

        System.out.println(Colors.RED + "----------------------------------" + Colors.RESET);
        return true;
    }   
    
}
