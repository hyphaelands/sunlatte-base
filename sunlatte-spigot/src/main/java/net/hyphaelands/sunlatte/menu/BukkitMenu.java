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
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import menu.PlayerMenu;
import net.hyphaelands.sunlatte.player.LatteBukkitPlayer;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import translation.LatteTranslation;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class BukkitMenu extends PlayerMenu {
    private final Inventory bukkitInventory;

    public BukkitMenu(LatteBukkitPlayer latteBukkitPlayer, LatteTranslation title) {
        super(latteBukkitPlayer, title);

        this.bukkitInventory = Bukkit.createInventory(latteBukkitPlayer, 1, title.get());
    }

    @Override
    public void open() {
        ((LatteBukkitPlayer) this.onlineLattePlayer).openInventory(this.bukkitInventory);
    }

    @Override
    public void close() {
        ((LatteBukkitPlayer) this.onlineLattePlayer).closeInventory();
    }
}
