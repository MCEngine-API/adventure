package io.github.mcengine.api.adventure.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Represents an Adventure-based API module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to provide adventure-related APIs to the system.
 */
public interface IMCEngineAdventureAPI {

    /**
     * Called when the Adventure API is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Adventure API is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Adventure API instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
