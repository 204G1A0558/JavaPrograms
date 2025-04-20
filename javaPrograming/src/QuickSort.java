public class QuickSort {
    public static void main(String[] args) {
        //as quick sort goes for the recursion so we should create a function and solve it
        int arr[]={5,6,2,3,1,8,4};
        quickSort(arr,0,arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low<high){
            int pivot=partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pi=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pi){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }

}
