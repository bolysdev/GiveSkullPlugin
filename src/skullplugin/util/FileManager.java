package skullplugin.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import skullplugin.API.Language;

public class FileManager {
    File file = new File("plugins/SkullPlugin", "config.yml");
    FileConfiguration cfg = YamlConfiguration.loadConfiguration((File)this.file);

    public FileManager() {
        if (!this.file.exists()) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(this.file));
                writer.write("Languages available: German, English, Russian, Kazakh");
                this.saveCfg();
                writer.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            this.cfg.set("Language", (Object)"Russian");
            this.saveCfg();
        }
    }

    public String getLang() {
        String lang = (String)this.cfg.get("Language");
        return lang;
    }

    public void setLang(Language Language2) {
        this.cfg.set("Language", (Object)Language2.toString());
        this.saveCfg();
    }

    public void saveCfg() {
        try {
            this.cfg.save(this.file);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

