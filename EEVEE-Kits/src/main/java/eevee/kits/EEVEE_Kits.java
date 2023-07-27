package eevee.kits;

import eevee.kits.commands.Commands;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

public final class EEVEE_Kits extends JavaPlugin {
    private static Logger Logger;

    @Override
    public void onEnable() {
        Logger = super.getLogger();

        try {
            Objects.requireNonNull(this.getCommand("test")).setExecutor(new Commands());

            Logger.info("Тестовый плагин загружен");
        }
        catch (Exception e) {
            Logger.info(e.getMessage());

            Logger.info("Тестовый плагин не смог загрузиться");
        }
    }

    @Override
    public void onDisable() {
        Logger.info("Тестовый плагин ушел спать");
    }
}
