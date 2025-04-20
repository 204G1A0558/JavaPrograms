import java.util.Arrays;

public class arrayCount {
    public int longestConsecutive(int[] nums){
        Arrays.sort(nums);
        int n= nums.length;
        int count=1;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            else if (nums[i]-nums[i+1]==-1){
                count++;
                res=Math.max(res,count);
            }
            else {
                count=1;
            }
        }
        res=Math.max(res,count);
        if(res==Integer.max(res,count)||n==0){
            return 0;
        }
        return res;
    }

    public static void main(String[] args) {
        String s;
        //s.lowe
    }
}
