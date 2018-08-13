import java.util.regex.*;
import java.util.Scanner;

public class RegexQ {
    public static boolean checker(String txt){
        //method will check for Capital letter at the start and period at the end
        boolean first = Pattern.matches("^[A-Z].*\\.$", txt);
        //boolean last = Pattern.matches(".*\\.$", txt);
        return(first);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        String txt = input.nextLine();
        boolean ctr = checker(txt);
        if(ctr){
            System.out.println("Yes it matches!!");
        }
        else{
            System.out.println("Sorry, not matched");
        }
    }
}
