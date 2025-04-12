package dev.Aangepast.antiElytra.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class onInventoryClick implements Listener {

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent e) {

        // Normal click fix

        if(e.getCursor() != null && e.getCursor().getType() == Material.ELYTRA){
            e.setCancelled(true);
            e.getWhoClicked().setItemOnCursor(new ItemStack(Material.AIR));
        }

        // Shift + click fix

        if (e.getCurrentItem() != null && e.getCurrentItem().getType() == Material.ELYTRA) {
            e.setCancelled(true);
            e.setCurrentItem(new ItemStack(Material.AIR));
        }
    }

}
