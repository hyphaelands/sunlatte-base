/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 12/06/2023
 */

package net.hyphaelands.sunlatte.menu;

import lombok.Data;
import net.hyphaelands.sunlatte.player.LatteBukkitPlayer;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import translation.LatteTranslation;

import java.util.HashMap;
import java.util.function.Consumer;

@Data
public class BukkitMenu {
    private static final HashMap<Integer, Consumer<InventoryClickEvent>> actionHashMap = new HashMap<>();

    private final LatteBukkitPlayer latteBukkitPlayer;
    private final Inventory bukkitInventory;

    public BukkitMenu(LatteBukkitPlayer latteBukkitPlayer, LatteTranslation title) {
        this.latteBukkitPlayer = latteBukkitPlayer;

        this.bukkitInventory = Bukkit.createInventory(latteBukkitPlayer, 1, title.get());
    }
}
