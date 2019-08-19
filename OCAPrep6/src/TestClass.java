//created by Fayed Raza
//programs made in order to prepare for the oca exam
import java.io.FileNotFoundException;

public class TestClass {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            doTest();
        }
        catch(MyException me){  //does not catch runtime exceptions
            System.out.println(me);
        }
    }
    
    static void doTest() throws MyException, FileNotFoundException{
        int[] array = new int[10];
        throw new FileNotFoundException();
    }
    
    static void doAnotherTest() throws MyException{
        throw new MyException("Exception from doAnotherTest");
    }
}
class MyException extends Exception {
    public MyException(String msg){
     super(msg);
    }
}