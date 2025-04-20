import java.util.Scanner;

public class prac_5 {
    public static void main(String[] args) {
        //fibnocii

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int sec = 1;
        int i = 1;
        //for(int i=1;i<=n;i++){
        System.out.println("fibnocuii is:");
        while (i <= n) {


            System.out.print(first + " ");
            int next = first + sec;
            first = sec;
            sec = next;
            i++;
        }
    }

    }
//}

