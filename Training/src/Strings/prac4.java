package Strings;

import java.util.Arrays;

public class prac4 {
    public static void main(String[] args) {
        int l[]={5,9,10,12};
        int r[]={7,8,13,15,16};
        int n1=l.length;
        int n2=r.length;
        int res[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1&&j<n2) {
            if (l[i] < r[j]) {
                res[k]=l[i];
                i++;
                k++;
            }
            else {
                res[k] = r[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            res[k]=l[i];
            i++;
            k++;
        }
        while(j<n2){
            res[k]=r[j];
            j++;k++;
        }
        System.out.println(Arrays.toString(res));
    }
}
