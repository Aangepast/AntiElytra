package dev.Aangepast.antiElytra;

import dev.Aangepast.antiElytra.listeners.onInventoryClick;
import dev.Aangepast.antiElytra.listeners.onItemPickup;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getPluginManager().registerEvents(new onInventoryClick(), this);
        Bukkit.getPluginManager().registerEvents(new onItemPickup(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
