package ro.denicar.companii.pojo;

public class Companie {
	private String companyName;
	private String location;
	private String contact;
	private int numberOfEmployees;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public Companie(String companyName, String location, String contact, int numberOfEmployees) {
		super();
		this.companyName = companyName;
		this.location = location;
		this.contact = contact;
		this.numberOfEmployees = numberOfEmployees;
	}
	public Companie() {
		super();
	}
	
}
