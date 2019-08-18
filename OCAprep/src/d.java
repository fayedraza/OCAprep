//created by Fayed Raza
//programs made in order to prepare for the oca exam


public abstract class d {
	final  static int re=3;
	
   public abstract void getr();
}
class f extends d{

	@Override
	public void getr() {
		System.out.print("r");
		
	}
	public static void main (String [] args) {
		d object =  new f();
		object.getr();
		int x=re;
	}
}