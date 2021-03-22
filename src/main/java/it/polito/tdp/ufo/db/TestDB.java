package it.polito.tdp.ufo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestDB {
	
	public static void main(String[] args) {
		SightingDAO dao= new SightingDAO();
		List<String> formuleUFO= dao.readShapes();
		
		for(String forma: formuleUFO) {
			int count = dao.countByShape(forma);
			System.out.println("UFO di forma "+forma+" sono: "+ count);
		}
		
			
 }

}
