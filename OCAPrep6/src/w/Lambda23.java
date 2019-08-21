//created by Fayed Raza
//programs made in order to prepare for the oca exam
package w;
//programs made in order to prepare for the oca exam

import java.util.Comparator;

public class Lambda23 {
      
	public static void main (String [] args) {
		
	
		sd e = (int y, int z) ->{ if(y<z)
			return z;
			else 
				return y;

		};
		
		int x= e.geth(2,3);
		System.out.print(x);
		
		
	}
}
