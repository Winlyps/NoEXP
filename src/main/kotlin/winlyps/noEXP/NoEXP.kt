package winlyps.noEXP

import org.bukkit.plugin.java.JavaPlugin

class NoEXP : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        getServer().pluginManager.registerEvents(ExperiencePickupListener(this), this)
        logger.info("NoEXP plugin has been enabled.")
    }

    override fun onDisable() {
        logger.info("NoEXP plugin has been disabled.")
    }
}