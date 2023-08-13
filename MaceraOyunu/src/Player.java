/* Kütüphaneler */

import java.util.Scanner;

public class Player {
    /* Nitelikler */

    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    //private Inventory inventory;

    private Scanner scanner = new Scanner(System.in);

    /* Kurucu Metot */

    public Player(String name) {
        this.name = name;
        //this.inventory = new Inventory();
    }

    /* Metotlar */

    // Oyundakı karakter sınıflarını listeleyip seçimi yaptıran metot
    public void selectChar() {
        // Karakter sınıflarını oluşturuyoruz
        GameChar[] charList = {
            new Samurai(),
            new Archer(), 
            new Knight()             
        };
        System.out.println(Colors.RED + "----------------------------------" + Colors.RESET);

        System.out.println(
            Colors.BLUE + "##########" + Colors.RESET + " " +
            Colors.GREEN_UNDERLINED + "Karakter Sınıfları" + Colors.RESET + " " +
            Colors.BLUE + "##########" + Colors.RESET);
        System.out.println();     

        // Karakter sınıflarını listeliyoruz
        for (GameChar e : charList) {
            System.out.println(
            "Id: \t" + Colors.RED + e.getId() + Colors.RESET +
            " \tKarakter Sınıfı: \t" + Colors.RED + e.getName() + Colors.RESET +
            " \t\tHasar: \t" + Colors.RED + e.getDamage() + Colors.RESET +
            " \tSağlık: \t" + Colors.RED + e.getHealth() + Colors.RESET +
            " \tPara: \t" + Colors.RED + e.getMoney() + Colors.RESET);
        }

        System.out.println();
        System.out.println(Colors.RED + "----------------------------------" + Colors.RESET);
        // Karakter sınıfı seçimini yaptırıyoruz
        System.out.print(Colors.YELLOW + "# Lütfen bir karakter seçiniz: " + Colors.RESET + Colors.GREEN_BOLD);
        int selectChar = scanner.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
                break;
        }

        System.out.println(Colors.RESET + Colors.RED + "----------------------------------" + Colors.RESET);

        // Geçersiz bir değer girerse otomatik seçim yapıldığı bilgisini iletiyoruz
        if (selectChar < 1 || selectChar > 3) {
            System.out.println(Colors.RED_BACKGROUND +"Geçersiz seçim yaptığınız için otomatik seçim yapıldı!" + Colors.RESET);
            System.out.println();
        }
        System.out.println(Colors.GREEN_BRIGHT + this.getCharName() + " Seçiminiz ziyadesiyle hoş!" + Colors.RESET);

        System.out.println(Colors.RESET + Colors.RED + "----------------------------------" + Colors.RESET);

    }

    // Seçilmiş karakter sınıfı alan metot
    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    /* Kapsülleme */

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
