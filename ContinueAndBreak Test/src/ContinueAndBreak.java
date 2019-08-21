//created by Fayed Raza
public class ContinueAndBreak {
public static void main (String [] args) {
	//talks about creating continue statements 
	
	
	for (char x='A';x<'z';x++) {
	if( x== 'd' || x=='e')
		break; //break statement
	System.out.println(x);
	}
	
	
	l1: for(int x=0; x<=100;x++) { //prints out odd numbers
		if(x%2 == 0)
			continue l1; //continue so it cannot print even numbers
		
		System.out.print(x);
	}
	System.out.println();
	System.out.println();
	System.out.println("Y Values: ");
	for1: for(int x=0, y=0; x<100; x++) {
		
	
		     for2: for(;y<100;y++) {
		    	 if(y%10 == 0 || y == 0)
		    		 continue for1;
		    	 
		    	 System.out.println(y);
		     }
		    	 
		    	 
		    	 
	}
		    	 
}

}
