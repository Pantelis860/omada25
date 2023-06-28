import java.sql.Time;
import java.util.Date;

public class Rantevou {

	private int customer_code;
	private String vCode; // απο το vehicle_code
	private int year;
	private int month;
	private int day;
	private Double time;
	
	public Rantevou(int customer_code, String vCode, int year, int month, int day, Double time) {
		
		this.customer_code = customer_code;
		this.vCode = vCode;
		this.day = day;
		this.year = year;
		this.month = month;
		this.time = time;
	}
	
	public void printData() {
		
		System.out.println("Kodikos pelati: " + customer_code + "\nKodikos autokinitou: " +vCode + "\nDate: " + year + "/" + month + "/" + day);
		System.out.printf("Time: %,.2f\n" , time );
	}
	
}
