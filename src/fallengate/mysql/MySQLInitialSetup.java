	package fallengate.mysql;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import fallengate.main.Main;

public class MySQLInitialSetup {
	
	/*
	 * dont touch unless you're adding more parameters to the mysql config yml file
	 * if that's what you want to do, find comment on line 71 -gentle
	 */
	
	
	static File cfile;
    static FileConfiguration config;
    static File datafolder = Main.plugin.getDataFolder();
    static File folder = new File(datafolder, "MySQL Info" + File.separator);
  
    public static void save() {
    	if(cfile.exists()) {
	        try {
	            config.save(cfile);
	        } catch(Exception e) {
	        }
    	}
    }
    
    //makes directories and files if they don't exist -gentle
    public static void setup() {
        cfile = new File(datafolder, "MySQL Info" + File.separator + "MySQL Login.yml");
        if (!datafolder.exists()) {
        	datafolder.mkdir();
        }
        if (!folder.exists()) {
        	folder.mkdir();
        }
        if (!cfile.exists()) {
            try {
                cfile.createNewFile();
            } catch(Exception e) {
            }
        }
        
        config = YamlConfiguration.loadConfiguration(cfile);
        
        if(!config.isSet("mysql.host")) {
        	config.set("mysql.host", "insert-database-host");
        	save();
        }
        if(!config.isSet("mysql.port")) {
        	config.set("mysql.port", 3306);
        	save();
        }
        if(!config.isSet("mysql.database")) {
        	config.set("mysql.database", "insert-database-name");
        	save();
        }
        if(!config.isSet("mysql.username")) {
        	config.set("mysql.username", "insert-username");
        	save();
        }
        if(!config.isSet("mysql.password")) {
        	config.set("mysql.password", "insert-password");
        	save();
        }
        
      //to add new tables, copy and paste as follows to add to the mysql config yml file ex: "mysql.tables.{your-new-table}" -gentle
        if(!config.isSet("mysql.tables.player-data-by-toon")) {
        	config.set("mysql.tables.player-data-by-toon", "insert-player-data-by-toon-table");
        	save();
        }
    }
    
    //EVERYTHING ELSE DON'T TOUCH!! -gentle
  
    public static File getfolder() {
        return folder;
    }
  
    public static File getfile() {
        return cfile;
    }
  
    public static void load() {
    	if(cfile.exists()) {
	        cfile = new File(datafolder, "MySQL Info" + File.separator + "MySQL Login.yml");
	        config = YamlConfiguration.loadConfiguration(cfile);
    	}
    }
  
    public static FileConfiguration getConfig() {
        return config;
    }
}
