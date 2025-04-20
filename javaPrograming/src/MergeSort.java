public class MergeSort {
    public static void main(String[] args) {
        int arr[]={3,5,1,4,6,2};
        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println();
        mergersort(arr,0,arr.length-1);
        System.out.println("After sorting:");
        for (int n:arr){
            System.out.print(n+" ");
        }
    }

    private static void mergersort(int[] arr, int l, int r) {
        if (l < r) {
            int mid =(l + r) / 2;
            mergersort(arr, l, mid);
            mergersort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1=mid-l+1;
        int n2=r-mid;
        int lArr[]=new int[n1];
        int rarr[]=new int[n2];
        for(int x=0;x<n1;x++){
            lArr[x]=arr[l+x];
        }
        for(int x=0;x<n2;x++){
            rarr[x]=arr[mid+1+x];
        }
        int i=0;
        int j=0;
        int k=l;
        while (i<n1 && j<n2){
            if(lArr[i]<=rarr[j]){
                arr[k]=lArr[i];
                i++;
            }
            else{
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k]=lArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rarr[j];
            j++;
            k++;
        }
    }
}
