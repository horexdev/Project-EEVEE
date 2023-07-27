package eevee.eeveecore.commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static org.bukkit.Bukkit.getServer;

public class Spawn implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command,
                             @NotNull String s, @NotNull String[] strings) {
        World world = getServer().getWorlds().get(0);
        Location spawnPoint = world.getSpawnLocation();

        Player player = (Player) commandSender;
        player.teleport(spawnPoint);

        return true;
    }
}
