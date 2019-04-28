package fallengate.mysql.playerinfo;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fallengate.mysql.FallenGateMySQLConnection;
import fallengate.mysql.MySQLInfoGetter;

public class PlayerOnJoinSetup implements Listener {
	
	String playerDataByToonTable = MySQLInfoGetter.getPlayerDataByToonTable();
	FallenGateMySQLConnection connection = new FallenGateMySQLConnection();
	
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		UUID uuid = player.getUniqueId();
		String playerName = player.getName();
		
		/*
		 * add to player data table with uuid, name, race, class, economy(copper, silver, gold), all stats listed below
		 * health, strength, agility, dexterity, wisdom, intelligence, and spirit -gentle
		 */
		
	}

}