package mcplugins.io.github.GamingCuber.PingDisplayer.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import mcplugins.io.github.GamingCuber.PingDisplayer.Main;
import net.md_5.bungee.api.ChatColor;

public class PingCommand implements CommandExecutor {

	private Main plugin;
	
		public PingCommand(Main plugin) {
		
			this.plugin = plugin;
			plugin.getCommand("ping").setExecutor(this);
			
		}
		
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			
			Player commandsender = (Player) sender;
			
			if (args.length == 0) {
				commandsender.sendMessage(ChatColor.GREEN + "Your ping is " + ChatColor.YELLOW + commandsender.getPing());
			} if (args.length == 1) {
				Player asked_player = Bukkit.getPlayer(args[0]);
				commandsender.sendMessage(ChatColor.GREEN + asked_player.getName() + "'s ping is " + ChatColor.YELLOW + asked_player.getPing());
			} else {
				commandsender.sendMessage(ChatColor.RED + "Make sure to do the command right. Either do /ping for your ping or /ping <playername> for their ping");
			} 
			try {
				Player asked_player = Bukkit.getPlayer(args[0]);
			} catch (Exception e) {
				commandsender.sendMessage(ChatColor.RED + "Make sure to do the command right. Either do /ping for your ping or /ping <playername> for their ping");
			}
			
			
			
			
			
			
			return false;
			
		}
	
}
