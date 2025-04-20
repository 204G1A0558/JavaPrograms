import java.io.*;

public class serializabkeDemo {
    public static void main(String[] args) throws IOException ,ClassNotFoundException{
        save obj=new save();
        obj.i=4;
        File f=new File("obj.txt");
        FileOutputStream fos=new FileOutputStream(f);
        DataOutputStream dos=new DataOutputStream(fos);
        //dos.write(obj);
        FileInputStream fis=new FileInputStream(f);
        DataInputStream dis=new DataInputStream(fis);

    }
}
class  save implements Serializable {
    int i;
}
