public class ToolStore extends NormalLoc {
    /* Kurucu Metot */
    public ToolStore(Player player) {
        super(2, player, "Mağaza");
    }

    /* Metotlar */

    // Mağaza bölgesindeki işlemler
    @Override
    public boolean onLocation() {
        // Başlık        
        GameBase.line();
        GameBase.title("MAĞAZA");

        // İşlemler
        System.out.println(); 
        
        // Seçilebilecek işlemleri listeliyoruz
        System.out.println(GameBase.RED + "1. Silahlar");
        System.out.println("2. Zırhlar");
        System.out.println("3. Çıkış Yap" + GameBase.RESET);

        System.out.println();
        GameBase.line();

        GameBase.playerInput("İşlem Seçimini Yapınız: ");
        int selectCase = GameBase.scanner.nextInt();
        GameBase.resetLine();

        while (selectCase < 1 ||selectCase > 3) {
            GameBase.playerInput("Geçersiz değer! Yeniden gir: ");
            selectCase = GameBase.scanner.nextInt();
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
        GameBase.line();
        return true;
    }
    
    public void printWeapon() {
        GameBase.title("SİLAHLAR");           
        System.out.println();

        for (Weapon w : Weapon.weapons()) {
            System.out.println("Id: " + GameBase.RED + w.getId() + GameBase.RESET +
            " Eşya: " + GameBase.RED + w.getName() + GameBase.RESET +
            " Hasar: " + GameBase.RED + w.getDamage() + GameBase.RESET +
            " Para: " + GameBase.RED + w.getMoney() + GameBase.RESET);
        }

        int selectWeapon = 0;
        System.out.println();
        GameBase.line();

        GameBase.playerInput("Bir silah seçin: ");
        selectWeapon = GameBase.scanner.nextInt();

        GameBase.resetLine();

        while (selectWeapon < 1 || selectWeapon > Weapon.weapons().length) {
            GameBase.warningText("Geçersiz bir değer girdiniz!");

            GameBase.playerInput("Bir silah seçin: ");
            //System.out.print("Geçersiz bir değer girdiniz! Bir eşya seçin: ");
            selectWeapon = GameBase.scanner.nextInt();
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
