import java.util.Arrays;

public class ArrayRev {
    public static void main(String[] args) {
        int arr[]={5,9,2,6,8,3};
        int n= arr.length;
        for(int i=0;i<n/2;i++){
            int temp;
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
