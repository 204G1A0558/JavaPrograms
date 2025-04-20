import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array_even_odd_sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the soize of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the "+n+" of aray lements:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("arrays elemnts are"+ Arrays.toString(arr));
        int sum=0 ,odd_sum=0;
        System.out.print("sum of all even sum:");
        System.out.print("\nsum of al oodd sums:");
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                if(sum>0){
                    System.out.print(" + "+arr[i]);
                }else {
                    System.out.print(arr[i]);
                }
                sum+=arr[i];
        }
            else {
                if(odd_sum<0){
                    System.out.print(" + "+arr[i]);
                }
                else {
                    System.out.print(arr[i]);
                }
                odd_sum+=arr[i];

            }
        }

        System.out.print("sum of even numbers in an array"+sum);
        System.out.print("sum of odd numbers:"+odd_sum);
    }
}
