package me.syari.ss.world

import me.syari.ss.core.auto.Event
import me.syari.ss.core.auto.OnEnable
import me.syari.ss.world.event.AreaEventListener
import me.syari.ss.world.event.SpawnEventListener
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    companion object {
        lateinit var worldPlugin: JavaPlugin
    }

    override fun onEnable() {
        worldPlugin = this
        OnEnable.register(CommandCreator)
        Event.register(this, SpawnEventListener, AreaEventListener)
    }
}