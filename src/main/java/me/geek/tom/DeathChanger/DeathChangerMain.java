package me.geek.tom.DeathChanger;

import org.bukkit.plugin.java.JavaPlugin;

public class DeathChangerMain extends JavaPlugin {
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new DeathMessageChanger(), this);
    }
}
