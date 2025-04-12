package dev.Aangepast.antiElytra.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.inventory.ItemStack;

public class onItemPickup implements Listener {

    @EventHandler
    public void onItemPickupEvent(EntityPickupItemEvent e) {
        if(e.getItem().getItemStack().getType() == Material.ELYTRA) {
            e.setCancelled(true);
            e.getItem().setItemStack(new ItemStack(Material.AIR));
        }
    }

}
