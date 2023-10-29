public class Main {
    public static void main(String[] args) {
        GameServer server = new GameServer();
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        server.subscribe(player1);
        server.subscribe(player2);

        GameEntityFactory entityFactory = new CharacterFactory();
        GameEntity character1 = entityFactory.createEntity("Warrior");
        GameEntity character2 = entityFactory.createEntity("Wizard");

        server.notify("A dragon appeared in the game!");
    }
}
