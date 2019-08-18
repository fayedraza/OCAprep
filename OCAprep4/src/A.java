
public class A{
	 
  public static void main(String[] args){
           B d =  new C();
         
           
           System.out.print(d instanceof B);
           
  }   
    private final   void changenum( ) {
    	
    	System.out.print(12);
    }
}

class B {
public void changenum( ) {
    	
    	System.out.print(1);
    }
	
	
	
	
	
}

class C extends B{
	
	
	
	
	
	
}
