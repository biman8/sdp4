public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void update(String event) {
        System.out.println(name + " received an event: " + event);
    }
}