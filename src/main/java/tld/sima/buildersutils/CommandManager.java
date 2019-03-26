package tld.sima.buildersutils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.md_5.bungee.api.ChatColor;

public class CommandManager implements CommandExecutor {

	public String cmd1 = "nv";
	public String cmd1a1 = "nightvision";

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(command.getName().equalsIgnoreCase(cmd1) || command.getName().equalsIgnoreCase(cmd1a1)) {
				if(player.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
					player.removePotionEffect(PotionEffectType.NIGHT_VISION);
					player.sendMessage(ChatColor.AQUA + "Night vision " + ChatColor.RED + "Removed");
				}else {
					PotionEffect nightvision = new PotionEffect(PotionEffectType.NIGHT_VISION, 999999999, 1, false, false);
					player.addPotionEffect(nightvision);
					player.sendMessage(ChatColor.AQUA + "Night vision " + ChatColor.GREEN + "Enabled");
				}
				return true;
			}
		}
		return false;
	}
}
