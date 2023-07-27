package eevee.eeveecore;

import eevee.eeveecore.commands.Spawn;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class EEVEE_Core extends JavaPlugin {

    @Override
    public void onEnable() {

        Objects.requireNonNull(getCommand("Spawn")).setExecutor(new Spawn());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
