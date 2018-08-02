import java.util.regex.*;
import java.util.Scanner;

public class RegexQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        String txt = input.nextLine();
        boolean first = Pattern.matches("^[A-Z].*", txt);
        boolean last = Pattern.matches(".*\\.$", txt);
        if(first && last){
            System.out.println("Yes it matches!!");
        }
        else{
            System.out.println("Sorry, not matched");
        }
    }
}
