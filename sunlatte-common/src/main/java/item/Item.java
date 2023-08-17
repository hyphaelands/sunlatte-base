package item;

import player.OnlineLattePlayer;

import java.util.List;

public class Item implements IItem {
    protected OnlineLattePlayer onlineLattePlayer;

    protected String displayName;
    protected List<String> lore;

    public Item(OnlineLattePlayer onlineLattePlayer) {
        this.onlineLattePlayer = onlineLattePlayer;
    }

    public Item build() {
        return this;
    }
}
