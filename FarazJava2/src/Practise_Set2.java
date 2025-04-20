public class Practise_Set2 {
    public static void main(String[] args) {
        //PRINTING THE PATTERNS
//        int n=4;
//        for(int i=n;i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        //SUM OF FIRST EVEN NUMBER
//        int n=6;
//        //int b=2*i;
//        int sum=0;
//        for(int i=0;i<n;i++){
//            sum=sum+(2*i);
//        }
//        System.out.println(sum);
        //MULTIPLICATION TALE OF 5
//        int n=5;
//        for(int i=0;i<=10;i++)
//        {
//            System.out.printf("%d x %d=%d\n",n,i,n*i);
//        }
        //MUL IN REVERSE ORDER
//        int n=5;
//        for(int i=10;i>=0;i--)
//        {
//            System.out.printf("%d x %d=%d\n",n,i,n*i);
//        }
        //FACTORIAL OF NUMBER
//        int n=5;
//        int i=1;
//        int fact=1;
//        //for(int i=1;i<=n;i++){
//        while(i<=n){
//            fact=fact*i;
//            i++;
//        }
//        System.out.println(fact);
        //SUM OF numbers of multiplied by 8  =>>8+16+24+..+80
        int n=8;
        int sum=0;
        for(int i=0;i<=10;i++)
        {
            sum +=n*i;
        }
        System.out.println(sum);
    }
}
