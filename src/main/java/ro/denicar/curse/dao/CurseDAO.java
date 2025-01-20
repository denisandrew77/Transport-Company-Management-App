package ro.denicar.curse.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import ro.denicar.curse.pojo.Cursa;
import ro.denicar.helper.DBHelper;

public class CurseDAO {
	public static Cursa getById(int orderNumber) throws ClassNotFoundException, SQLException {
		Connection conn = DBHelper.getConnection();
		String query = "Select * from Curse where Order_number = ?";
		PreparedStatement  ps = conn.prepareStatement(query);
		ps.setInt(1, orderNumber);
		ResultSet rs = ps.executeQuery();
		Cursa cursa = null;
		if(rs.next()) {
			int orderNumber1 = rs.getInt("Order_number");
			String plate = rs.getString("Plate");
			String carrier = rs.getString("Carrier");
			String clientNumber = rs.getString("Client_number");
			String client = rs.getString("Client");
			String loading = rs.getString("Loading");
			String delivery = rs.getString("Delivery");
			String status = rs.getString("Status");
			String info = rs.getString("Info");
			String vehicleType = rs.getString("Vehicle_type");
			String loadingContact = rs.getString("Loading_contact");
			LocalDate loadingDate = rs.getDate("Loading_date").toLocalDate();
			 LocalTime loadingTime = rs.getTime("Loading_time").toLocalTime();
			 String loadingRefference = rs.getString("Loading_refference");
			 String goodsType=rs.getString("Goods_type");
			 int goodsNumber=rs.getInt("Goods_number");
			 int goodsLength=rs.getInt("Goods_length");
			 int goodsWidth=rs.getInt("Goods_width");
			 int goodsHeight=rs.getInt("Goods_height");
			 String loadingAtCompany=rs.getString("Loading_at_Company");
			 String loadingPostalcode=rs.getString("Loading_postalcode");
			 String loadingCity=rs.getString("Loading_city");
			 String loadingCountry=rs.getString("Loading_country");
			 String deliveryAtCompany=rs.getString("Delivery_at_company");
			 String deliveryPostalcode=rs.getString("Delivery_postalcode");
			 String deliveryCity=rs.getString("Delivery_city");
			 String deliveryCountry=rs.getString("Delivery_country");
			 String deliveryContact=rs.getString("Delivery_contact");
			 int goodsWeight=rs.getInt("Goods_weight");
			 LocalDate deliveryDate=rs.getDate("Delivery_date").toLocalDate();
			 LocalTime deliveryTime=rs.getTime("Delivery_time").toLocalTime();
			 String deliveryRefference=rs.getString("Delivery_refference");
			cursa = new Cursa(orderNumber1,plate,carrier,clientNumber,client,loading,
					delivery,status,info,vehicleType,loadingContact,loadingDate,loadingTime,
					loadingRefference,goodsType,goodsNumber,goodsLength,goodsWidth,goodsHeight,
					loadingAtCompany,loadingPostalcode,loadingCity,loadingCountry,deliveryAtCompany,
					deliveryPostalcode,deliveryCity,deliveryCountry,deliveryContact,goodsWeight,deliveryDate,
					deliveryTime,deliveryRefference);
		}
		DBHelper.closeConnection();
		return cursa;
	}
	public static ArrayList<Cursa> getAll() throws SQLException, ClassNotFoundException{
		Connection conn = DBHelper.getConnection();
		String query = "Select * from Curse";
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		ArrayList<Cursa>  curse = new ArrayList<Cursa>();
		while(rs.next()) {
			int orderNumber1 = rs.getInt("Order_number");
			String plate = rs.getString("Plate");
			String carrier = rs.getString("Carrier");
			String clientNumber = rs.getString("Client_number");
			String client = rs.getString("Client");
			String loading = rs.getString("Loading");
			String delivery = rs.getString("Delivery");
			String status = rs.getString("Status");
			String info = rs.getString("Info");
			String vehicleType = rs.getString("Vehicle_type");
			String loadingContact = rs.getString("Loading_contact");
			LocalDate loadingDate = rs.getDate("Loading_date").toLocalDate();
			 LocalTime loadingTime = rs.getTime("Loading_time").toLocalTime();
			 String loadingRefference = rs.getString("Loading_refference");
			 String goodsType=rs.getString("Goods_type");
			 int goodsNumber=rs.getInt("Goods_number");
			 int goodsLength=rs.getInt("Goods_length");
			 int goodsWidth=rs.getInt("Goods_width");
			 int goodsHeight=rs.getInt("Goods_height");
			 String loadingAtCompany=rs.getString("Loading_at_Company");
			 String loadingPostalcode=rs.getString("Loading_postalcode");
			 String loadingCity=rs.getString("Loading_city");
			 String loadingCountry=rs.getString("Loading_country");
			 String deliveryAtCompany=rs.getString("Delivery_at_company");
			 String deliveryPostalcode=rs.getString("Delivery_postalcode");
			 String deliveryCity=rs.getString("Delivery_city");
			 String deliveryCountry=rs.getString("Delivery_country");
			 String deliveryContact=rs.getString("Delivery_contact");
			 int goodsWeight=rs.getInt("Goods_weight");
			 LocalDate deliveryDate=rs.getDate("Delivery_date").toLocalDate();
			 LocalTime deliveryTime=rs.getTime("Delivery_time").toLocalTime();
			 String deliveryRefference=rs.getString("Delivery_refference");
			 Cursa cursa = new Cursa(orderNumber1,plate,carrier,clientNumber,client,loading,
					delivery,status,info,vehicleType,loadingContact,loadingDate,loadingTime,
					loadingRefference,goodsType,goodsNumber,goodsLength,goodsWidth,goodsHeight,
					loadingAtCompany,loadingPostalcode,loadingCity,loadingCountry,deliveryAtCompany,
					deliveryPostalcode,deliveryCity,deliveryCountry,deliveryContact,goodsWeight,deliveryDate,
					deliveryTime,deliveryRefference);
			 curse.add(cursa);
		}
		DBHelper.closeConnection();
		return curse;
	}
	public static void update(Cursa c) throws ClassNotFoundException, SQLException {
		Connection conn = DBHelper.getConnection();
		String update = "Update Curse set Plate=?, Carrier=?, Client_number=?, Client=?,"
				+ " Loading=?, Delivery=?, Status=?, Info=?, Vehicle_type=?,Loading_contact=?,"
				+ "Loading_date=?,Loading_time=?,Loading_refference=?,Goods_type=?,Goods_number=?,"
				+ "Goods_length=?,Goods_width=?,Goods_height=?,Loading_at_Company=?,Loading_postalcode=?,"
				+ "Loading_city=?,Loading_country=?,Delivery_at_company=?,Delivery_postalcode=?,"
				+ "Delivery_city=?,Delivery_country=?,Delivery_contact=?,Goods_weight=?,"
				+ "Delivery_date=?,Delivery_time=?,Delivery_refference=? where Order_number=?";
		PreparedStatement ps = conn.prepareStatement(update);
		ps.setString(1, c.getPlate());
		ps.setString(2, c.getCarrier());
		ps.setString(3, c.getClientNumber());
		ps.setString(4, c.getClient());
		ps.setString(5, c.getLoading());
		ps.setString(6, c.getDelivery());
		ps.setString(7, c.getStatus());
		ps.setString(8, c.getInfo());
		ps.setString(9, c.getVehicleType());
		ps.setString(10,c.getLoadingContact());
		ps.setObject(11, c.getLoadingDate());
		ps.setObject(12, c.getLoadingTime());
		ps.setString(13,c.getLoadingRefference());
		ps.setString(14, c.getGoodsType());
		ps.setInt(15,c.getGoodsNumber());
		ps.setInt(16,c.getGoodsLength());
		ps.setInt(17,c.getGoodsWidth());
		ps.setInt(18,c.getGoodsHeight());
		ps.setString(19, c.getLoadingAtCompnay());
		ps.setString(20,c.getLoadingPostalcode());
		ps.setString(21,c.getLoadingCity());
		ps.setString(22,c.getLoadingCountry());
		ps.setString(23, c.getDeliveryAtCompany());
		ps.setString(24,c.getDeliveryPostalcode());
		ps.setString(25,c.getDeliveryCity());
		ps.setString(26,c.getDeliveryCountry());
		ps.setString(27,c.getDeliveryContact());
		ps.setInt(28,c.getGoodsWeight());
		ps.setObject(29,c.getDeliveryDate());
		ps.setObject(30,c.getDeliveryTime());
		ps.setString(31,c.getDeliveryRefference());
		ps.setInt(32, c.getOrderNumber());
		
		ps.executeUpdate();
		DBHelper.closeConnection();
	}
	public static void delete(int orderNumber) throws ClassNotFoundException, SQLException {
		Connection conn = DBHelper.getConnection();
		String deleteStatement="Delete from Curse where Order_number = ?";
		PreparedStatement ps = conn.prepareStatement(deleteStatement);
		ps.setInt(1, orderNumber);
		ps.executeUpdate();
		DBHelper.closeConnection();
	}
	public static void create(Cursa c) throws ClassNotFoundException, SQLException {
		Connection conn = DBHelper.getConnection();
		String createStatement = "INSERT INTO Curse (Order_number, Plate, Carrier, Client_number, Client, Loading, Delivery, Status, Info, Vehicle_type, Loading_contact, Loading_date, Loading_time, Loading_refference, Goods_type, Goods_number, Goods_length, Goods_width, Goods_height, Loading_at_Company, Loading_postalcode, Loading_city, Loading_country, Delivery_at_company, Delivery_postalcode, Delivery_city, Delivery_country, Delivery_contact, Goods_weight, Delivery_date, Delivery_time, Delivery_refference) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(createStatement);
		ps.setInt(1, c.getOrderNumber());
		ps.setString(2, c.getPlate());
		ps.setString(3, c.getCarrier());
		ps.setString(4, c.getClientNumber());
		ps.setString(5, c.getClient());
		ps.setString(6, c.getLoading());
		ps.setString(7, c.getDelivery());
		ps.setString(8, c.getStatus());
		ps.setString(9, c.getInfo());
		ps.setString(10, c.getVehicleType());
		ps.setString(11,c.getLoadingContact());
		ps.setObject(12, c.getLoadingDate());
		ps.setObject(13, c.getLoadingTime());
		ps.setString(14,c.getLoadingRefference());
		ps.setString(15, c.getGoodsType());
		ps.setInt(16,c.getGoodsNumber());
		ps.setInt(17,c.getGoodsLength());
		ps.setInt(18,c.getGoodsWidth());
		ps.setInt(19,c.getGoodsHeight());
		ps.setString(20, c.getLoadingAtCompnay());
		ps.setString(21,c.getLoadingPostalcode());
		ps.setString(22,c.getLoadingCity());
		ps.setString(23,c.getLoadingCountry());
		ps.setString(24, c.getDeliveryAtCompany());
		ps.setString(25,c.getDeliveryPostalcode());
		ps.setString(26,c.getDeliveryCity());
		ps.setString(27,c.getDeliveryCountry());
		ps.setString(28,c.getDeliveryContact());
		ps.setInt(29,c.getGoodsWeight());
		ps.setObject(30,c.getDeliveryDate());
		ps.setObject(31,c.getDeliveryTime());
		ps.setString(32,c.getDeliveryRefference());
		ps.executeUpdate();
		DBHelper.closeConnection();
	}
	
}
