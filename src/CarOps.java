import java.util.ArrayList;
import java.sql.Time;
import java.util.Date;


public class CarOps {

	public static void main(String[] args) {

		ArrayList<Rantevou> rantevou = new ArrayList<Rantevou>(); 
		ArrayList<Kartela_Oximatos> karteles = new ArrayList<Kartela_Oximatos>();
		ArrayList<Kartela_Pelati> karteles_pel = new ArrayList<Kartela_Pelati>();
		ArrayList<Antallaktiko> antallaktika = new ArrayList<Antallaktiko>();
		

		
		Grammateia g1 = new Grammateia();
		
		Rantevou r1 = g1.Create_Rantevou(104, "A160", 2023 , 07 , 01 , 11.30);
		System.out.println("New appointment has been created");
		Rantevou r2 = g1.Create_Rantevou(105, "Corsa", 2023 , 07 , 01 , 12.00);
		System.out.println("New appointment has been created");
		Rantevou r3 = g1.Create_Rantevou(106, "3008", 2023 , 07 , 02 , 16.00);
		System.out.println("New appointment has been created");
		
		rantevou.add(r1);
		rantevou.add(r2);
		rantevou.add(r3);
		
		Kartela_Oximatos ko1 = g1.Create_Kartela_oximatos("Mercedes", "NZZ 2501", "A160", 2010);
		System.out.println("New card has been created");
		Kartela_Oximatos ko2 = g1.Create_Kartela_oximatos("Ford", "NZZ 2505", "fiesta", 2005);
		System.out.println("New card has been created");
		Kartela_Oximatos ko3 = g1.Create_Kartela_oximatos("Audi", "NIX 2603", "A4", 2002);
		System.out.println("New card has been created");
		Kartela_Oximatos ko4 = g1.Create_Kartela_oximatos("Hyundai", "KOI 7601", "i20", 2004);
		System.out.println("New card has been created");
		Kartela_Oximatos ko5 = g1.Create_Kartela_oximatos("Nissan", "NIO 2023", "micra", 2019);
		System.out.println("New card has been created");
		Kartela_Oximatos ko6 = g1.Create_Kartela_oximatos("Peugeot", "KAI 7893", "3008", 2010);
		System.out.println("New card has been created");
		
		karteles.add(ko1);
		karteles.add(ko2);
		karteles.add(ko3);
		karteles.add(ko4);
		karteles.add(ko5);
		karteles.add(ko6);
		
		Kartela_Pelati kp1 = g1.Create_Kartela_pelati("Giorgos", "Xronopoulos", 6956765789L, "Filippou 8", "gxro@gmail.com ");
		System.out.println("New customer card has been created");
		Kartela_Pelati kp2 = g1.Create_Kartela_pelati("Giannis", "Georgiou", 6940808884L, "Mpotsari 5", "gianisgeo@gmail.com ");
		System.out.println("New customer card has been created");
		Kartela_Pelati kp3 = g1.Create_Kartela_pelati("Nikos", "Pantelidis", 6940808855L, "Tsimiski 87", "gxro@gmail.com ");
		System.out.println("New customer card has been created");
		
		karteles_pel.add(kp1);
		karteles_pel.add(kp2);
		karteles_pel.add(kp3);
		
		Ergasia Ergasia1 = new Ergasia("Αλλαγή λαδιών , φίλτρου και συντήρηση φρένων");
		
		Antallaktiko Antallaktiko1 = new Antallaktiko("Συσκευασία λαδιών 4lt" , 30.0);
		System.out.println("New car part has been created");
		Antallaktiko Antallaktiko2 = new Antallaktiko("Φίλτρο Λαδιού" , 20.0);
		System.out.println("New car part has been created");
		Antallaktiko Antallaktiko3 = new Antallaktiko("Φίλτρο Καμπίνας" , 30.0);
		System.out.println("New car part has been created");
		Antallaktiko Antallaktiko4 = new Antallaktiko("Τακάκι φρένων εμπρός τροχού" , 5.0);
		System.out.println("New car part has been created");
		Antallaktiko Antallaktiko5 = new Antallaktiko("Τακάκι φρένων πίσω τροχού" , 5.0);
		System.out.println("New car part has been created");
		Antallaktiko Antallaktiko6 = new Antallaktiko("Υγρό Φρένων" , 10.0);
		System.out.println("New car part has been created");
		
		antallaktika.add(Antallaktiko1);
		antallaktika.add(Antallaktiko2);
		antallaktika.add(Antallaktiko3);
		antallaktika.add(Antallaktiko4);
		antallaktika.add(Antallaktiko5);
		antallaktika.add(Antallaktiko6);
		
		
		
		System.out.println("");
		
		System.out.println("---Emfanisi rantevou---");
		for(Rantevou rant: rantevou) {
			rant.printData();
			System.out.println("");
			
		}
		System.out.println("---Karteles Oximaton---");
		for(Kartela_Oximatos oxima: karteles) {
			oxima.printData();
			System.out.println("");
			
		}
		
		System.out.println("---Karteles Pelaton---");
		for(Kartela_Pelati pel: karteles_pel) {
			pel.printData();
			System.out.println("");
			
		}
		
		System.out.println("---Ergasies---");
		System.out.println("Ergasia: " + Ergasia1.getName());
		
		System.out.println("");
		
		System.out.println("---Antallaktika---");
		for(Antallaktiko ant: antallaktika) {
			ant.printData();
			System.out.println("");
		}
		
		System.out.println("Συνολικό κόστος εργασίας: " + Ergasia1.CalculatedCost(antallaktika));
		
		
		
		
		
		
		
		
		
		
					
	}

}
