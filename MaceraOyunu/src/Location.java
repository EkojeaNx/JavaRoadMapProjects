public abstract class Location {
    /* Nitelikler */
    private int id;
    private Player player;
    private String name;

    /* Kurucu Metot */
    public Location(int id, Player player, String name) {
        this.id = id;
        this.player = player;
        this.name = name;
    }

    /* Metotlar */

    public abstract boolean onLocation();

    /* Kapsülleme */

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
