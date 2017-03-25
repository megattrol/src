package megatgames.youtuber.com;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;

public class FileManager {
	
	static ConsoleCommandSender MsgConsole = Bukkit.getConsoleSender();
		
	static File file = new File(Bukkit.getServer().getPluginManager().getPlugin("megatgames").getDataFolder().getAbsolutePath(), "fornalha.yml");
	static YamlConfiguration yml = YamlConfiguration.loadConfiguration(file);
	
	public static void FileSave(){
		try {
			yml.save(file);
		} catch (IOException e) {
			MsgConsole.sendMessage("Erro ao salvar arquivo !!");
		}
	}
	
	public static void FileLoad(){
		try {
			yml.load(file);
		} catch (IOException | InvalidConfigurationException e) {
			MsgConsole.sendMessage("Erro ao ler arquivo !!");
		}
	}	
	
	public static YamlConfiguration File(){
		File file = new File(Bukkit.getServer().getPluginManager().getPlugin("megatgames").getDataFolder().getAbsolutePath(), "fornalha.yml");
		YamlConfiguration yml = YamlConfiguration.loadConfiguration(file);
		return yml;
	}
}
