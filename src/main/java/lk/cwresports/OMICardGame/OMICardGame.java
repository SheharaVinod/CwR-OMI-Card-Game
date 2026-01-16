package lk.cwresports.OMICardGame;

import lk.cwresports.OMICardGame.Commands.OMIAdminCommands;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class OMICardGame extends JavaPlugin {

    private static OMICardGame instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

        Objects.requireNonNull(getCommand("omi-admin")).setExecutor(new OMIAdminCommands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static OMICardGame getInstance() {
        return instance;
    }
}
