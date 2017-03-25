package megatgames.youtuber.com;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class Fornalha implements Listener  {
	
	@EventHandler
	public void onPlaceFurnace(BlockPlaceEvent e){
		
		Player p = e.getPlayer();
		Block b = e.getBlock();
		Material m = b.getType();
			
		if(e.getBlock().getType() == Material.FURNACE){
			p.sendMessage("Voce colocou uma fornalha no chao !!");
			String w = b.getLocation().getWorld().getName();
			double x = b.getLocation().getBlockX();
			double y = b.getLocation().getBlockY();
			double z = b.getLocation().getBlockZ();
			FileManager.FileLoad();
			FileManager.File().set("Player Fornalhas." + p.getName() + ".Fornalha.world", w);
			FileManager.File().set("Player Fornalhas." + p.getName() + ".Fornalha.x", x);
			FileManager.File().set("Player Fornalhas." + p.getName() + ".Fornalha.y", y);
			FileManager.File().set("Player Fornalhas." + p.getName() + ".Fornalha.z", z);
			FileManager.FileSave();
		}
		
	}
	
}
