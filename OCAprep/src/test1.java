
public interface test1 {
  public void returnABC();
  
  public default void getr() {
	  
  }
  
  
  
}
class test2 implements test1{

	@Override
	public void returnABC() {
		// TODO Auto-generated method stub
		int re =2;
	}
	public static void main (String[] args) {
		test1 x =  new test2();
		x.returnABC();
		Integer  k = 12;
		
		
		
	}
@Override
	public void getr() {
		// TODO Auto-generated method stub
		
	}
}