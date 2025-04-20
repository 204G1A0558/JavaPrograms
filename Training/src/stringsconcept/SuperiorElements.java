package stringsconcept;

import java.util.Scanner;

public class SuperiorElements {
    static int superiorCount(int[]arr,int n){
        int count=0;
        int maxEle=arr[n-1];
        for(int i=n-1;i>=0;i--){
            if(arr[i]>maxEle){
                maxEle=arr[i];
            }
            if(arr[i]>=maxEle){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int res=superiorCount(arr,n);
        System.out.println(res);
        sc.close();
    }
}







