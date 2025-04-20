import java.util.Scanner;

public class MarksPercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks Scored in SSC by Fasiha");
        System.out.print("enter marks in telugu:");
        int sub1= sc.nextInt();
        System.out.print("enter marks in hindi:");
        int sub2= sc.nextInt();
        System.out.print("enter marks in english:");
        int sub3= sc.nextInt();
        System.out.print("enter marks in maths:");
        int sub4 = sc.nextInt();
        System.out.print("enter marks in science:");
        int sub5= sc.nextInt();
        System.out.print("enter marks in social:");
        int sub6= sc.nextInt();
        int total=600;
        float p=9.5f;
        //int sum=557;
        int sum=sub1+sub2+sub3+sub4+sub5+sub6;
        System.out.println("Total Marks Obtained:"+sum);
        float  percentage=(float)sum/total*100;
        System.out.println("percentage of SSC:"+percentage+"%");
       // float cgpa=percentage/p;
        float cgpa=(float)(sub1+sub2+sub3+sub4+sub5+sub6)/60;
        System.out.println("Total CGPA of Fasiha in SSC is:"+cgpa);
    }

}
