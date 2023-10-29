public class GameEntity {
}
class Character extends GameEntity {
    private String name;

    public Character(String name) {
        this.name = name;
        // Character-specific attributes and behaviors
    }
}

class Enemy extends GameEntity {
    private String name;

    public Enemy(String name) {
        this.name = name;
        // Enemy-specific attributes and behaviors
    }
}
