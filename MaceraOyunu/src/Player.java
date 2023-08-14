public class Player {
    /* Nitelikler */

    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    //private Inventory inventory;

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

        GameBase.line();

        GameBase.title("Karakter Sınıfları");
        System.out.println();     

        // Karakter sınıflarını listeliyoruz
        for (GameChar e : charList) {
            System.out.println(
            "Id: \t" + GameBase.RED + e.getId() + GameBase.RESET +
            " \tKarakter Sınıfı: \t" + GameBase.RED + e.getName() + GameBase.RESET +
            " \t\tHasar: \t" + GameBase.RED + e.getDamage() + GameBase.RESET +
            " \tSağlık: \t" + GameBase.RED + e.getHealth() + GameBase.RESET +
            " \tPara: \t" + GameBase.RED + e.getMoney() + GameBase.RESET);
        }

        System.out.println();
        GameBase.line();

        // Karakter sınıfı seçimini yaptırıyoruz
        GameBase.playerInput("Lütfen bir karakter seçiniz: ");
        int selectChar = GameBase.scanner.nextInt();

        // Seçim yapılan karakter sınıfını initPlayer metodu ile oluşturuyoruz
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

        GameBase.resetLine();

        // Geçersiz bir değer girerse otomatik seçim yapıldığı bilgisini iletiyoruz
        if (selectChar < 1 || selectChar > 3) {
            GameBase.warningText("Geçersiz seçim yaptığınız için otomatik seçim yapıldı!");
        }

        // Seçilen karakter sınıfı bilgisini veriyoruz
        GameBase.informationText(this.getCharName() + " seçiminiz ziyadesiyle hoş!");
        //System.out.println(GameBase.GREEN_BRIGHT + this.getCharName() + " Seçiminiz ziyadesiyle hoş!" + GameBase.RESET);

        GameBase.resetLine();

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
