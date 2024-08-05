package org.windy.autoRespawn;

import org.bukkit.plugin.java.JavaPlugin;


public final class AutoRespawn extends JavaPlugin {
    boolean enable;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new PlayerDeathListener(), this);

        String version = this.getDescription().getVersion();
        String serverName = this.getServer().getName();
        this.getServer().getConsoleSender().sendMessage(Texts.logo);
        this.getServer().getConsoleSender().sendMessage("v"+"§a" + version + "运行环境：§e " + serverName + "\n");
        enable = this.getConfig().getBoolean("enable");
        if (enable){
            getLogger().info("检测到配置文件已开启死亡自动复活，已生效！");
        }else{
            getLogger().info("检测到配置文件已关闭死亡自动复活");
        }
    }

    @Override
    public void onDisable() {
        this.getServer().getConsoleSender().sendMessage(Texts.logo);
        getLogger().info("感谢使用！");
    }
}
