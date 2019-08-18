//in file /root/com/bar/Y.java
package com.bar;

 class s{
	int d=0;

	public void change(int i) {
	
		
	}
}



public class Y extends 	s{
	int d =100;
	 public void change(int x) {
		d+=x;
	}
    public static void main(String[] args){
s e = new Y();
e.change(10);

System.out.println(e);

    }
}
