
public class Green_India implements GreenEnvironment,Green_Bio{
	
	

	public static void main(String[] args) {
		
		
		GreenEnvironment A = 	new Green_India();
		Green_Bio B = 	new Green_India();
		Green_India I = new Green_India();
		I.GreenAirplanes();
		I.GreenBuses();
		
		B.Green_Bio_Cars();
		A.GreenAutos();
		A.GreenBuses();
		A.GreenCars();
		
	
		// TODO Auto-generated method stub

	}

	@Override
	public void GreenAutos() {
		// TODO Auto-generated method stub
		
		System.out.println("Autos");
	}

	@Override
	public void GreenCars() {
		// TODO Auto-generated method stub
		System.out.println("Cars");
	}

	@Override
	public void GreenBuses() {
		// TODO Auto-generated method stub
		System.out.println("GreenBuses");
		
	}

	@Override
	public void Green_Bio_Cars() {
		// TODO Auto-generated method stub
		System.out.println("Bio_Cars");
	}

	
	public void GreenAirplanes()
	{
		System.out.println("Planes");
	}
	
}
