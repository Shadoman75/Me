package io.github.shadoman75.MePlugin;

import java.nio.Buffer;

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
		
		// if someone just happened to type /me and wanted to have a message after it...
		if(cmd.getName().equalsIgnoreCase("me")){
			
			if(args.length > 0){
			
				StringBuilder buffer = new StringBuilder();

				// change the starting i value to pick what argument to start from
				// 1 is the 2nd argument.
				for(int i = 1; i < args.length; i++)
				{
				    buffer.append(' ').append(args[i]);
				}

				// now buffer.toString() has your arguments separated by spaces.

				for(Player p:((Player)sender).getworld().getplayers());{
					p.sendMessage(ChatColor.AQUA + "~" + sender.getName() + " " + buffer.toString());
				
				}
				return true;
			} else {
				
			}
			return false;
		}
	}

}
// for(String msg: args) we will be setting this somewhere else in a bit... when i figure out where...