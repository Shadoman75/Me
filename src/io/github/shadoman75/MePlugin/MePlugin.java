package io.github.shadoman75.MePlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

public final class MePlugin extends JavaPlugin {
	
	public void onDisable(){
		getLogger().info("Disabled... for now");
	}
	public void onEnable(){
		getLogger().info("Enabled hopefully");
	}
	public boolean onCommand(CommandSender sender, Command cmd,
		String commandLabel, String[] args) {
		
		Player player = (Player) sender;
		// if someone just happened to type /me and wanted to have a message after it...
		if(cmd.getName().equalsIgnoreCase("me")){
			
			(Player p:(Player)sender).getworld().getplayers().sendMessage(ChatColor.AQUA + "~" + player + );
		}
	}

}
