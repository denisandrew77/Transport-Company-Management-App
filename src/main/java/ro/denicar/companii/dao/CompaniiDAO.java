package ro.denicar.companii.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ro.denicar.companii.pojo.Companie;
import ro.denicar.helper.DBHelper;

public class CompaniiDAO {
	public static Companie getById(String name) throws ClassNotFoundException, SQLException {
		Connection conn = DBHelper.getConnection();
		String query = "Select * from Companii where Company_name=?";
		Companie company = new Companie();
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			company.setCompanyName(rs.getString("Company_name"));
			company.setLocation(rs.getString("Location"));
			company.setContact(rs.getString("Contact"));
			company.setNumberOfEmployees(rs.getInt("Number_of_employees"));
		}
		DBHelper.closeConnection();
		return company;
	}
	public static ArrayList<Companie> getAll() throws ClassNotFoundException, SQLException{
		Connection conn = DBHelper.getConnection();
		String query = "Select * from Companii";
		ArrayList<Companie> companii = new ArrayList<Companie>();
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			Companie companie = new Companie();
			companie.setCompanyName(rs.getString("Company_name"));
			companie.setLocation(rs.getString("Location"));
			companie.setContact(rs.getString("Contact"));
			companie.setNumberOfEmployees(rs.getInt("Number_of_employees"));
			companii.add(companie);
			
		}
		DBHelper.closeConnection();
		return companii;
	}
	public static void create(Companie companie) throws SQLException, ClassNotFoundException {
		Connection conn = DBHelper.getConnection();
		String update = "Insert Into Companii(Company_name,Location,Contact,Number_of_employees) values (?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(update);
		ps.setString(1, companie.getCompanyName());
		ps.setString(2, companie.getLocation());
		ps.setString(3, companie.getContact());
		ps.setInt(4, companie.getNumberOfEmployees());
		ps.executeUpdate();
		DBHelper.closeConnection();
	}
	public static void update(Companie companie) throws ClassNotFoundException, SQLException {
		Connection conn = DBHelper.getConnection();
		String update = "Update Companii set Location=?, Contact=?, Number_of_employees=? where Company_name=?";
		PreparedStatement ps = conn.prepareStatement(update);
		ps.setString(1, companie.getLocation());
		ps.setString(2, companie.getContact());
		ps.setInt(3, companie.getNumberOfEmployees());
		ps.setString(4, companie.getCompanyName());
		ps.executeUpdate();
		DBHelper.closeConnection();
	}
	public static void delete(String companyName) throws ClassNotFoundException, SQLException {
		Connection conn = DBHelper.getConnection();
		String delete = "Delete from Companii where Company_name=?";
		PreparedStatement ps = conn.prepareStatement(delete);
		ps.setString(1, companyName);
		ps.executeUpdate();
		DBHelper.closeConnection();
	}
}
