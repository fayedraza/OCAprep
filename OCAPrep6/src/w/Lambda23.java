package w;

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
