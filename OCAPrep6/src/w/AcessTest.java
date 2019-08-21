//created by Fayed Raza
//programs made in order to prepare for the oca exam
package w;
//programs made in order to prepare for the oca exam

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