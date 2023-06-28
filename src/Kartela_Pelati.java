
public class Kartela_Pelati {

	private String firstName;
	private String lastName;
	private long phone;
	private String address;
	private String email;
	
	// Constructor creation
	
	public Kartela_Pelati(String firstName, String lastName, long phone, String address, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}
	
public void printData() {
		
		System.out.println("First Name: " + firstName + "\nLast Name: " + lastName + "\nPhone: " + phone + "\nAddress: " + address + "\nemail: " + email);
	}
	
	
}
