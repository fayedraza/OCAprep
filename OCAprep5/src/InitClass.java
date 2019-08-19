//created by Fayed Raza
//programs made in order to prepare for the oca exam


public class InitClass{
   public static void main(String args[ ] ){
	   int i = 5;
	      float f = 5.5f;
	      double d = 3.8;
	      char c = 'a';
	      if (i == f) c++;
	      if (((int) (f + d)) == ((int) f + (int) d)) c += 2;
	      System.out.println(c);
   }
   int m;
   static int i1 = 5;
   static int i2 ;
   int  j = 100;
   int x;
   public InitClass(int m){
      System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m);
   }
  { j = 30; i2 = 40; }  // Instance Initializer
   static { i1++; }      // Static Initializer
}