package fallengate.stats;

import java.util.HashMap;

import org.bukkit.entity.Player;

public class PlayerStatsObj {
	
	//holds stats in stats hashmap
	//to get stat modifier value use getExistingStat("stat name")
	//Must be instantiated @class selected - gentle
	
	private Player player;
	private String player_class;
	private HashMap<String, StatObj> stats = new HashMap<String, StatObj>();
	
	public PlayerStatsObj(Player player) {
		this.player = player;
	}
	
	public void setPlayerClass(String player_class) {
		this.player_class = player_class;
	}
	
	public void addStat(String stat, int modifier) {
		stats.put(stat, new StatObj(stat, modifier));
	}
	
	public void modifyExistingStat(String stat, int modifier) {
		stats.get(stat).modify(modifier);
	}
	
	public int getExistingStat(String stat) {
		return stats.get(stat).getModifier();
	}
	
	public Player getPlayer() {
		return player;
	}

	public String getPlayerClass() {
		return player_class;
	}

	public HashMap<String, StatObj> getStats() {
		return stats;
	}
	
}
