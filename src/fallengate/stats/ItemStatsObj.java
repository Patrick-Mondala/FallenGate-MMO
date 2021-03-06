package fallengate.stats;

import java.util.HashMap;

public class ItemStatsObj {
	
	//Used @item creation and holds item stats info - gentle
		
	private HashMap<String, StatObj> stats = new HashMap<String, StatObj>();
	private String name;
		
	public ItemStatsObj(String name) {
		this.name = name;
	}
		
	public void addStat(String stat, int modifier) {
		stats.put(stat, new StatObj(stat, modifier));
	}
	
	public void modifyVisibleStat(String stat, int modifier) {
		stats.get(stat).modifyVisibleStat(modifier);
	}
	
	public String getName() {
		return name;
	}
		
	public int getVisibleStat(String stat) {
		return stats.get(stat).getVisibleModifier();
	}
		
	public HashMap<String, StatObj> getStats() {
		return stats;
	}
		
}

