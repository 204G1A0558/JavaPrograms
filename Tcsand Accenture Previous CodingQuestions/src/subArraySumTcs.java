import java.util.HashMap;
import java.util.Scanner;

public class subArraySumTcs {
    //Subarray Sum->Given An array and target ,print the elements or pairs that satisfy targte when it sum
    //1->BruteForce Approach:
    static void bruteforce(int arr[],int n,int target){
        for (int i=0;i<n;i++){
            int crsum=0;
            for(int j=i;j<n;j++){
                crsum +=arr[j];
                if(crsum==target) {
                    for (int k = 0; k <= j; k++) {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
    static void optimal(int arr[],int n,int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==target){
                for(int j=0;j<=i;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
            if (map.containsKey(sum-target)){
                int index=map.get(sum-target)+1;
                for(int k=index;k<=i;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();

            }
            map.put(sum,i);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        bruteforce(arr,n,target);
        //optimal(arr,n,target);

    }

}
