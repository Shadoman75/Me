package io.github.shadoman75.MePlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

public final class MePlugin extends JavaPlugin {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		// if someone just happened to type /me and have a message after it...
		if(cmd.getName().equalsIgnoreCase("me")){
			
			
		}
	}

}
