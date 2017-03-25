package megatgames.youtuber.com;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	static ConsoleCommandSender MsgConsole = Bukkit.getConsoleSender();
	
	public static Main instance;
	
	@Override
	public void onEnable() {
		MsgConsole.sendMessage("§aAtivado");
		Commands();
		Events();
		FileManager.FileLoad();
		FileCreate();
	}
	
	@Override
	public void onLoad() {
		FileManager.FileLoad();
		FileManager.FileSave();
	}

	@Override
	public void onDisable() {
		FileManager.FileSave();
		MsgConsole.sendMessage("§cDesativado");
	}

	public void Commands() {
//		getCommand("ItemExp").setExecutor(new Mineracao());
	}

	public void Events() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(this, this);
		pm.registerEvents(new Fornalha(), this);
	}
	
	public void FileCreate() {
		File pluginfile = new File("fornalha.yml");
        if (!pluginfile.exists()){
        	MsgConsole.sendMessage("§bArquivo criado !!");
            try {
                pluginfile.createNewFile();
            } catch (IOException e) {
            	MsgConsole.sendMessage("Este arquivo ja existe !!");
            }
        }
    }
	
}
