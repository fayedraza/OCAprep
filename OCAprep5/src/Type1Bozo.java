
public class Type1Bozo extends d implements Bozo {
	
          Type1Bozo(){
            //type = 1;
         }

         public void jump(){
            System.out.println("jumping..."+type);
         }

         public static void main(String[] args){
            Bozo b = new Type1Bozo();
            b.jump();
            System.out.print(type);
         }
}
class d{
	 d() {
		
	}
}