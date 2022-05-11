import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java_Streams {

	// count the Number of Names Starting with Letter A

	public void UniqueName() {
		ArrayList<String> UN = new ArrayList<String>();
		UN.add("Abhijeet");
		UN.add("Abhi");
		UN.add("Rahul");
		UN.add("Aparna");
		UN.add("sai");
		UN.add("Sneha");
		int Count = 0;

		for (int i = 0; i < UN.size(); i++) {

			if (UN.get(i).startsWith("A")) {

				Count++;

			}

		}

		System.out.println(Count);
	}

	public static void StreamFilter() {
		ArrayList<String> UN = new ArrayList<String>();
		UN.add("Abhijeet");
		UN.add("Abhi");
		UN.add("Rahul");
		UN.add("Aparna");
		UN.add("sai");
		UN.add("Sneha");

		long UniqueNames = UN.stream().filter(S -> S.startsWith("A")).count();

		System.out.println(UniqueNames);

		UN.stream().filter(S -> S.length() > 4).forEach(S -> System.out.println(S));

		UN.stream().filter(S -> S.length() > 4).limit(1).forEach(S -> System.out.println(S));

	}

	public static void StreamMap() {
		
		
		Stream.of("Abhijeet","Abhi","Rahul","Aparna","Sneha").filter(S->S.endsWith("a")).map(S->S.toUpperCase()).forEach(S->System.out.println(S));
	
		ArrayList<String> UN1 = new ArrayList<String>();
		UN1.add("Abhijeet");
		UN1.add("Abhi");
		UN1.add("Rahul");

		List<String> Names = Arrays.asList("Abhijeet", "Abhi", "Rahul", "Aparna", "Sneha");

		Names.stream().filter(S -> S.startsWith("A")).sorted().map(S -> S.toUpperCase()).forEach(S -> System.out.println(S));

		Stream<String> NewNames = Stream.concat(UN1.stream(), Names.stream());

		NewNames.sorted().forEach(S -> System.out.println(S));

		boolean Flag = NewNames.anyMatch(S->S.equalsIgnoreCase("Abhi"));

		System.out.println(Flag);
		
	
	}

	public void Collectors()
	{
		
	List<String> Newlist =	Stream.of("Abhijeet","Abhi","Rahul","Aparna","Sneha").filter(S->S.endsWith("a")).map(S->S.toUpperCase()).collect(java.util.stream.Collectors.toList());
	
	Newlist.get(0);

	}
	
	
	public static void Unique()
	{
		
		
		
		List<String> Names = Arrays.asList("2","1","6","8","5","4","9","9");
	
		List <String> Unique_Names = Names.stream().distinct().sorted().collect(java.util.stream.Collectors.toList());
	
		 Names.stream().distinct().sorted().forEach(S->System.out.println(S));
//		System.out.println(Unique_Names.get(3));
	

	}
	

	public static void main(String[] args) {
;
		Java_Streams JS = new Java_Streams();
//		 JS.UniqueName();
//		// TODO Auto-generated method stub
//		 StreamFilter();

		//StreamMap();
		Unique();
		
	}

}
