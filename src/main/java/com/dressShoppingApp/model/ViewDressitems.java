package com.dressShoppingApp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dressShoppingApp.dao.ConnectionUtil;

public class ViewDressitems {
	public static List<Dressitems> showAll() throws SQLException, ClassNotFoundException {
		List<Dressitems> dress = new ArrayList<Dressitems>();
		String sql = "select * from Dressitems";
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		statement = connection.prepareStatement(sql);

		// 3.execute query
		ResultSet rs = statement.executeQuery(sql);

		while (rs.next()) {
			String DressIdNo = rs.getString("DressIdNo");
			String DressName = rs.getString("DressName");
			String BrandName = rs.getString("BrandName");
			String Colour = rs.getString("Colour");
			String Price = rs.getString("Price");

			// create object s
			Dressitems d = new Dressitems();
			d.setDressIdNo(DressIdNo);
			d.setDressName(DressName);
			d.setBrandName(BrandName);
			d.setColour(Colour);
			d.setPrice(Price);

			dress.add(d);
		}
		return dress;
	}

	public static List<Dressitems> DressName(String dressname) throws SQLException, ClassNotFoundException {
		List<Dressitems> DressName = new ArrayList<Dressitems>();
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String sql = "SELECT DressIdNo,DressName,BrandName,Colour,Price FROM Dressitems WHERE DressName=?";
		statement = connection.prepareStatement(sql);
		statement.setString(1, dressname);
		// 3.execute query
		ResultSet rs1 = statement.executeQuery();
		// iterate rows
		while (rs1.next()) {
			String DressIdNo = rs1.getString("DressIdNo");
			String DressName1 = rs1.getString("DressName");
			String BrandName = rs1.getString("BrandName");
			String Colour = rs1.getString("Colour");
			String Price = rs1.getString("Price");

			Dressitems d1 = new Dressitems();

			d1.setDressIdNo(DressIdNo);
			d1.setDressName(DressName1);
			d1.setBrandName(BrandName);
			d1.setColour(Colour);
			d1.setPrice(Price);

			DressName.add(d1);
		}
		return DressName;
	}

	public static List<Dressitems> BrandName(String brandname) throws SQLException, ClassNotFoundException {
		List<Dressitems> BrandName = new ArrayList<Dressitems>();
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String sql = "SELECT DressIdNo,DressName,BrandName,Colour,Price FROM Dressitems WHERE BrandName=?";
		statement = connection.prepareStatement(sql);
		statement.setString(1, brandname);
		// 3.execute query
		ResultSet rs2 = statement.executeQuery();
		// iterate rows
		while (rs2.next()) {
			String DressIdNo = rs2.getString("DressIdNo");
			String DressName = rs2.getString("DressName");
			String BrandName1 = rs2.getString("BrandName");
			String Colour = rs2.getString("Colour");
			String Price = rs2.getString("Price");

			Dressitems d2 = new Dressitems();

			d2.setDressIdNo(DressIdNo);
			d2.setDressName(DressName);
			d2.setBrandName(BrandName1);
			d2.setColour(Colour);
			d2.setPrice(Price);

			BrandName.add(d2);
		}
		return BrandName;
	}

}
