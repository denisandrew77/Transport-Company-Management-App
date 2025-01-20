package ro.denicar.curse.pojo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cursa {
	private int orderNumber;
	private String plate;
	private String carrier;
	private String clientNumber;
	private String client;
	private String loading;
	private String delivery;
	private String status;
	private String info;
	private String vehicleType;
	private String loadingContact;
	private LocalDate loadingDate;
	private LocalTime loadingTime;
	private String loadingRefference;
	private String goodsType;
	private int goodsNumber;
	private int goodsLength;
	private int goodsWidth;
	private int goodsHeight;
	private String loadingAtCompnay;
	private String loadingPostalcode;
	private String loadingCity;
	private String loadingCountry;
	private String deliveryAtCompany;
	private String deliveryPostalcode;
	private String deliveryCity;
	private String deliveryCountry;
	private String deliveryContact;
	private int goodsWeight;
	private LocalDate deliveryDate;
	private LocalTime deliveryTime;
	private String deliveryRefference;
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getClientNumber() {
		return clientNumber;
	}
	public void setClientNumber(String clientNumber) {
		this.clientNumber = clientNumber;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getLoading() {
		return loading;
	}
	public void setLoading(String loading) {
		this.loading = loading;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getLoadingContact() {
		return loadingContact;
	}
	public void setLoadingContact(String loadingContact) {
		this.loadingContact = loadingContact;
	}
	public LocalDate getLoadingDate() {
		return loadingDate;
	}
	public void setLoadingDate(LocalDate loadingDate) {
		this.loadingDate = loadingDate;
	}
	public LocalTime getLoadingTime() {
		return loadingTime;
	}
	public void setLoadingTime(LocalTime loadingTime) {
		this.loadingTime = loadingTime;
	}
	public String getLoadingRefference() {
		return loadingRefference;
	}
	public void setLoadingRefference(String loadingRefference) {
		this.loadingRefference = loadingRefference;
	}
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	public int getGoodsNumber() {
		return goodsNumber;
	}
	public void setGoodsNumber(int goodsNumber) {
		this.goodsNumber = goodsNumber;
	}
	public int getGoodsLength() {
		return goodsLength;
	}
	public void setGoodsLength(int goodsLength) {
		this.goodsLength = goodsLength;
	}
	public int getGoodsWidth() {
		return goodsWidth;
	}
	public void setGoodsWidth(int goodsWidth) {
		this.goodsWidth = goodsWidth;
	}
	public int getGoodsHeight() {
		return goodsHeight;
	}
	public void setGoodsHeight(int goodsHeight) {
		this.goodsHeight = goodsHeight;
	}
	public String getLoadingAtCompnay() {
		return loadingAtCompnay;
	}
	public void setLoadingAtCompnay(String loadingAtCompnay) {
		this.loadingAtCompnay = loadingAtCompnay;
	}
	public String getLoadingPostalcode() {
		return loadingPostalcode;
	}
	public void setLoadingPostalcode(String loadingPostalcode) {
		this.loadingPostalcode = loadingPostalcode;
	}
	public String getLoadingCity() {
		return loadingCity;
	}
	public void setLoadingCity(String loadingCity) {
		this.loadingCity = loadingCity;
	}
	public String getLoadingCountry() {
		return loadingCountry;
	}
	public void setLoadingCountry(String loadingCountry) {
		this.loadingCountry = loadingCountry;
	}
	public String getDeliveryAtCompany() {
		return deliveryAtCompany;
	}
	public void setDeliveryAtCompany(String deliveryAtCompany) {
		this.deliveryAtCompany = deliveryAtCompany;
	}
	public String getDeliveryPostalcode() {
		return deliveryPostalcode;
	}
	public void setDeliveryPostalcode(String deliveryPostalcode) {
		this.deliveryPostalcode = deliveryPostalcode;
	}
	public String getDeliveryCity() {
		return deliveryCity;
	}
	public void setDeliveryCity(String deliveryCity) {
		this.deliveryCity = deliveryCity;
	}
	public String getDeliveryCountry() {
		return deliveryCountry;
	}
	public void setDeliveryCountry(String deliveryCountry) {
		this.deliveryCountry = deliveryCountry;
	}
	public String getDeliveryContact() {
		return deliveryContact;
	}
	public void setDeliveryContact(String deliveryContact) {
		this.deliveryContact = deliveryContact;
	}
	public int getGoodsWeight() {
		return goodsWeight;
	}
	public void setGoodsWeight(int goodsWeight) {
		this.goodsWeight = goodsWeight;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public LocalTime getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(LocalTime deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public String getDeliveryRefference() {
		return deliveryRefference;
	}
	public void setDeliveryRefference(String deliveryRefference) {
		this.deliveryRefference = deliveryRefference;
	}
	public Cursa(int orderNumber, String plate, String carrier, String clientNumber, String client, String loading,
			String delivery, String status, String info, String vehicleType, String loadingContact,
			LocalDate loadingDate, LocalTime loadingTime, String loadingRefference, String goodsType, int goodsNumber,
			int goodsLength, int goodsWidth, int goodsHeight, String loadingAtCompnay, String loadingPostalcode,
			String loadingCity, String loadingCountry, String deliveryAtCompany, String deliveryPostalcode,
			String deliveryCity, String deliveryCountry, String deliveryContact, int goodsWeight,
			LocalDate deliveryDate, LocalTime deliveryTime, String deliveryRefference) {
		super();
		this.orderNumber = orderNumber;
		this.plate = plate;
		this.carrier = carrier;
		this.clientNumber = clientNumber;
		this.client = client;
		this.loading = loading;
		this.delivery = delivery;
		this.status = status;
		this.info = info;
		this.vehicleType = vehicleType;
		this.loadingContact = loadingContact;
		this.loadingDate = loadingDate;
		this.loadingTime = loadingTime;
		this.loadingRefference = loadingRefference;
		this.goodsType = goodsType;
		this.goodsNumber = goodsNumber;
		this.goodsLength = goodsLength;
		this.goodsWidth = goodsWidth;
		this.goodsHeight = goodsHeight;
		this.loadingAtCompnay = loadingAtCompnay;
		this.loadingPostalcode = loadingPostalcode;
		this.loadingCity = loadingCity;
		this.loadingCountry = loadingCountry;
		this.deliveryAtCompany = deliveryAtCompany;
		this.deliveryPostalcode = deliveryPostalcode;
		this.deliveryCity = deliveryCity;
		this.deliveryCountry = deliveryCountry;
		this.deliveryContact = deliveryContact;
		this.goodsWeight = goodsWeight;
		this.deliveryDate = deliveryDate;
		this.deliveryTime = deliveryTime;
		this.deliveryRefference = deliveryRefference;
	}
	public Cursa() {
		super();
	}
	
	
}
