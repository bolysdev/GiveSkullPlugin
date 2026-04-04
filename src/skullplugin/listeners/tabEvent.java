package skullplugin.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatTabCompleteEvent;

/**
 * Внимание: PlayerChatTabCompleteEvent был удален в Minecraft 1.21+
 * Эта функция автодополнения больше не работает на новых версиях
 */
public class tabEvent implements Listener {
    @EventHandler
    public void onTabEvent(PlayerChatTabCompleteEvent e) {
        // Этот код больше не работает в 1.21+
        // Оставляем для совместимости со старыми версиями
        if (e.getPlayer().hasPermission("skull.language") && e.getChatMessage().equalsIgnoreCase("/language")) {
            e.getTabCompletions().add("German");
            e.getTabCompletions().add("English");
            e.getTabCompletions().add("Russian");
        }
    }
}
