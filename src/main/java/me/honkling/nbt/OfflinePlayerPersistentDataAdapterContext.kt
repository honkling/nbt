package me.honkling.nbt

import org.bukkit.persistence.PersistentDataAdapterContext
import org.bukkit.persistence.PersistentDataContainer
import me.honkling.nbt.tag.CompoundTag

class OfflinePlayerPersistentDataAdapterContext : PersistentDataAdapterContext {
    override fun newPersistentDataContainer(): PersistentDataContainer {
        return OfflinePlayerPDC(CompoundTag("BukkitValues", emptyMap()))
    }
}