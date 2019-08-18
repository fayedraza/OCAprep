
public class test extends d{
public static void main (String [] args) {
	
	Integer i = new Integer(42);
	Long ln = new Long(42);
	Double d = new Double(42.0);

	System.out.print(i.equals(d));
	int x=3;
	test1:
		 while(x<3) {
			 if(x<3) {
				 System.out.print(123);
				 break test1;
			 }
		 }
	d testobject =  new e();
	testobject.get();
	
	
	char c =63;
	
	switch(c)
	{
	case 34:
		
	}
}
}
class d{
	d(){
		System.out.println("d works");
		get();
	}
	public void get() {
		System.out.println("d get() works");
	}
}
class e extends d{
	e(){
		System.out.println("e works");
	}
public void get() {
	System.out.println("e get() works");
	}
}