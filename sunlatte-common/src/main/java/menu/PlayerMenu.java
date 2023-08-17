package menu;

import callback.InventoryClickCallback;
import lombok.Data;
import player.OnlineLattePlayer;
import translation.LatteTranslation;

import java.util.HashMap;
import java.util.function.Consumer;

@Data
public class PlayerMenu implements IPlayerMenu {
    private static final HashMap<Integer, Consumer<InventoryClickCallback>> actionHashMap = new HashMap<>();

    protected final OnlineLattePlayer onlineLattePlayer;

    public PlayerMenu(OnlineLattePlayer onlineLattePlayer, LatteTranslation title) {
        this.onlineLattePlayer = onlineLattePlayer;
    }

    public void open() {

    }

    public void close() {

    }

    public void onOpen() {

    }

    public void onClose() {

    }

    public void onRefresh() {

    }
}
