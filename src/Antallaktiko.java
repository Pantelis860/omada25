
public class Antallaktiko {

	private String name;
	private Double cost;
	
	
	public Antallaktiko(String name, Double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}


	public Double getCost() {
		return cost;
	}
	
	public void printData() {
		
		System.out.println("Name: " + name + "\nCost of car part: " + cost);
		
	}
	
	
	
}
