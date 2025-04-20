package Day1;

public class Main
{
    static void str(int j,int i){//start
        if(j<i){//stp
            System.out.print("*");
            str(j+1,i);//uupdate
        }
        System.out.print("*");
        return;
    }
    static void spc(int j,int i,int n){
        if(j<n-1-i){
            System.out.print(" ");
            spc(j+1,i,n);
        }
        //System.out.print(" ");
        return;
    }
    static void  pat(int i,int n){
        if(i<n){
            spc(0,i,n);
            str(0,i);
            System.out.print("\n");
            pat(i+1,n);
        }
        spc(0,i,n);
        str(0,i);
        System.out.print("\n");
        return;
    }
    public static void main(String[] args) {

        int n=10;
        pat(0,n);
        //spc();
    }
}