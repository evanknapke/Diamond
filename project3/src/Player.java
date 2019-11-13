public class Player extends Character {
    String name;
    private Room location;
    private int hitPoints;
    private int attack;

    public Player(String name, Room location, int hitPoints, int attack) {
        super(name, location, hitPoints, attack);
        this.name = name;
        this.location = location;
        this.hitPoints = hitPoints;
        this.attack = attack;
    }

    public Room getLocation() {
        return location;
    }

    public void setLocation(Room location) {
        this.location = location;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getAttack() {
        return attack;
    }
}
