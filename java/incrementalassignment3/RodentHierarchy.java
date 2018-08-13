abstract class Rodent {
    public Rodent(){
        System.out.println("Rodent created");
    }
    public abstract void move();
    public abstract void eat();
}

class Mouse extends Rodent {
    public Mouse(){
        System.out.println("Mouse created");
    }
    public void move(){
        System.out.println("mouse runs");
    }
    public void eat(){
        System.out.println("mouse eats worms");
    }
}

class Gerbil extends Rodent {
    public Gerbil(){
        System.out.println("Gerbil created");
    }
    public void move(){
        System.out.println("runs with slow pace");
    }
    public void eat(){
        System.out.println("gerbil eats mouse");
    }
}
class Hamster extends Rodent {
    public Hamster(){
        System.out.println("Hamster created");
    }
    public void move(){
        System.out.println("hamster runs very fast");
    }
    public void eat(){
        System.out.println("hamster eats snakes");
    }
}
public class Test {
    public static void main(String args[]){
        Rodent rod[] = new Rodent[3];
        rod[0] = new Mouse();
        rod[1] = new Gerbil();
        rod[2] = new Hamster();
        rod[0].move();
        rod[0].eat();
        rod[1].move();
        rod[1].eat();
        rod[2].move();
        rod[2].eat();
    }
}