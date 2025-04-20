package ThrowsKeyWord;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//public class Test1 extends RuntimeException{
public class Test1{

    //static ArithmeticException e = new ArithmeticException();
    //static ArithmeticException e;

    public static void main(String[] args) {
        /*The belo two statments gives compile time error
        PrintWriter pw = new PrintWriter("abc.txt");
        Thread.sleep(1000);
       */
        System.out.println("hello");
        //throw  new Test1();
    }

}
