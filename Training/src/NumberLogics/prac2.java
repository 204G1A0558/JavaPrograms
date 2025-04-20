package NumberLogics;

public class prac2 {
    public static void main(String[] args) {
        int n=5,fact=1;
        double res;
        for(int i=1;i<=5;i++){
            fact*=i;
        }
        res=1.0/fact;
        System.out.println("1/n!="+res);
        //System.out.printf("1/n!=%f\n",res);
    }
}
