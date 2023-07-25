package ivi.kits;

import ivi.kits.commands.DefaultKit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

public final class Kits extends JavaPlugin {
    private static Logger Logger;

    @Override
    public void onEnable() {
        Logger = super.getLogger();

        try {
            Objects.requireNonNull(this.getCommand("defaultKit")).setExecutor(new DefaultKit());

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
