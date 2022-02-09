package com.vechicledekho.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayData {

	public static void main(String[] args) throws SQLException {
		
		DatabaseManager manager = new DatabaseManager();
		
		String sql = "SELECT * FROM vechicle";
		
		PreparedStatement stmt=manager.connect().prepareStatement(sql);
		
		ResultSet result = stmt.executeQuery(sql);
		
		while(result.next()){
			System.out.println("=================================");
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getInt(3));
			System.out.println(result.getString(4));
			System.out.println(result.getString(4));
			System.out.println(result.getInt(5));
			System.out.println(result.getInt(6));
			System.out.println(result.getString(7));
			System.out.println(result.getInt(8));
		}

	}

}
