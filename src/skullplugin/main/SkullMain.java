package skullplugin.main;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import skullplugin.commands.CMDlanguage;
import skullplugin.commands.CMDskull;
import skullplugin.listeners.tabEvent;
import skullplugin.util.FileManager;

public final class SkullMain
extends JavaPlugin {
    public void onEnable() {
        getLogger().info("GiveSkullPlugin (SkullPlugin) загружен! cursorkz");
        this.getCommand("skull").setExecutor((CommandExecutor)new CMDskull());
        this.getCommand("language").setExecutor((CommandExecutor)new CMDlanguage());
        Bukkit.getPluginManager().registerEvents((Listener)new tabEvent(), (Plugin)this);
        FileManager fm = new FileManager();
    }

    public void onDisable() {
    }
}

