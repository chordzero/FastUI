package net.chordzero.fastUI

import net.chordzero.fastUI.event.InventoryClickHandler
import org.bukkit.plugin.java.JavaPlugin

class FastUI : JavaPlugin() {

    override fun onEnable() {
        server.pluginManager.registerEvents(InventoryClickHandler, this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
