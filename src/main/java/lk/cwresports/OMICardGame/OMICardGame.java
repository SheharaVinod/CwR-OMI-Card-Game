package lk.cwresports.OMICardGame;

import org.bukkit.plugin.java.JavaPlugin;

public final class OMICardGame extends JavaPlugin {

    private static OMICardGame instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static OMICardGame getInstance() {
        return instance;
    }
}
