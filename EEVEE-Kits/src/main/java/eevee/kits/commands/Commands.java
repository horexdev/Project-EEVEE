package eevee.kits.commands;

import eevee.httpManager.HttpManager;
import net.kyori.adventure.text.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender,
                             @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        HttpManager httpManager = new HttpManager();

        String json = httpManager.get("/users/get/elain");

        Player player = (Player) commandSender;
        player.sendMessage(Component.text(json));

        return true;
    }
}
