package fallengate.stats;

import java.util.HashMap;

import org.bukkit.entity.Player;

public class OnlinePlayersStats {
	
	//Use this class to hold online player stats and add/modify player stats, & don't forget to remove players @disconnect - gentle
	
	public static HashMap<Player, PlayerStatsObj> online_players_stats = new HashMap<Player, PlayerStatsObj>();
	
	public static void addPlayer(Player player, PlayerStatsObj player_stats) {
		online_players_stats.put(player, player_stats);
	}
	
	public void removePlayer(Player player) {
		online_players_stats.remove(player);
	}
	
	public static void addStat(Player player, String stat, int modifier) {
		online_players_stats.get(player).addStat(stat, modifier);
	}
	
	public static void modifyExistingStat(Player player, String stat, int modifier) {
		online_players_stats.get(player).modifyVisibleStat(stat, modifier);
	}
	
	public static int getExistingStat(Player player, String stat) {
		return online_players_stats.get(player).getVisibleStat(stat);
	}
	
	public static PlayerStatsObj getStats(Player player) {
		return online_players_stats.get(player);
	}

}
