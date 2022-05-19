package com.dressshoppingapp.model;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dressshoppingapp.dao.ConnectionUtil;

public class ViewDressitems {
	public static List<Dressitems> showAll() throws SQLException, ClassNotFoundException {
		List<Dressitems> dress = new ArrayList<Dressitems>();
		String sql = "select * from dressitems";
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		statement = connection.prepareStatement(sql);

		// 3.execute query
		ResultSet rs = statement.executeQuery(sql);

		while (rs.next()) {
			String DressIdNo = rs.getString("id");
			String DressName = rs.getString("name");
			String BrandName = rs.getString("brand");
			String Colour = rs.getString("colour");
			String Price = rs.getString("price");

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
		String sql = "SELECT id,name,brand,colour,price FROM dressitems WHERE name=?";
		statement = connection.prepareStatement(sql);
		statement.setString(1, dressname);
		// 3.execute query
		ResultSet rs1 = statement.executeQuery();
		// iterate rows
		while (rs1.next()) {
			String DressIdNo = rs1.getString("id");
			String DressName1 = rs1.getString("name");
			String BrandName = rs1.getString("brand");
			String Colour = rs1.getString("colour");
			String Price = rs1.getString("price");

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
		String sql = "SELECT id,name,brand,colour,price FROM dressitems WHERE brand=?";
		statement = connection.prepareStatement(sql);
		statement.setString(1, brandname);
		// 3.execute query
		ResultSet rs2 = statement.executeQuery();
		// iterate rows
		while (rs2.next()) {
			String DressIdNo = rs2.getString("id");
			String DressName = rs2.getString("name");
			String BrandName1 = rs2.getString("brand");
			String Colour = rs2.getString("colour");
			String Price = rs2.getString("price");

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
