package winlyps.noEXP

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.ExpBottleEvent
import org.bukkit.event.player.PlayerExpChangeEvent
import org.bukkit.plugin.java.JavaPlugin

class ExperiencePickupListener(private val plugin: JavaPlugin) : Listener {

    @EventHandler
    fun onPlayerExpChange(event: PlayerExpChangeEvent) {
        // Cancel the event to prevent the player from picking up experience orbs
        event.amount = 0
    }

    @EventHandler
    fun onExpBottleEvent(event: ExpBottleEvent) {
        // Cancel the event to prevent experience orbs from being created when a bottle breaks
        event.experience = 0
    }
}