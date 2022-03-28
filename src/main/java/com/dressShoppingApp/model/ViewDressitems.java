package com.dressShoppingApp.model;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;
	public class ViewDressitems {
		public static List<Dressitems> showAll() throws SQLException, ClassNotFoundException {
			List<Dressitems> dress=new ArrayList<Dressitems>();
			String sql = "select * from Dressitems";
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection connection= DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db", "rev_user",
						"rev_user");
							Statement statement = connection.prepareStatement(sql);
							
								//3.execute query
							ResultSet rs = statement.executeQuery(sql);
							
							//iterate rows
							while(rs.next()) {
								String DressIdNo = rs.getString("DressIdNo");
								String DressName = rs.getString("DressName");
								String BrandName = rs.getString("BrandName");
								String Colour = rs.getString("Colour");
								String Price = rs.getString("Price");
								//create object for entire items
								Dressitems d = new Dressitems();
								d.setDressIdNo(DressIdNo);
								d.setDressName(DressName);
								d.setBrandName(BrandName);
								d.setColour(Colour);
								d.setPrice(Price);
							
								//store row details in list
								dress.add(d);
							}	
							return dress;
							}
}
