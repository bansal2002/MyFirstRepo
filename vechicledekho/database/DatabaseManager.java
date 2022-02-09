package com.vechicledekho.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DatabaseManager {
	
	public Connection connect() {
		
		Connection connection = null;
		
        try{  
			
			Class.forName("com.mysql.cj.jdbc.Driver");  
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/vechicledekho","root","root"); 
			
			}catch(Exception e){
				System.out.println(e);
			}  
        
        return connection;
	}		

}
