/**
 * This code has been programmed by Ailakks.
 * Please, leave this note and give me credits
 * in any project in which it is used. Have a nice day!
 *
 * @author : Ailakks
 * @mailto : hola@ailakks.com
 * @created : 11/06/2023
 */

package net.hyphaelands.sunlatte.event;

import lombok.Data;
import net.hyphaelands.sunlatte.player.LatteBukkitPlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Data
public final class LattePlayerJoinEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final LatteBukkitPlayer latteBukkitPlayer;

    private boolean cancelled;

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}