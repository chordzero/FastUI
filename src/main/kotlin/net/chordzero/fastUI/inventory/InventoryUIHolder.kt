package net.chordzero.fastUI.inventory

import org.bukkit.inventory.Inventory
import org.bukkit.inventory.InventoryHolder

class InventoryUIHolder(val ui: InventoryUI) : InventoryHolder {
    override fun getInventory(): Inventory {
        return ui.inventory
    }
}