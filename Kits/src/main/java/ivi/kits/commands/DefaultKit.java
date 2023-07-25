package ivi.kits.commands;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class DefaultKit implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command,
                             @NotNull String s, @NotNull String[] strings) {
        Player player = (Player) commandSender;
        ItemStack itemStack = new ItemStack(Material.DIAMOND, 64);

        player.getInventory().addItem(itemStack);

        return true;
    }
}
