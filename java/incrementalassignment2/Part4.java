public class Part4 {
    public Part4(String str){
        System.out.println(str);
    }
    public static void main(String args[]){
        Part4[] arr = {new Part4("hello"), new Part4("world")};
        //Now the constructor will print message this time
    }
}
