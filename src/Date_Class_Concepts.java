import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_Class_Concepts {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
		Date d =new Date();
		
		//TO see Date 
		System.out.println(d.toString());

		//Required Format
		SimpleDateFormat SDF =new  SimpleDateFormat("dd/mm/yyyy") ;
		
		
		//date to string conversion
		System.out.println(SDF.format(d));
	
		
		 String sDate1="31/12/1998";  
		 
		 //String to Date 
		 Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1); 

		 System.out.println(sDate1+"\t"+date1);  
		//print date in required Format
		
		
		 
		 Calendar cal = Calendar.getInstance();
		 System.out.println(cal.getTime());
		
	}

	
	
	
	
}
