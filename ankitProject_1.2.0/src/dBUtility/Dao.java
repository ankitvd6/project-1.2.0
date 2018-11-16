package dBUtility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dBUtility.InventoryBean;
import dBUtility.MySqlConnUtil;

public class Dao {

/*	public  static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/ankit";
		String user="root";
		String password="root";
		Connection conn=DriverManager.getConnection(url, user, password);
		return conn;
	}*/
	
	//save method;
	public static int save(InventoryBean b) throws ClassNotFoundException, SQLException {
		MySqlConnUtil msc=new MySqlConnUtil();
		Connection conn=msc.getConnection();
		int status=0;
		
		PreparedStatement  ps=conn.prepareStatement("insert into pph(flat,wing,society) values(?,?,?)");
		ps.setString(1,b.getFlat());
		ps.setString(2, b.getWing());
		ps.setString(3, b.getSociety());
		
		status=ps.executeUpdate();
		
		return status;
		
	}
	
	public static int update(InventoryBean b) throws ClassNotFoundException, SQLException {
		MySqlConnUtil msc=new MySqlConnUtil();
		Connection conn=msc.getConnection();
		
		PreparedStatement ps=conn.prepareStatement("update pph set flat=?,wing=?,society=? where id=?");
		ps.setString(1,b.getFlat());
		ps.setString(2, b.getWing());
		ps.setString(3, b.getSociety());
		ps.setInt(4, b.getId());
		int status=ps.executeUpdate();
		return status;
				
	}
	
	public static int delete(int id) throws ClassNotFoundException, SQLException {
		int status=0;
		MySqlConnUtil msc=new MySqlConnUtil();
		Connection conn=msc.getConnection();
		
		PreparedStatement ps=conn.prepareStatement("delete from pph where id=?");
		ps.setInt(1, id);
		status=ps.executeUpdate();
		return status;
	}
	
	//custom view method;
	public static List<InventoryBean> viewByFlat(String flat) throws ClassNotFoundException, SQLException{
		List<InventoryBean> list=new ArrayList<InventoryBean>();
		MySqlConnUtil msc=new MySqlConnUtil();
		Connection conn=msc.getConnection();
		
		PreparedStatement ps=conn.prepareStatement("select * from pph where flat=?");
		ps.setString(1, flat);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			InventoryBean e=new InventoryBean();
			e.setId(rs.getInt(1));
			e.setFlat(rs.getString(2));
			e.setWing(rs.getString(3));
			e.setSociety(rs.getString(4));
			list.add(e);
		}
		
		return list;
	}
	
	public static List<InventoryBean> viewByWing(String wing) throws ClassNotFoundException, SQLException{
		List<InventoryBean> list=new ArrayList<InventoryBean>();
		MySqlConnUtil msc=new MySqlConnUtil();
		Connection conn=msc.getConnection();
		
		PreparedStatement ps=conn.prepareStatement("select * from pph where wing=?");
		ps.setString(1, wing);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			InventoryBean e=new InventoryBean();
			e.setId(rs.getInt(1));
			e.setFlat(rs.getString(2));
			e.setWing(rs.getString(3));
			e.setSociety(rs.getString(4));
			list.add(e);
		}
		
		return list;
	}
	
	public static List<InventoryBean> viewBySociety(String society) throws ClassNotFoundException, SQLException{
		List<InventoryBean> list=new ArrayList<InventoryBean>();
		MySqlConnUtil msc=new MySqlConnUtil();
		Connection conn=msc.getConnection();
		
		PreparedStatement ps=conn.prepareStatement("select * from pph where society=?");
		ps.setString(1, society);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			InventoryBean e=new InventoryBean();
			e.setId(rs.getInt(1));
			e.setFlat(rs.getString(2));
			e.setWing(rs.getString(3));
			e.setSociety(rs.getString(4));
			list.add(e);
		}
		
		return list;
	}
	//view  all method;
	public static List<InventoryBean> viewAllInventory() throws ClassNotFoundException, SQLException {
		
		List<InventoryBean> list=new ArrayList<InventoryBean>();
		MySqlConnUtil msc=new MySqlConnUtil();
		Connection conn=msc.getConnection();
		
		PreparedStatement  ps=conn.prepareStatement("select * from pph");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			InventoryBean b=new InventoryBean();
			b.setId(rs.getInt(1));
			b.setFlat(rs.getString(2));
			b.setWing(rs.getString(3));
			b.setSociety(rs.getString(4));
			list.add(b);
		}
		
		return list;
		
		
	}
	
	
	
	
}
