public class Var_Args {
    static int sum(int ...arr){
        int res=0;
        for(int ele:arr){
            res+=ele;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,3,3,4,4));
        System.out.println(sum(21,43,5,5,6));

    }
}
