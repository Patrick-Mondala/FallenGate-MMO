package fallengate.stats;

public class StatObj {
	
	private String name;
	private int modifier = 0;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setModifier(int modifier) {
		this.modifier = modifier;
	}
	
	public String getName() {
		return name;
	}
	
	public int getModifier() {
		return modifier;
	}
}
