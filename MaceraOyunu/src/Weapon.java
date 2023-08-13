/* Kütüphaneler */

public class Weapon {
    /* Nitelikler */

    private int id;
    private String name;
    private int damage;
    private int money;

    /* Kurucu Metot */

    public Weapon(int id, String name, int damage, int money) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.money = money;
    }

    /* Metotlar */

    // Weapon listesi metodu
    public static Weapon[] weapons() {
        Weapon[] weaponList = {
            new Weapon(1, "Tabanca", 2, 25),
            new Weapon(2, "Kılıç", 3, 35),
            new Weapon(3, "Tüfek", 7, 45)
        };

        return weaponList;
    }

    // İd bilgisi ile Weapon seçimi yapan metot
    public static Weapon getWeaponById(int i) {
        Weapon selectWeapon = null;
        for (Weapon w : Weapon.weapons()) {
            if (w.getId() == i) {
                selectWeapon = w;
            }
        }

        return selectWeapon;
    }

    /* Kapsülleme */

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
