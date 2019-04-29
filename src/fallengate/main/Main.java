package fallengate.main;

import org.bukkit.plugin.java.JavaPlugin;

import fallengate.mysql.MySQLInfoGetter;
import fallengate.mysql.MySQLInitialSetup;
import fallengate.mysql.playerinfo.PlayerOnJoinSetup;
import fallengate.stats.ItemEquipDequipListener;

public class Main extends JavaPlugin {
	
	//yeah, probably best if you DON'T TOUCH ANYTHING!! -gentle
	
	public static Main plugin;

	public void onEnable() {
		plugin = this;
		
		MySQLInitialSetup.setup();
		MySQLInfoGetter.setup();
		getServer().getPluginManager().registerEvents(new PlayerOnJoinSetup(), this);
		getServer().getPluginManager().registerEvents(new ItemEquipDequipListener(), this);
		System.out.println("it's working! haha!");
	}
	
	public void onDisable() {
		System.out.println("shutting down :)");
		plugin = null;
	}
}
