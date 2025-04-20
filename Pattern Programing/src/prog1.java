import java.util.*;
public class prog1 {
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if((i*j)<10){
//                    System.out.print(0);
//                }
//                System.out.print(i*j+" ");
//            }
//            System.out.println();
//        }
//
//
//
//    }

//revverse and arraya roraion:

//    static void rev(int a[],int start,int end){
//        //int start=0;
//        //int end=a.length-1;
//
//        while(start<end){
//            int temp=a[start];
//            a[start]=a[end];
//            a[end]=temp;
//            start++;
//            end--;
//        }
//    }
//    public static void rotateArray(int[]a, int rotations) {
//        int n= a.length;
//        rotations = rotations % n;
//        int[] temp = new int[n];
//        for (int i = 0; i <n; i++) {
//            temp[(i + n - rotations) % n] = a[i];
//        }
//        for (int i = 0; i < n; i++) {
//            a[i] = temp[i];
//        }
//        rev(a,0,rotations-1);
//        rev(a,rotations-1,n-1);
//        rev(a,0,n-1);
//    }
//
//    public static void main(String args[]){
//        int a[]={2,4,5,6,7,8,9};
//        rotateArray(a, 3);
//        System.out.println("reversed array:");
//        for(int x:a){
//            System.out.print(x+ " ");
//        }
//    }


    public static void main(String[] args) {
        char a[]={'a','s','y','p','r','a','n','i','t','g'};
        char s[] = new char[8];
        System.arraycopy(a,3,s,0,5);
        System.out.println(Arrays.toString(s));
    }
}
