class Animal{
    void sound(){
        System.out.println("animal sounding");
    }
}
class dog extends Animal{
    void sound(){
        System.out.println("dog barking");
    }
}


public class Poly_morp {
    public static void main(String[] args) {
        Animal al = new Animal();
        al.sound();
        al.sound();
    }
}
