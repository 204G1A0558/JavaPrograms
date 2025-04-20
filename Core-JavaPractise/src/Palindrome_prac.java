import java.util.Scanner;

public class Palindrome_prac {
    public static void main(String[] args) {//if wnat to chek a number id=s apalindrome 121
        //rem=temp%10      temp =121   rem=121%10 ==>rem =1;
        //rev=rev*10+rem;==>re0*10=0 ==>rev=0
        //temp/=10     ==> 121/10=12 temp=12

        //rem=121%10====>12=rem
        //rev=1*10+2=   12      rev=12;
        //temp=12/10 =1

        //rem=1%0  rem=1;
        //re=12*10+1 ==121;
        //temp=1/10 =0
        //now n=temp it is a palindrome
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int temp,rev=0,rem;
        temp=n;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        if(n==rev){
            System.out.println("palindrome");
        }
        else System.out.println("not a palindrome");
    }
}
