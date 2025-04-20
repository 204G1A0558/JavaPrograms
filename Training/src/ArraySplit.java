import java.util.Arrays;

public class ArraySplit {
    public static void main(String[] args) {
        int arr[]={5,9,2,6,8,3};
        int n= arr.length;
        //for(int i=0;i<n/2;i++){
           int c=0,d=0;
           int forus=n/2;
           int forhim=n-n/2;
           int arr1[]=new int [forus];
           int arr2[]=new int [forhim];
           for(int i=0;i<n;i++){
               if(arr[i]==6) continue;
               if(i%2==0) arr1[c++]=arr[i];
               else arr2[d++]=arr[i];
    }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
