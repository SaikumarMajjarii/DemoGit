
public class Static_Concepts {

	String Name;
	String Address;

	static String State ;

	static int Count ;

	//Static Block
	static {
		
		 State = "AndhraPradesh";
		 Count = 0;
	}
	
	public Static_Concepts(String Name, String Address) {
		this.Name = Name;
		this.Address = Address;

		Count++;
		System.out.println(Count);
	}

	public void GetAddress() {
		System.out.println(Address + " " + State);

	}

	
	//Static Method
	public static void GetState()
	
	{
		System.out.println(State);
		
		//only use Static variables inside static methods
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static_Concepts S = new Static_Concepts("Sai", "Bangalore");

		Static_Concepts S1 = new Static_Concepts("Kumar", "Kurnool");
		
		//ClassName dot method Name
		Static_Concepts.GetState();
		S1.GetAddress();
		S.GetAddress();
	}

}
