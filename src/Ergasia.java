import java.util.ArrayList;

public class Ergasia {

	private String name;
	ArrayList<Antallaktiko> antallaktika = new ArrayList<Antallaktiko>(); 


	public Ergasia(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public Double CalculatedCost(ArrayList<Antallaktiko> antallaktika) {
		
		Double sum = 0.0;
		
		for(Antallaktiko antallaktiko: antallaktika) {
			sum += antallaktiko.getCost();
		}
	
		return sum;	
	}
	
	public void printData() {
		System.out.println("Name: " + name);
	}
}
