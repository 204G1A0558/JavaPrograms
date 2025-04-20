import java.util.Scanner;
public class Switch_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        switch(age){
            case 18:
                System.out.println("you are eligibe to exam");
                break;
            case 45:
                System.out.println("this may be the last chance for u to take part in exam");
                break;
            case 65:
                System.out.println("ypu are sought to be retire ");
                break;
            default:
                System.out.println("Can easily apply or appear for exam");
        }
        int b=0;
//        while (i<=200){
//            System.out.println(i);
//            i++;
//        }
//        do{
//            System.out.println(b);
//            b++;
//        }
//        while(b<5);
//        for(int i=5;i>0;i--){
//            System.out.println(i);
//        }
//        for (int i=4;i>=0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("*");
//            System.out.print("\n");
//        }55
        int i=1,n=5;
        int fact=1;
        while(i<=n)
        {
            fact *=i;
            i++;
        }
        System.out.println(fact);
    }
}
