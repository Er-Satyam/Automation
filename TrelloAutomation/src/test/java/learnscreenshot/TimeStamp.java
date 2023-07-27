package learnscreenshot;

import java.time.LocalDateTime;

public class TimeStamp {
	public static void main(String[] args) {
		
		 LocalDateTime local = LocalDateTime.now(); //capture the local date and time of the machine
		   
	       System.out.println("Local = "+local); 
		 
		  
		  String timeString = local.toString();  //convert it into string
		  System.out.println("String convert ="+timeString);
		  
		  
		   String updatedString = timeString.replace(':', '-');//replace colon too hyphen
		  
		  System.out.println("updated string = "+updatedString);
		 
		/*String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		
		System.out.println(timeStamp );*/
		
	}

}
