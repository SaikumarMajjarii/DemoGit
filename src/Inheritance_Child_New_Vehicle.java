
public class Inheritance_Child_New_Vehicle extends Inheritance_Parent_Class {

	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Inheritance_Child_New_Vehicle C	=new  Inheritance_Child_New_Vehicle();
		
//		C.Engine();
		
		C.GetDisplay("Sai");
		C.NewUpatedEngine();
		
//		C.Engine();
		
		}

	//Java Does not Allow Multiple inheritances

	
	
	public void GetDisplay()
	{
		
		System.out.println("Sai");
	}
	
	

	public void GetDisplay(String Name )
	{
		
		System.out.println("Sai New with Details ");
	}
	
	
	
	
	public void NewUpatedEngine()
	
	
	{
		System.out.println("Child New Updated Engine");
		
	}
}
