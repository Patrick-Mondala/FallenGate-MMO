package fallengate.stats;

public class StatObj {
	
	//holds a single stat along with modifier value
	//instantiated and used in PlayerStatsObj and ItemStatsObj
	
	private String name;
	private int visible_modifier = 0;
	
	public StatObj(String name, int modifier) {
		this.name = name;
		this.visible_modifier = modifier;
	}
	
	public void modifyVisibleStat(int new_modifier) {
		this.visible_modifier += new_modifier;
	}
	
	public String getName() {
		return name;
	}
	
	public int getVisibleModifier() {
		return visible_modifier;
	}
}
