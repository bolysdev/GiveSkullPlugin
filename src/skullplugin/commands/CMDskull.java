package skullplugin.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import skullplugin.util.FileManager;

public class CMDskull
implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player)sender;
        FileManager fm = new FileManager();
        if (p.hasPermission("skull.give")) {
            if (args.length == 0) {
                // Выдаём голову самого игрока
                ItemStack head = new ItemStack(Material.PLAYER_HEAD, 1);
                SkullMeta meta = (SkullMeta)head.getItemMeta();
                meta.setOwner(p.getName());
                meta.setDisplayName(p.getName());
                head.setItemMeta((ItemMeta)meta);
                p.getInventory().addItem(new ItemStack[]{head});
                return true;
            } else if (args.length == 1) {
                ItemStack head = new ItemStack(Material.PLAYER_HEAD, 1);
                SkullMeta meta = (SkullMeta)head.getItemMeta();
                meta.setOwner(args[0]);
                meta.setDisplayName(args[0]);
                head.setItemMeta((ItemMeta)meta);
                p.getInventory().addItem(new ItemStack[]{head});
                return true;
            } else if (fm.getLang().equalsIgnoreCase("german")) {
                p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lBitte spezifiziere einen Spieler!");
            } else if (fm.getLang().equalsIgnoreCase("russian")) {
                p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lПожалуйста, укажите никнейм игрока!");
            } else if (fm.getLang().equalsIgnoreCase("english")) {
                p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lPlease specify a Player!");
            } else if (fm.getLang().equalsIgnoreCase("kazakh")) {
                p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lӨтініш, ойыншының атын көрсетіңіз!");
            } else {
                p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lPlease specify a Player!");
            }
        } else if (fm.getLang().equalsIgnoreCase("german")) {
            p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lSie haben nicht die ben\u00f6tigte Berechtigung f\u00fcr diesen Befehl!");
        } else if (fm.getLang().equalsIgnoreCase("russian")) {
            p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lУ вас нет разрешения на выполнение этой команды!");
        } else if (fm.getLang().equalsIgnoreCase("english")) {
            p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lYou haven't got the permission to execute this command!");
        } else if (fm.getLang().equalsIgnoreCase("kazakh")) {
            p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lСізге осы команданы орындауға рұқсат жоқ!");
        } else {
            p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lYou haven't got the permission to execute this command!");
        }
        return true;
    }
}

