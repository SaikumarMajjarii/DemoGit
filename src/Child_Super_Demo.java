
public class Child_Super_Demo extends Parent_Super_Demo{

//	super can be used to refer immediate parent class instance variable.
//	super can be used to invoke immediate parent class method.
//	super() can be used to invoke immediate parent class constructor.
	
	
	public String Name ="Sai";
	
	public void  GetData()
	{
		
		
		System.out.println(Name);
		
		System.out.println(super.Name);
	}
	
	
	
	public Child_Super_Demo()
	{
		
		
		super();//this should be always parent class constructor 
		
		System.out.println("Child Class Constructor");
	}
	
	
	
	//using Super Ke
	public void GetName()
	{
		
		
		
		
		System.out.println("Brings Child Name ");
		super.GetName();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child_Super_Demo Child =	 new Child_Super_Demo(); 
		
		
		Child.GetData();
		Child.GetName();
		
	}

}
