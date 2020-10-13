package business;

public class Vendor {

	// ---------- instance variables ----------
	private int id;
	private String code;
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;
	
	// ---------- constructor ----------
	public Vendor() {
		super();
	}

	public Vendor(int id, String code, String name, String address, String city, String state, String zip,
			String phoneNumber, String email) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	// ---------- getters and setters ----------
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		return "===============================\n" +
				"Vendor Summary: \n" +
				"===============================\n" +
				"ID: " + id + "\n" +
				"Code: " + code +  "\n" +
				"Name: " + name + "\n" +
				"Address: " + address + "\n" +
				"City: " + city + "\n" +
				"State: " + state + "\n" +
				"Zip: " + zip + "\n" +
				"Phone Number: " + phoneNumber + "\n" +
				"Email: " + email  + "\n";
	}	
	
}
