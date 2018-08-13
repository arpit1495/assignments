class ConcreteClass{

}
interface Interface1{
    void method1();
    void method2();
}
interface Interface2{
    void method3();
    void method4();
}
interface Interface3{
    void method5();
    void method6();
}
interface Interface4 extends Interface1, Interface2, Interface3{
    void method7();
}
class NewClass extends ConcreteClass implements Interface4{
    public void method1(){
        System.out.println("This is a method of Interface1");
    }
    public void method2(){
        System.out.println("This is a method of Interface1");
    }
    public void method3(){
        System.out.println("This is a method of Interface2");
    }
    public void method4(){
        System.out.println("This is a method of Interface2");
    }
    public void method5(){
        System.out.println("This is a method of Interface3");
    }
    public void method6(){
        System.out.println("This is a method of Interface3");
    }
    public void method7(){
        System.out.println("This is a method of Interface4");
    }
    public void methodOne(Interface1 i){
        System.out.println("Interface1");
    }
    public void methodTwo(Interface2 i){
        System.out.println("Interface2");
    }
    public void methodThree(Interface3 i){
        System.out.println("Interface3");
    }
    public void methodFour(Interface4 i){
        System.out.println("Interface4");
    }
}
public class Part3{
    public static void main(String[] args){
        NewClass obj = new NewClass();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
        obj.method6();
        obj.method7();
        obj.methodOne(obj);
        obj.methodTwo(obj);
        obj.methodThree(obj);
        obj.methodFour(obj);
    }
}