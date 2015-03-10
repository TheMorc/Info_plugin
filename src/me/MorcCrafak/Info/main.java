package me.MorcCrafak.Info;

//import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{

	public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args){
		
		Player player = (Player) sender; // nastaví player instanciu na kick atd...
//		
//		if(commandlabel.equalsIgnoreCase("hack")){
//			if(args.length == 0) {
//				player.kickPlayer("Odstraòte hacky nebo dostaneš Ban!");
//			}else if(args.length == 1) {
//				Player victim = player.getServer().getPlayer(args[0]);
//				victim.kickPlayer("Odstraòte hacky nebo dostaneš Ban!");
//				player.sendMessage(ChatColor.GREEN + victim.getName() + " has been successfully kicked!");
//				
//   		}
//		}
//		return false;
//		}
				
	
		if(commandlabel.equalsIgnoreCase("info")){
        player.sendMessage("IM GOOD");
	     }	
		
	if(commandlabel.equalsIgnoreCase("wspeed")){
		if(args.length == 0) {
		try {
		//player.setWalkSpeed(args[0]);
		} catch (Exception e) {
			player.sendMessage(ChatColor.RED + "Player not online.");
		}

		}
		
	if(commandlabel.equalsIgnoreCase("fspeed")){
		if(args.length == 0) {
		//	player.setFlySpeed(args[0]);
		}
     }

	}
	
    return false;
	}	
	
}
