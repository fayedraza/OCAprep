//created by Fayed Raza
//programs made in order to prepare for the oca exam
class h extends Exception{}



class A{
   static  String value = "test";
  protected  A(String val){
        this.value = val;
    }
    
    static void r(double d) {
	System.out.print(123);
    	
    }
}
 class TestClass extends A {
    TestClass(String val) {
		super(val);
		// TODO Auto-generated constructor stub
	}
    public void getd() throws h{
    	
    }

    
    public int out1() {
		return 0;
    	
    }
    
    
    public int out2() {
		return 0;
    	
    }
    static int max(int x, int y){
        if (x > y)  return x;
        return y;
  }
	public static void main(String[] args) {
		int i = 10;
		System.out.println(max(3,1));
    }
}

