package dev.Aangepast.antiElytra.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.ItemStack;

public class onHopperPickup implements Listener {

    @EventHandler
    public void onInventoryMoveEvent(InventoryMoveItemEvent e) {
        if(e.getItem().getType() == Material.ELYTRA) {
            e.setCancelled(true);
            e.setItem(new ItemStack(Material.AIR));
        }
    }

}
