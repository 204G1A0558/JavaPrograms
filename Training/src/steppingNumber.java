import java.util.LinkedList;
import java.util.Queue;

public class steppingNumber {
    public static void displayStepNum(int n,int m){
        Queue que=new LinkedList<>();
        for(int i=1;i<=9;i++){
            que.add(i);
        }
        while(!que.isEmpty()){
            int stepnum=(int)que.poll();
            if (stepnum>=n && stepnum<=m){
            System.out.println(stepnum+" ");
            }
            if(stepnum==0||stepnum>m) {
                continue;
            }
            int lastDigit=stepnum%10;
            int stepNumA=stepnum*10+(lastDigit-1);
            int stepNumB=stepnum*10+(lastDigit+1);
            if(lastDigit==0){
                que.add(stepNumB);
            }else{
                que.add(stepNumA);
                que.add(stepNumB);
            }
        }
    }

    public static void main(String[] args) {
        int n=0,m=100;
        System.out.println("stepping numbers between"+n+"and"+m+" : ");
        displayStepNum(n,m);
    }
}
