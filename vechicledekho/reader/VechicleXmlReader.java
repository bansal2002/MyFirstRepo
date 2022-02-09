package com.vechicledekho.reader;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import com.vechicledekho.data.Vechicle;
import com.vechicledekho.data.VechicleList;
import com.vechicledekho.database.DatabaseManager;

public class VechicleXmlReader {
	
	private static final int NULL = 0;

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		DatabaseManager manager = new DatabaseManager();
		
		try {
			
			//Class.forName("com.mysql.cj.jdbc.Driver");  
			//Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/vechicledekho","root","root"); 
			
			PreparedStatement stmt=manager.connect().prepareStatement("insert into vechicle values(?,?,?,?,?,?,?,?,?)");
			
			JAXBContext jaxbContext = JAXBContext.newInstance(VechicleList.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			VechicleList vechicleList = (VechicleList) jaxbUnmarshaller.unmarshal(new File("C://Users//DELL//OneDrive//Documents/vechicleList.xml"));
		    
		    int count = 1;
			for(Vechicle vechicle : vechicleList.getVechicles()) {
	            
				stmt.setInt(1, NULL);
				stmt.setString(2, vechicle.getModalName());
				stmt.setLong(3, vechicle.getPrice());
				stmt.setString(4,vechicle.getCompanyName());
			    stmt.setString(5,vechicle.getColor());
				stmt.setInt(6,vechicle.getMileage());
				stmt.setString(7,vechicle.getFuelType());
				stmt.setInt(8,vechicle.getMaximumSpeed());
				stmt.setString(9, vechicle.getVechicleType());
				
				int i = stmt.executeUpdate();
				System.out.println("Record submit");
			}
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
