package fallengate.stats;

public class StatObj {
	
	private String name;
	private int modifier = 0;
	
	public StatObj(String name, int modifier) {
		this.name = name;
		this.modifier = modifier;
	}
	
	public void modify(int new_modifier) {
		this.modifier += new_modifier;
	}
	
	public String getName() {
		return name;
	}
	
	public int getModifier() {
		return modifier;
	}
}
