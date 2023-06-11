package net.hyphaelands.sunlatte.player;

import org.bukkit.entity.Player;
import player.LattePlayer;

import java.util.UUID;

public abstract class LatteBukkitPlayer extends LattePlayer implements Player {
    public LatteBukkitPlayer(UUID uuid) {
        super(uuid);
    }
}
