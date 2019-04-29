package fallengate.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.bukkit.scheduler.BukkitRunnable;

import fallengate.main.Main;

public class FallenGateMySQLConnection {
	
	/*
	 * make a new instance of this class in the class you need to connect to a MySQL table
	 * FallenGateMySQLConnection.updateStatement("sql update statement code as string")
	 * or use
	 * FallenGateMySQLConnection.queryStatement("sql query statement code as string")
	 * followed by FallenGateMySQLConnection.getResults() to see results
	 * everything else: DO NOT TOUCH!! -gentle :)                                           
	 */
	
	Main main = Main.plugin;
	private Connection connection;
	
    private void openConnection() throws SQLException, ClassNotFoundException {
    if (connection != null && !connection.isClosed()) {
        return;
    }
 
    synchronized (this) {
        if (connection != null && !connection.isClosed()) {
            return;
        }
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(MySQLInfoGetter.getUrl(), MySQLInfoGetter.getUsername(), MySQLInfoGetter.getPassword());
        }
    }
    
	public void updateStatement(String update) {
		BukkitRunnable r = new BukkitRunnable() {
			   @Override
			   public void run() {
			      try {
			         openConnection();
			         Statement statement = connection.createStatement();
			         statement.executeUpdate(update);
			      } catch(ClassNotFoundException e) {
			         e.printStackTrace();
			      } catch(SQLException e) {
			         e.printStackTrace();
			      }
			   }
			};
			r.runTaskAsynchronously(main);
	}
    
    private ResultSet results = null;
    
    private void queryFinish(ResultSet result) {
    	this.results = result;
    }
    
    public ResultSet getResults() {
    	return results;
    }
	
	public ResultSet queryStatement(String query) {
		BukkitRunnable r = new BukkitRunnable() {
			   @Override
			   public void run() {
			      try {
			         openConnection();
			         Statement statement = connection.createStatement();
			         ResultSet result = statement.executeQuery(query);
			         queryFinish(result);
			      } catch(ClassNotFoundException e) {
			         e.printStackTrace();
			      } catch(SQLException e) {
			         e.printStackTrace();
			      }
			   }
			};
			r.runTaskAsynchronously(main);
		return this.results;
	}

}
