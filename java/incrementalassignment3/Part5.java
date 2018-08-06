class NewClass1{
    class InnerClass1{
        int n;
        InnerClass1(int k){
            this.n = k;
            System.out.println("Variable is "+ n);
        }
    }
}
class NewClass2 extends NewClass1{
    class InnerClass2 extends NewClass1.InnerClass1{

        InnerClass2(int n){
            super(n);
            System.out.println("Connstructor of Inner class 2.");
        }
    }
}
public class Part5{
    public static void main(String[] args){
        NewClass1.InnerClass1 obj1 = new NewClass1().new InnerClass1(5);
        NewClass2.InnerClass2 obj2 = new NewClass2().new InnerClass2(10);
    }
}