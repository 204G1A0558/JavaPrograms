import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 st number:");
        int a= sc.nextInt();
        System.out.println("enter 2nd number:");
        int b= sc.nextInt();
        if(a>18){
            System.out.println("He is eligible for vote");
        }
        else if(b<18){
            System.out.println("He is minor");
        }
    }
}
