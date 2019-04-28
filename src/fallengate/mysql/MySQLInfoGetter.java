package fallengate.mysql;

import org.bukkit.configuration.file.FileConfiguration;


public class MySQLInfoGetter {
	
	/*
	 * sends all table names and mysql login information
	 * if you're going to add a new table you MUST add it here as instructed in comments below -gentle
	 */
	
	//first make a static String for your new table -gentle
	static FileConfiguration config;
	static String port;
	static String database;
	static String url;
	static String username;
	static String password;
	static String playerDataByToonTable;
	
	//then assign your new table in this method as: {your-new-table} = config.getString("mysql.{your-new-table}"); -gentle
	public static void setup() {
		config = MySQLInitialSetup.getConfig();
		port = Integer.toString(config.getInt("mysql.port"));
		database = config.getString("mysql.database");
		url = "jdbc:mysql://" + config.getString("mysql.host") + port + database;
		username = config.getString("mysql.username");
		password = config.getString("mysql.password");
		playerDataByToonTable = config.getString("mysql.tables.player-data-by-toon");
	}
	
	//lastly add a public static getter for your new table, thanks! :) -gentle
	public static String getUrl() {
		return url;
	}
	
	public static String getUsername() {
		return username;
	}
	
	public static String getPassword() {
		return password;
	}
	
	public static String getPlayerDataByToonTable() {
		return playerDataByToonTable;
	}
}
