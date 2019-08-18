import java.io.IOException;
import java.util.Random;

import javax.imageio.IIOException;
//created by Fayed Raza
//programs made in order to prepare for the oca exam
 class i {
	 public void switchTest(byte x){
		   switch(x){
		      case 'b':   // 1
		      default :   // 2
		      case -2:    // 3
		      case 80:    // 4
		   }
		}
	 
	 public int luckyNumber(int seed){
	      if(seed > 10) return seed%10;
	         int x = 0;
	            try{
	               if(seed%2 == 0) throw new IOException();
	               else return x;
	            }
	            catch(Exception e){
	               return 3;
	            }
	            finally{
	               return 7;
	            }
	         }

	        public static void main(String args[]){
	        	
	       
	        for(int x=0; x<4;x++) {
	        		//for(int y=0;y<4;y++) {
	        		if(x==3) {
	        			
	        			break;
	        		}
	        		//}
	        	
	        		System.out.print(x++);
	        		
	        	}
	        	
	           int amount = 100, seed = 6;
	           switch( new i().luckyNumber(6) ){
	               case 3: amount = amount * 2;
	               case 7: amount = amount * 2;
	               case 6: amount = amount + amount;
	               default :
	           }
	          System.out.println(amount);
	       }
}
