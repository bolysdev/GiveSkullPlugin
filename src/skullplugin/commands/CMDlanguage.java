package skullplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import skullplugin.API.Language;
import skullplugin.util.FileManager;

public class CMDlanguage
implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player)sender;
        FileManager fm = new FileManager();
        if (p.hasPermission("skull.language")) {
            if (args.length == 0) {
                if (fm.getLang().equalsIgnoreCase("german")) {
                    p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7r\u00a7lMomentane Sprache: German");
                } else if (fm.getLang().equalsIgnoreCase("russian")) {
                    p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7r\u00a7lТекущий язык: Русский");
                } else if (fm.getLang().equalsIgnoreCase("english")) {
                    p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7r\u00a7lLanguage in usage: English");
                } else if (fm.getLang().equalsIgnoreCase("kazakh")) {
                    p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7r\u00a7lҚолданыстағы тіл: Қазақша");
                }
            }
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("german") || args[0].equalsIgnoreCase("deutsch")) {
                    p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7r\u00a7lSprache Erfolgreich auf Deutsch gesetzt!");
                    fm.setLang(Language.German);
                } else if (args[0].equalsIgnoreCase("russian") || args[0].equalsIgnoreCase("russkiy") || args[0].equalsIgnoreCase("русский")) {
                    p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7r\u00a7lЯзык успешно изменён на Русский!");
                    fm.setLang(Language.Russian);
                } else if (args[0].equalsIgnoreCase("english") || args[0].equalsIgnoreCase("englisch")) {
                    p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7r\u00a7lLanguage successfully changed to English!");
                    fm.setLang(Language.English);
                } else if (args[0].equalsIgnoreCase("kazakh") || args[0].equalsIgnoreCase("kazakhstan") || args[0].equalsIgnoreCase("қазақша") || args[0].equalsIgnoreCase("казахский")) {
                    p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7r\u00a7lТіл қазақшаға сәтті өзгертілді!");
                    fm.setLang(Language.Kazakh);
                } else if (fm.getLang().equalsIgnoreCase("german")) {
                    p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lBitte entscheide zwischen: deutsch und englisch!");
                } else if (fm.getLang().equalsIgnoreCase("russian")) {
                    p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lПожалуйста, выберите между: русским, немецким и английским!");
                } else if (fm.getLang().equalsIgnoreCase("english")) {
                    p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lPlease choose between: german and english!");
                } else if (fm.getLang().equalsIgnoreCase("kazakh")) {
                    p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lнеміс, ағылшын жане қазақ тілдерінің аралығында тілді таңдауыңызды сұраймыз!");
                } else if (fm.getLang().equalsIgnoreCase("german")) {
                    p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lBitte entscheide zwischen: deutsch und englisch!");
                } else if (fm.getLang().equalsIgnoreCase("russian")) {
                    p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lПожалуйста, выберите между: русским, немецким и английским!");
                } else if (fm.getLang().equalsIgnoreCase("english")) {
                    p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lPlease choose between: german and english!");
                } else if (fm.getLang().equalsIgnoreCase("kazakh")) {
                    p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lнеміс, ағылшын жане қазақ тілдерінің аралығында тілді таңдауыңызды сұраймыз!");
                } else {
                    p.sendMessage("\u00a77[\u00a7aSkullPlugin\u00a77] \u00a7c\u00a7lPlease choose between: german and english!");
                }
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
        return false;
    }
}

