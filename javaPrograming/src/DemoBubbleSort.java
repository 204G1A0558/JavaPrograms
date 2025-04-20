public class DemoBubbleSort {
    public static void main(String[] args) {
        int nums[]={6,5,2,8,9,4};
        int size= nums.length;
        int temp=0;
        System.out.print("Elements before sorting:");
        for(int num:nums){
            System.out.print(num+" ");
        }
        for(int i=0;i<size;i++){
            //to over come the speed in excution we can use that
            // onlyiterate the remainng values instead if all by adding size-i-1
            for(int j=0;j<size-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            //we can peiinr the iteration how it swaps like;
            System.out.println();
            for(int num:nums){
                System.out.print(num+" ");
            }
        }
        System.out.println(" ");
        System.out.print("elemennts after sorting:");
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
