import java.util.Scanner;

class MyException1 extends Exception{
    public MyException1(String str){
        super(str);
    }
}

class MyException2 extends Exception{
    public MyException2(String str){
        super(str);
    }
}

class MyException3 extends Exception{
    public MyException3(String str){
        super(str);
    }
}

public class ErrorHandling {
    private String id = null;
    private void errorMethod(int n) throws MyException1, MyException2, MyException3
    {
        //this method throws all three exceptions
        if(n > 500){
            throw new MyException1("Exception-1");
        }
        else if (n>100){
            throw new MyException2("Exception-2");
        }
        else{
            throw new MyException3("Exception-3");
        }
    }

    public String getId() {
        return this.id;
    }

    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ErrorHandling err = new ErrorHandling();
        //System.out.println(err.getId().length());
        try{
            //System.out.println(err.getId().length());//this statement was creating a null point exception
            err.errorMethod(n);

        }
        catch (MyException1|MyException2|MyException3|NullPointerException ex){
            System.out.println(ex.getMessage());
        }
        /*
        finally is working if the error inside the try block
        it is working if null point exception occurs inside try block
         */
        finally {
            System.out.println("finally clause is executed");
        }
    }
}
