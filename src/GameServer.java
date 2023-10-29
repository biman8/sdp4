import java.util.ArrayList;
import java.util.List;
public class GameServer {
    private List<Player> players = new ArrayList<>();

    public void subscribe(Player player) {
        players.add(player);
    }

    public void unsubscribe(Player player) {
        players.remove(player);
    }

    public void notify(String event) {
        for (Player player : players) {
            player.update(event);
        }
    }
}
