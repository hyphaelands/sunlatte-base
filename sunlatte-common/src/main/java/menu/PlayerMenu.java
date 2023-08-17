package menu;

import callback.InventoryClickCallback;
import lombok.Data;
import player.OnlineLattePlayer;
import translation.LatteTranslation;

import java.util.HashMap;
import java.util.function.Consumer;

@Data
public class PlayerMenu {
    private static final HashMap<Integer, Consumer<InventoryClickCallback>> actionHashMap = new HashMap<>();

    private final OnlineLattePlayer onlineLattePlayer;

    public PlayerMenu(OnlineLattePlayer onlineLattePlayer, LatteTranslation title) {
        this.onlineLattePlayer = onlineLattePlayer;
    }
}
