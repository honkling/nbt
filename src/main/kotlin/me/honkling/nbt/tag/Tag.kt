package me.honkling.nbt.tag

open class Tag<T>(
    val type: TagType,
    open val name: String,
    open val value: T
)
