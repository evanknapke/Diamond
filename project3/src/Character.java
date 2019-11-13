public class Character {
    private String name;
    private Room location;
    private int hitPoints;
    private int attack;

    public Character(String name, Room location, int hitPoints, int attack) {
        this.name = name;
        this.location = location;
        this.hitPoints = hitPoints;
        this.attack = attack;
    }
}
