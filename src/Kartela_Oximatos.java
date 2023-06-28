
public class Kartela_Oximatos {

	private String make;
	private String sign_num; // αριθμός πινακίδας (αλλάξτε τον αμα θέλετε)
	private String model;
	private int yearOfMake;
	
	public Kartela_Oximatos(String make, String sign_num, String model, int yearOfMake) {
		super();
		this.make = make;
		this.sign_num = sign_num;
		this.model = model;
		this.yearOfMake = yearOfMake;
	}
	
	public void printData() {
		
		System.out.println("Brand: " + make + "\nPlate number: " + sign_num + "\nModel: " + model + "\nYear of make: " + yearOfMake);
	}
	
}
