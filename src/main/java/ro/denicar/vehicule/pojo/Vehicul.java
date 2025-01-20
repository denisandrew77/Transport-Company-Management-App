package ro.denicar.vehicule.pojo;

public class Vehicul {
	private String plate;
	private String phoneNumber1;
	private String name;
	private int length;
	private int width;
	private int height;
	private String type;
	private String phoneNumber2;
	public String getPlate() {
		return plate;
	}
	public String getPhoneNumber1() {
		return phoneNumber1;
	}
	public String getName() {
		return name;
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public String getType() {
		return type;
	}
	public String getPhoneNumber2() {
		return phoneNumber2;
	}
	
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}
	public Vehicul() {
		super();
	}
	public Vehicul(String plate, String phoneNumber1, String name, int length, int width, int height, String type,
			String phoneNumber2) {
		super();
		this.plate = plate;
		this.phoneNumber1 = phoneNumber1;
		this.name = name;
		this.length = length;
		this.width = width;
		this.height = height;
		this.type = type;
		this.phoneNumber2 = phoneNumber2;
	}
	
}
