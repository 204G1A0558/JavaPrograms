import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    public  int compareTo(Student st){
        if(age==st.age)
            return 0;
        if(age> st.age)
            return 1;
        else
            return -1;
    }
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(1,"rahul",32));
        al.add(new Student(18,"virat",34));
        al.add(new Student(45,"rohit",34));
        al.add(new Student(12,"prithvi",24));
        al.add(new Student(15,"shubman",27));
        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
