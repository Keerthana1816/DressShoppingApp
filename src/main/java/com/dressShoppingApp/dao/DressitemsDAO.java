package com.dressShoppingApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

     public class DressitemsDAO{
	//1st method:addDressitems
		public List<DressitemsDAO>addDressitems1(DressitemsDAO dressitems) throws Exception {
		
					List<DressitemsDAO>addDressitems1 = new ArrayList<DressitemsDAO>();
		     Connection connection = null;
			PreparedStatement statement = null;
			ResultSet rs = null;

			// 1.Get connection
			connection = ConnectionUtil.getConnection();
			// 2. Prepare the query
					String sql = "insert into Dressitems(Dress_Name,Brand_Name,Colour,Price) values (?,?,?,?,?)";
					statement = connection.prepareStatement(sql);
					statement.setString(1,"Dress_Name");
					statement.setString(2, "Brand_Name");
					statement.setString(3,"Colour");
					statement.setInt(4,0);
					//3.execute query
					rs = statement.executeQuery();

					//iterate rows
					while(rs.next()) {
						Integer id =rs.getInt("id");
						String Dress_Name = rs.getString("Name");
						String Brand_Name = rs.getString("Brand");
						String Colour = rs.getString("Colour");
						Integer Price = rs.getInt("Price");
						//create object for entire items
					    DressitemsDAO d = new DressitemsDAO();
					     d.setid("1");
					     d.setDress_Name("Dress_Name");
					    d.setBrand_Name(Brand_Name);
					    d.setColour(Colour);
					    d.setPrice(0);

						//store row details in list
						DressitemsList1.add(d);
					}	
					return DressitemsList1;
		}



		//2-method  update items
		public void updateDressitems(DressitemsDAO dressitems) throws Exception {
			Connection connection = null;
			PreparedStatement statement = null;
			ResultSet rs = null;

			// 1.Get connection
			connection = ConnectionUtil.getConnection();

			// 2. Prepare the query
			String sql = "update Dressitems set Dressname =? where id = ?";
			statement = connection.prepareStatement(sql);
	       statement.setString(1,"Kurta");
	       statement.setInt(2, 3);
			// 3.execute query
			int rows = statement.executeUpdate();
		System.out.println("No of rows updated:" + rows);

			}

			//3rd method-delete items	
	public void deleteDressitems(int id) throws Exception {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		// 1.Get connection
		connection = ConnectionUtil.getConnection();

		// 2. Prepare the query
		String sql = "delete from Dressitems where id = ?" ;
		statement = connection.prepareStatement(sql);
		statement.setInt(1,id);

		// 3.execute query
		int rows = statement.executeUpdate();
		System.out.println("No of rows deleted :" + rows);
	}

	  //4th method=findall
	 List<DressitemsDAO> findAll1() throws Exception {
		List<DressitemsDAO> DressitemsList = new ArrayList<DressitemsDAO>();
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		//get connection
		connection = ConnectionUtil.getConnection();
		//prepare query
		String sql = "Select id,Dress_Name,Brand_Name,Colour,Price from Dressitems";
		statement = connection.prepareStatement(sql);
		statement.setString(1,"Tops");
		//execute the query
		rs = statement.executeQuery();
		//iterate rows
		while(rs.next()) {
			Integer id =rs.getInt("id");
			String Dress_Name = rs.getString("Name");
			String Brand_Name = rs.getString("Brand");
			String Colour = rs.getString("Colour");
			Integer Price = rs.getInt("Price");
			//create object for entire items
		    DressitemsDAO d = new DressitemsDAO();
		    d.setDress_Name("kurta");
		    d.setBrand_Name("avasa");
		    d.setColour("pink");
		    d.setPrice(0);
			//store row details in list
			DressitemsList.add(dressitemsobj);
		}
		return DressitemsList;
	}

		//5th method-  find by id	
	public DressitemsDAO findBy(int id) throws Exception {
		DressitemsDAO d = null;
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		// 1.Get connection
		connection = ConnectionUtil.getConnection();

		// 2. Prepare the query
		String sql = "select id,Dress_Name,Brand_Name from Bookitems where id = ?";
		statement = connection.prepareStatement(sql);
		statement.setString(1, "jeans");

		// 3.execute query
		rs = statement.executeQuery();

		// 4. Iterate rows
		if (rs.next()) {
			Integer id1 = rs.getInt("id");
			String Dress_Name= rs.getString("name");
			String Brand_Name = rs.getString("brand");

			// 1 row details => stored in 1 model object
	    	DressitemsDAO d1 = new DressitemsDAO();
	    	d1.findByDress_Name(Dress_Name);
	    	d1.findByDress_Name(Brand_Name);
		}
	return d;
	}
	  //6th method- find by Dress_Name
	public List<DressitemsDAO> findByDress_Name(String dressname) throws Exception {
		List<DressitemsDAO> DressitemsList = new ArrayList<DressitemsDAO>();
	Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
	// 1.Get connection
		connection = ConnectionUtil.getConnection();
	// 2. Prepare the query
		String sql = "select id,Dress_Name,Brand_Name  where Dress_Name = ?";
		statement = connection.prepareStatement(sql);
		statement.setString(1, Dress_Name);		

		// 3.execute query
		rs = statement.executeQuery();

		// 4. Iterate rows
		while (rs.next()) {
			Integer id = rs.getInt("id");
			String Dress_Name1 = rs.getString("name");
			String Brand_Name = rs.getString("brand");

			// 1 row details => stored in 1 model object
			DressitemsDAO d2 = new Bookitems();
			d2.setBrand_Name("brand");
			d2.setDress_Name("name");

			// store the row details in a list
			dressitemsList.add(d2);

		}
		return dressitemsList;
	}
		
	  //7th method-search by Brandname

	public DressitemsDAO findByBrand_Name(int Brand-Name) throws Exception {
		DressitemsDAO d3  = null;
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		// 1.Get connection
			connection = ConnectionUtil.getConnection();

			// 2. Prepare the query
			String sql = "select id,Dress_Name ,Brand_Name from Dressitems where Dress_Name = ?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, "kurta");

			// 3.execute query
			rs = statement.executeQuery();

			// 4. Iterate rows
			if (rs.next()) {
				Integer id1 = rs.getInt("id");
				String Dress_Name1= rs.getString("name");
				String Brand_Name = rs.getString("brand");

				// 1 row details => stored in 1 model object
				DressitemsDAO d3 = new DressitemsDAO();
		    	d3.setDress_Name(Dress_Name1);
		    	d3.setBrand_Name(Dress_Name);
			}
		return d3;
		}




	public void addBookitems(DressitemsDAO dressitems) throws Exception {
	

	}




	public List<DressitemsDAO> findAll() throws Exception {
		
		return null;
	}

		}
