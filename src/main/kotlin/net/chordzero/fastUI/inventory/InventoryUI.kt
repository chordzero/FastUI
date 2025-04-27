package net.chordzero.fastUI.inventory

import net.kyori.adventure.text.Component
import org.bukkit.Bukkit
import org.bukkit.entity.Player

class InventoryUI(
    size: Int,
    title: Component
) {
    val inventory = Bukkit.createInventory(InventoryUIHolder(this), size, title)
    private val lockedSlots = mutableSetOf<Int>()

    fun lockSlot(idx: Int) {
        lockedSlots.add(idx)
    }

    fun lockSlot(idx: IntRange) {
        lockedSlots.addAll(idx)
    }

    fun unlockSlot(idx: Int) {
        lockedSlots.remove(idx)
    }

    fun unlockSlot(idx: IntRange) {
        lockedSlots.addAll(idx)
    }

    fun isLocked(idx: Int): Boolean = idx in lockedSlots

    fun open(player: Player) {
        player.openInventory(inventory)
    }
}