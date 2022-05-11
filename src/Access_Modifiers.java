
public class Access_Modifiers {

	String Name = "Durga";

	public void GetName() {

		String Name1 = "Sai";

		System.out.println(Name1);
	}

	public void getData()

	{

		System.out.println(Name);
	}

	public static void main(String[] args) {

		Access_Modifiers Name = new Access_Modifiers();

		Name.GetName();
		Name.getData();

		// TODO Auto-generated method stub

	}

	
	
	// Default : can be accessible inside package only not other packages (within
	// the Package)

	// public ---> variable or method we can access in any package

	// private ---> Cannot access methods or variables outside of class

	// protected same like Default + can be accessibile by subclasses in other
	// package only this happens only when the subclass extends the parent class of
	// that package

}
