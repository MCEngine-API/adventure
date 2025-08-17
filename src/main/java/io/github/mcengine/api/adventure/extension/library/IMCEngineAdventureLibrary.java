package io.github.mcengine.api.adventure.extension.library;

import org.bukkit.plugin.Plugin;

/**
 * Represents an Adventure-based Library module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to provide adventure-related library support to the system.
 */
public interface IMCEngineAdventureLibrary {

    /**
     * Called when the Adventure Library is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Adventure Library is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Adventure Library instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
