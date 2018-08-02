import java.util.Scanner;

public class Checker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(str);
        System.out.println(checkAlph(str));
    }
    private static boolean checkAlph(String str){
        if(str.length() < 26){
            return false;
        }
        str = str.toLowerCase();
        //System.out.println(str);
        for(char c = 'a'; c <= 'z'; c++){
            if(str.indexOf(c) < 0){
                return false;
            }
        }
        return true;
    }
}
