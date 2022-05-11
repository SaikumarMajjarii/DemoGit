
public class This_Demo {

	
//	this can be used to refer current class instance variable.
//	this can be used to invoke current class method (implicitly)
//	this() can be used to invoke current class constructor.
//	this can be passed as an argument in the method call.
//	this can be passed as argument in the constructor call.
//	this can be used to return the current class instance from the method.
	int a =10;
	
	public void CallSai() {
		
		System.out.println("Called Sai Successfully");
	}
	
	public void GetData()
	{
		
		int a =100;
		System.out.println(this.a);
		
		CallSai();
		
		System.out.println(a);
	}
	
	
	
	
	
	public This_Demo(int a )
	{
		this.a = a ;
		
		System.out.println("print a  value " + this.a);
		
		
	}
	
	///Caling using Method using This Keyword
	public This_Demo(String  Name )
	{
		this(20);
		
		System.out.println("print a  value " +Name );
		
		
	}
	
	
	//Same Refernece Object is creating
	
	void m()
	{  
		System.out.println(this);//prints same reference ID  
		}  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Demo T= 	 new This_Demo("Sai");
		 
		T.GetData();
		System.out.println(T);
		T.m();
	}

}
