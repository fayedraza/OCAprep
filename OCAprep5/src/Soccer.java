class Game{
  public void play() throws Exception{
    System.out.println("Playing...");
  }
}

public class Soccer extends Game{
   public void play(){
      System.out.println("Playing Soccer...");      
   }
   public static void main(String[] args) throws Exception {
	Integer x =10;
	double xe=10;
	System.out.print(x==xe);
	
}
}