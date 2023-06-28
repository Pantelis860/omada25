public class Grammateia {

	public Rantevou Create_Rantevou(int Ccode , String vCode , int year , int month , int day , Double time) {
		
		return new Rantevou(Ccode , vCode , year , month , day , time );
		
	}
	
	public Kartela_Pelati Create_Kartela_pelati(String firstName, String lastName, long phone, String address, String email) {
		
		return new Kartela_Pelati(firstName , lastName , phone , address , email);
		
	}
	
	public Kartela_Oximatos Create_Kartela_oximatos(String make, String sign_num, String model, int yearOfMake) {
		
		return new Kartela_Oximatos(make , sign_num , model , yearOfMake);
		
	}
	
	public void Create_receipt() {
		
	}
	
}
