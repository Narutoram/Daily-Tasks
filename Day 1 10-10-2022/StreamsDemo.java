package dailyTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsDemo {    

	public static void main(String[] args) {
		
	    List<Integer> number = Arrays.asList(2,3,4,5); 
	      
	    number.stream().map(x->x*x).forEach(y->System.out.println(y));
	    
	    List<String> games = new ArrayList<String>();  
	    games.add("Football");  
	    games.add("Cricket");  
	    games.add("kabadi");     
	    games.forEach(System.out::println); 

	}

}
