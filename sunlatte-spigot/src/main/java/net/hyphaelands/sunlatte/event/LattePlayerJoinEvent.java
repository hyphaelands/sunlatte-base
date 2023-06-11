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

    public LattePlayerJoinEvent(LatteBukkitPlayer latteBukkitPlayer) {
        this.latteBukkitPlayer = latteBukkitPlayer;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}