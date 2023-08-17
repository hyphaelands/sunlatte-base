/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 11/06/2023
 */

package net.hyphaelands.sunlatte.item;

import item.Item;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import player.OnlineLattePlayer;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
public class BukkitItem extends Item {
    private ItemStack itemStack;

    private Material material;

    public BukkitItem(OnlineLattePlayer onlineLattePlayer, Material material) {
        super(onlineLattePlayer);
    }

    @Override
    public BukkitItem build() {
        this.itemStack.setType(this.material);

        this.itemStack.getItemMeta().setDisplayName(this.displayName);
        this.itemStack.getItemMeta().setLore(this.lore);

        return this;
    }
}
