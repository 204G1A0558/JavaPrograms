package Strings;

public class Prac5 {
    static void mib(char ch[],int l,int r){
        if(l==r){
            for(int i=0;i<=r;i++)
                System.out.println(ch[i]);
            System.out.println("\n");
            return;
        }
        for(int i=l;i<=r;i++){
            if(l!=r){
                char c= ch[i];
                ch[i]=ch[l];
                ch[l]=c;
            }
        }
    }
    public static void main(String[] args) {
        char []ch={'m','i','b'};
        mib(ch,0, ch.length-1);
        //mib(ch,8, ch.length-1);
        }
    }

