package fallengate.mysql.playerinfo;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fallengate.mysql.FallenGateMySQLConnection;
import fallengate.mysql.MySQLInfoGetter;
import fallengate.stats.OnlinePlayersStats;
import fallengate.stats.PlayerStatsObj;

public class PlayerOnJoinSetup implements Listener {
	
	String playerDataByToonTable = MySQLInfoGetter.getPlayerDataByToonTable();
	FallenGateMySQLConnection connection = new FallenGateMySQLConnection();
	
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		UUID uuid = player.getUniqueId();
		String playerName = player.getName();
		PlayerStatsObj player_stats = new PlayerStatsObj(player);
		OnlinePlayersStats.addPlayer(player, player_stats);
		
		 /*
		  * if new player add to player data table with uuid, name, and rank
		  * prompt them with character selection then add all their stats INCLUDING currency to PlayerStatsObj in OnlinePlayersStats class
		  * if existing toon use FallenGateMySQLConnection class to set PlayerStatsObj info in OnlinePlayersStats class to match player's 
		  * MySQL toon data table
		  * if new toon use FallenGateMySQLConnection class to add the toon to table and set PlayerStatsObj info to desired - gentle
		 */
		
	}

}