package com.minimonke.HelpCommand;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class HelpCommand extends JavaPlugin{
	public void onEnable(){
		getLogger().info("HelpCommand Enabled");
		Bukkit.broadcastMessage(ChatColor.BLUE + "Help Command is now running.");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("help")){
			if(sender instanceof Player){
				sender.sendMessage(ChatColor.GOLD + "-------Help Menu-----");
				sender.sendMessage(ChatColor.GOLD + "/tpa " + ChatColor.BLUE + ": Request to teleport to a player.");
				sender.sendMessage(ChatColor.GOLD + "/spawn " + ChatColor.BLUE + ": Teleport back to spawn.");
				sender.sendMessage(ChatColor.GOLD + "/sw " + ChatColor.BLUE + ": Switch Teams.");
				sender.sendMessage(ChatColor.GOLD + "Help Menu Developed by minimonke");
				
			}
		}
		return false;
	}

}
