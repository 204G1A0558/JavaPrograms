public class Even_arr {
    public static int[] even_num(int []n){
        for(int i=0;i<n.length;i++){
            if(n[i]%2==0){
                return new int[]{i};
            }
        }
        return new int[]{};

    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<= nums.length;i++){
            if(nums[i]!=0){
            System.out.println(nums[i]);
        }}
        //even_num(n);
        //System.out.print(even_num(n))
    }
}
