
public class States_Follow implements NarenModi_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		NarenModi_Interface AP = new States_Follow();
		 
		AP.GiveBooks();
		AP.GivePens();
		
	

	}

	@Override
	public void GiveBooks() {
		// TODO Auto-generated method stub
		
		System.out.println("given Books");
		
	}

	@Override
	public void GiveScholarship() {
		
		System.out.println("given Scholarship");
		
	}

	@Override
	public void GivePens() {
		System.out.println("givenPens");
		
	}
	
	public void GiveLaptops() {
		System.out.println("givenP GiveLaptops");
		
	}
	
	
	
	

}
