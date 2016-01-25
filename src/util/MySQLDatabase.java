package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySQLDatabase {

	private String dbURL = "jdbc:mysql://localhost:8889/";
	private String dbName = "asap_bmcc";
	private String dbDriver = "com.mysql.jdbc.Driver";
	private String dbUserName = "root";
	private String dbUserPassowrd = "root";
	
	//creating connection instance and return connection
	public Connection getDBConnection(){
		Connection connection = null;
		try{
			Class.forName(dbDriver).newInstance();
			connection = DriverManager
					.getConnection(dbURL+dbName, dbUserName, dbUserPassowrd);
		}catch(SQLException e){
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	//creating Statement instance
	public Statement getStatement(){
		Statement statement = null;
		try{
			statement = getDBConnection().createStatement();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return statement;
	}
	
	//executing query and return result set
	public ResultSet getQueryResultSet(String query){
		ResultSet resultSet = null;
		try{
			resultSet = getStatement().executeQuery(query);
			getDBConnection().close();
		} catch(SQLException e){
			e.printStackTrace();
		}
		return resultSet;
	}
	
	//
	public Map<Integer, List> getQueryResultInMap(String query, String... columName){
		List<String> list = new ArrayList<>();
		Map<Integer, List> map = new HashMap<>();
		ResultSet resultSet = getQueryResultSet(query);
		int rowCount = 1;
		try {
			while(resultSet.next()){
				List<String> list2 = new ArrayList<>();
				for(int i = 0; i < columName.length; i++){
				list.add(resultSet.getString(columName[i]));
				}
				list2.addAll(list);
				map.put(rowCount, list2);
				list.clear();
				rowCount++;
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}
		System.out.println(map);
		return map;	
	}

}
