/* Kütüphaneler */

public class ToolStore extends NormalLoc {
    /* Nitelikler */

    /* Kurucu Metot */

    public ToolStore(Player player) {
        super(2, player, "Mağaza");
    }

    /* Metotlar */

    // Mağaza bölgesindeki işlemler
    @Override
    public boolean onLocation() {
        System.out.println(Colors.RED + "----------------------------------" + Colors.RESET);
        System.out.println(
            Colors.BLUE + "##########" + Colors.RESET + " " +
            Colors.GREEN_UNDERLINED + "MAĞAZA" + Colors.RESET + " " +
            Colors.BLUE + "##########" + Colors.RESET);
        System.out.println();   
        System.out.println(Colors.RED + "1. Silahlar");
        System.out.println("2. Zırhlar");
        System.out.println("3. Çıkış Yap" + Colors.RESET);

        System.out.println();
        System.out.println(Colors.RED + "----------------------------------" + Colors.RESET);

        System.out.print(Colors.YELLOW + "# İşlem Seçimini Yapınız: " + Colors.RESET + Colors.GREEN_BOLD);
        int selectCase = scanner.nextInt();
        System.out.println(Colors.RESET + Colors.RED + "----------------------------------" + Colors.RESET);

        while (selectCase < 1 ||selectCase > 3) {
            System.out.println("Geçersiz değer! Yeniden gir: ");
            selectCase = scanner.nextInt();
        }

        switch (selectCase) {
            case 1:
                printWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                printArmor();
                System.out.println("Bir daha bekleriz!");
                return true;
        }
        System.out.println(Colors.RED + "----------------------------------" + Colors.RESET);
        return true;
    }
    
    public void printWeapon() {
        System.out.println(
            Colors.BLUE + "##########" + Colors.RESET + " " +
            Colors.GREEN_UNDERLINED + "SİLAHLAR" + Colors.RESET + " " +
            Colors.BLUE + "##########" + Colors.RESET);
        System.out.println();
        for (Weapon w : Weapon.weapons()) {
            System.out.println("Id: " + Colors.RED + w.getId() + Colors.RESET +
            " Eşya: " + Colors.RED + w.getName() + Colors.RESET +
            " Hasar: " + Colors.RED + w.getDamage() + Colors.RESET +
            " Para: " + Colors.RED + w.getMoney() + Colors.RESET);
        }

        int selectWeapon = 0;
        System.out.println();
        System.out.println(Colors.RED + "----------------------------------" + Colors.RESET);

        System.out.print(Colors.YELLOW + "# Bir silah seçin: " + Colors.RESET + Colors.GREEN_BOLD);
        selectWeapon = scanner.nextInt();

        System.out.println(Colors.RESET + Colors.RED + "----------------------------------" + Colors.RESET);

        while (selectWeapon < 1 || selectWeapon > Weapon.weapons().length) {
            System.out.print("Geçersiz bir değer girdiniz! Bir eşya seçin: ");
            selectWeapon = scanner.nextInt();
        }

        Weapon eWeapon = Weapon.getWeaponById(selectWeapon);
        
        if (eWeapon != null) {
            System.out.println("Seçim yaptınız");
        }

    }

    public void printArmor() {
        System.out.println("Zırhlar");
    }

    /* Kapsülleme */
}
