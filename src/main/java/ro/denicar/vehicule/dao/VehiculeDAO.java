package ro.denicar.vehicule.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ro.denicar.helper.DBHelper;
import ro.denicar.vehicule.pojo.Vehicul;

public class VehiculeDAO {
	public static Vehicul getById(String plate) throws ClassNotFoundException, SQLException {
		Connection conn = DBHelper.getConnection();
		String statement = "Select * from Vehicule where Plate = ?";
		PreparedStatement ps = conn.prepareStatement(statement);
		ps.setString(1, plate);
		ResultSet rs = ps.executeQuery();
		Vehicul vehicul=null;
		if(rs.next()) {
			String plateLocal = rs.getString("Plate");
			String phoneNumber1 = rs.getString("Phone_number_1");
			String name = rs.getString("Name");
			int length = rs.getInt("Length");
			int width = rs.getInt("Width");
			int height = rs.getInt("Height");
			String type = rs.getString("Type");
			String phoneNumber2=rs.getString("Phone_number_2");
			vehicul = new Vehicul(plateLocal,phoneNumber1,name,length,width,height,type,phoneNumber2);
		}
		DBHelper.closeConnection();
		return vehicul;
	}
	public static ArrayList<Vehicul> getAll() throws ClassNotFoundException, SQLException{
		Connection conn = DBHelper.getConnection();
		String statement = "Select * from Vehicule";
		PreparedStatement ps = conn.prepareStatement(statement);
		ResultSet rs = ps.executeQuery();
		ArrayList<Vehicul> vehicule=new ArrayList<Vehicul>();
		while(rs.next()) {
			String plateLocal = rs.getString("Plate");
			String phoneNumber1 = rs.getString("Phone_number_1");
			String name = rs.getString("Name");
			int length = rs.getInt("Length");
			int width = rs.getInt("Width");
			int height = rs.getInt("Height");
			String type = rs.getString("Type");
			String phoneNumber2=rs.getString("Phone_number_2");
			Vehicul vehicul = new Vehicul(plateLocal,phoneNumber1,name,length,width,height,type,phoneNumber2);
			vehicule.add(vehicul);
		}
		DBHelper.closeConnection();
		return vehicule;
	}
	public static void createVehicul(Vehicul vehicul) throws ClassNotFoundException, SQLException {
		Connection conn = DBHelper.getConnection();
		String statement = "Insert Into Vehicule(Plate,Phone_number_1,Name,Length,Width,Height,Type,Phone_number_2) values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(statement);
		ps.setString(1, vehicul.getPlate());
		ps.setString(2, vehicul.getPhoneNumber1());
		ps.setString(3, vehicul.getName());
		ps.setInt(4,vehicul.getLength());
		ps.setInt(5, vehicul.getWidth());
		ps.setInt(6, vehicul.getHeight());
		ps.setString(7, vehicul.getType());
		ps.setString(8, vehicul.getPhoneNumber2());
		ps.executeUpdate();
		DBHelper.closeConnection();
	}
	public static void updateVehicul(Vehicul vehicul) throws ClassNotFoundException, SQLException {
		Connection conn = DBHelper.getConnection();
		String update = "Update Vehicule set Phone_number_1=?, Name=?, Length=?, Width=?, Height=?, Type=?, Phone_number_2=? where Plate=?";
		PreparedStatement ps = conn.prepareStatement(update);
		ps.setString(1, vehicul.getPhoneNumber1());
		ps.setString(2,vehicul.getName());
		ps.setInt(3, vehicul.getLength());
		ps.setInt(4, vehicul.getWidth());
		ps.setInt(5, vehicul.getHeight());
		ps.setString(6, vehicul.getType());
		ps.setString(7, vehicul.getPhoneNumber2());
		ps.setString(8, vehicul.getPlate());
		System.out.println("Executing Update with Plate: " + vehicul.getPlate());
		System.out.println("Phone Number 1: " + vehicul.getPhoneNumber1());
		System.out.println("Name: " + vehicul.getName());
		System.out.println("Length: " + vehicul.getLength());
		System.out.println("Width: " + vehicul.getWidth());
		System.out.println("Height: " + vehicul.getHeight());
		System.out.println("Type: " + vehicul.getType());
		System.out.println("Phone Number 2: " + vehicul.getPhoneNumber2());
		int rowsAffected=ps.executeUpdate();
		DBHelper.closeConnection();
	}
	public static void delete(String plate) throws SQLException, ClassNotFoundException {
		Connection conn = DBHelper.getConnection();
		String delete = "Delete from Vehicule where Plate=?";
		PreparedStatement ps = conn.prepareStatement(delete);
		ps.setString(1, plate);
		ps.executeUpdate();
		DBHelper.closeConnection();

	}
}	
