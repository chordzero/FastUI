package net.chordzero.fastUI.event

import net.chordzero.fastUI.inventory.InventoryUIHolder
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent

object InventoryClickHandler : Listener {
    @EventHandler
    fun on(e: InventoryClickEvent) {
        val holder = e.inventory.holder
        if (holder is InventoryUIHolder) {
            // 잠긴 슬롯 클릭
            if (holder.ui.isLocked(e.rawSlot)) {
                e.isCancelled = true
            }

            // 쉬프트 클릭으로 아이템 넣는 거 방지
            if (e.isShiftClick && e.rawSlot >= holder.inventory.size) {
                e.isCancelled = true
            }
        }
    }
}