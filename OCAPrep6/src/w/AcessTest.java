package w;

public class AcessTest{
	   String a = "x";
	   static char b = 'x';
	   String  c = "x";
	   class Inner{
	      String  a = "y";
	      String  get(){
	         String c = "temp";
	         c = ""+AcessTest.b;
	         return c;
	      }
	   }

	   AcessTest() { 
	     System.out.println(  new Inner().get()  ); 
	   }

	

	    
	   
	   
	   
	   public static void main(String args[]) {  
		  
	   
	   }}

//rule string = "" + char a;