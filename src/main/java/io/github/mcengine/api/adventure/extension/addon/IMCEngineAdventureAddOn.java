package io.github.mcengine.api.adventure.extension.addon;

import org.bukkit.plugin.Plugin;

/**
 * Represents an Adventure-based AddOn module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate adventure-related features into the plugin
 * via the AddOn extension system.
 */
public interface IMCEngineAdventureAddOn {

    /**
     * Called when the Adventure AddOn is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the AddOn is unloaded or disabled by the engine.
     * <p>
     * Use this method to release resources, unregister listeners,
     * or perform any necessary cleanup.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Adventure AddOn instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
