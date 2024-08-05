package org.windy.autoRespawn;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class PlayerDeathListener implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        boolean enable = JavaPlugin.getPlugin(AutoRespawn.class).getConfig().getBoolean("enable");
        new BukkitRunnable() {
            @Override
            public void run() {
                event.getEntity().spigot().respawn();
                if(enable) {
                    JavaPlugin.getPlugin(AutoRespawn.class).getLogger().info(event.getEntity().getName() + "死掉了，已自动复活！");
                }
            }
        }.runTaskLater(JavaPlugin.getPlugin(AutoRespawn.class), 1L);
    }
}
