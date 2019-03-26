package tld.sima.buildersutils;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		CommandManager cm = new CommandManager();
		this.getCommand(cm.cmd1).setExecutor(cm);
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "Builders Utils enabled!");
	}
	
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Builders Utils disabled!");
	}
	
}
