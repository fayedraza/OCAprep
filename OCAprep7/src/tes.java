


class f{
	String s = "";
	 f(){
		 s+="a";
	 }
}






class e extends f{
	 e(){
		 s+="b";
	 }
}


public class tes extends e {
	tes(){
		 s+="c";
	 }
	
	public static void main (String[]args) {
	  System.out.print(new tes().s);
	
	}
}
