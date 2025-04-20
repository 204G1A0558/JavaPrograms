import java.util.Arrays;
import java.util.Scanner;

public class even_Num_Count {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size for array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter the "+n+" elemts of arrays:");
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();
        System.out.println("array numbers are:"+ Arrays.toString(arr));
        int counteven=0,oddcount=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                counteven++;
            }else oddcount++;
        }
        System.out.println("even numbers:"+counteven);
        System.out.println("odd count:"+oddcount);

    }
}
