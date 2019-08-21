//created by Fayed Raza
//programs made in order to prepare for the oca exam


import java.io.IOException;
//programs made in order to prepare for the oca exam
public class A {
   int re =1;
	public void getException () throws Exception{
		
		
		try {
			makeException();
		}catch(Exception e) {
			System.out.print("Exception was caught");
		}
		System.out.print("done");
	}
	
	public static void makeException() throws Exception {
		throw new MyException("Exception");
	}
	
	
	public static void main (String []args)
	{
		
		A d = new testrun();
		System.out.print(d.re);
		int i, j, k;
		i =j=k=9;
		
		
		 String myStr = "good";
	        char[] myCharArr = {'g', 'o', 'o', 'd' };
	        
	        String newStr = null;
	        for(char ch : myCharArr){
	            newStr = newStr + ch;
	        }

	        System.out.println(newStr);
	        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));
		
		
	        
	        String s = "h", i1 = "i";
	        System.out.println("hi" == ("h" + "i"));
	        
	        String[] x =  new String[2];
	        for(String nullprints: x)
	        	nullprints.concat("hi"); //throws exception
		
	}
	
	
	
	
	
}
class MyException extends Exception {
    public MyException(String msg){
        super(msg);
    }
}

class testrun extends A{
	int re=2;
	
	
}