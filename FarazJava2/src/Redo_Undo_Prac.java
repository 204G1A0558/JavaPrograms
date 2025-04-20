// to take input from user
import java.util.Scanner;

// Stack is to implement the undo functionalities
import java.util.Stack;

public class Redo_Undo_Prac {
    //declare private variabe as ,AND stack<String> is generic class of java
    // which is use to store the elements in to stack by LIFO
    private static Stack<String> as=new Stack<>();
    public static void performance(String action){
        System.out.println("performing actio"+action);
        //adds the "action" parameters to "as(obj)" using push method
        as.push(action);
    }
    //method for undoing the last action performed by the user
    public static void undoAcion(){
        //cheks weather the "as(obj)" is emty by this method
        if(as.isEmpty()){
            System.out.println("no action is performed");
            return;
        }
        //pop up teh last action from "as(objt)"  and stores in last action
        String lastAction =as.pop();
        System.out.println("undoing action"+lastAction);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //infinte loop it will continue till the program reach to exit condition
        while(true){
            System.out.println("Do u ant to perform any action");
            String input =sc.nextLine().toLowerCase();
            if(input.equals("yes")){
                System.out.println("entr the action is perfirmd");
                String action=sc.nextLine();
                performance(action);
            }
            else if(input.equals("no")){
                System.out.println("exit the program");
                break;

            }else if(input.equals("undo")){
                undoAcion();
            }else{
                System.out.println("incalid input");
            }
        }
        sc.close();
    }
}

//OVER ALL CODE CREATES A SIMPLE COMMAND LINE INTERFACE
// WHERE USE CAM PERFORM ACTIONS LIKE UNDO LAST ACTION OR EXIT THE PROGRAM
