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

import lombok.Data;
import lombok.experimental.Accessors;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;

@Accessors(chain = true)
@Data
public abstract class BukkitItem extends ItemStack {
    private Material material;
    private String displayName;
    private List<String> lore;

    public BukkitItem build() {
        this.setType(this.material);

        this.getItemMeta().setDisplayName(this.displayName);
        this.getItemMeta().setLore(this.lore);

        return this;
    }
}
