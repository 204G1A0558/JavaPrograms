public class Recursion2 {
    static void far(int n) {
        if (n < 3) {
            System.out.print(n+"\t");
            far(n+1);
        }
        System.out.print(n+"\t");
    }

    public static void main(String[] args) {


//       for(int i=0;i<3;i++)
//           System.out.print(i+"\t");
//       for(int j=5-1;j>=0;j--)
           //System.out.print(j+"\t");
       /*
        not to use not more than one conditional statment
        not more than one operator(-- or,--or,+,or,-)
        not to use zero for initialize (i=0)
        except 1 and nth mnumber cannot use any number
         */
        System.out.println("program stats");
        far(0);
        System.out.print("program ends");

    }
}





