package fallengate.stats;

public class StatsCalculator {
	
	//calculates stats hurdur 
	//converts visible stats to proper in-game modifiers -gentle
	
	public static int calculateArmor(int modifier) {
		int true_modifier = modifier / 8;
		return true_modifier;
	}
	
	public static int calculateHealth(int modifier) {
		int true_modifier = modifier;
		return true_modifier;
	}
	
	public static int calculateHealthRegenerationPerSecond(int modifier) {
		int true_modifier = modifier;
		return true_modifier;
	}
	
	//remember that some stats have more than one true modifier - gentle
	
	public static float calculateStrengthMelee(int modifier) {
		float true_modifier = (float) modifier / 4;
		return true_modifier;
	}
	
	public static float calculateStrengthArmor(int modifier) {
		float true_modifier = (float) modifier / 10;
		return true_modifier;
	}
	
	public static float calculateAgilityAttackSpeed(int modifier) {
		float true_modifier = (float) modifier / 10;
		return true_modifier;
	}
	
	public static float calculateAgilityMovementSpeed(int modifier) {
		float true_modifier = (float) modifier / ((float) 1 / 3);
		return true_modifier;
	}
	
	public static float calculateAgilityEvasion(int modifier) {
		float true_modifier = (float) modifier / ((float) 1 / (float) 0.15);
		return true_modifier;
	}
	
	public static float calculateIntelligenceSpellDamage(int modifier) {
		float true_modifier = (float) modifier / 4;
		return true_modifier;
	}
	
	public static float calculateIntelligenceCastSpeed(int modifier) {
		float true_modifier = (float) modifier / (float) 0.025;
		return true_modifier;
	}
	
	public static float calculateIntelligenceResists(int modifier) {
		float true_modifier = (float) modifier / 10;
		return true_modifier;
	}
	
	public static float calculateDexterityCriticalChance(int modifier) {
		float true_modifier = (float) modifier / ((float) 1 / (float) 0.15);
		return true_modifier;
	}
	
	public static float calculateDexterityProcChance(int modifier) {
		float true_modifier = (float) modifier / 10;
		return true_modifier;
	}
	
	public static float calculateSpiritManaRegenerationPerSecond(int modifier) {
		float true_modifier = (float) modifier / 4;
		return true_modifier;
	}
	
	public static float calculateSpiritHealthRegenerationPerSecond(int modifier) {
		float true_modifier = (float) modifier / 10;
		return true_modifier;
	}
	
	public static int calculateWisdomManaBoost(int modifier) {
		int true_modifier = modifier * 2;
		return true_modifier;
	}
	
	public static int calculateWisdomManaCostReduction(int modifier) {
		int true_modifier = modifier / 8;
		return true_modifier;
	}
	
	public static float calculateWisdomSpellAccuracy(int modifier) {
		float true_modifier = modifier / 10;
		return true_modifier;
	}
	
}
