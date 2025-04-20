package ThrowsKeyWord;

import java.util.Scanner;

class ToOldException extends RuntimeException{
    ToOldException(String msg){
        super(msg);
        //mainly used to display the description written in the main and super class patent class runtime an
        // which child of throwable and then it easily display by the PrintStackTrace method which is called to
        // print the exception
    }

}
class ToYoungExcepetion extends RuntimeException{
    ToYoungExcepetion(String msg){
        super(msg);
    }
}

public class OwnException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int age=sc.nextInt();

        if(age>60){
            throw new ToOldException("you are not eligible too old");
        }
        else if(age<18)
        {
            throw new ToYoungExcepetion("you are too young not to marry at this age wait");
        }
        else {
            System.out.println("Thank you you can get good match here");
        }
    }
}
