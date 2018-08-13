import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Checker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(str);
        System.out.println(checkAlph(str));
    }
    public static boolean checkAlph(String str){
        //check if input string contains all alphabets
        if(str.length() < 26){
            return false;
        }
        str = str.toLowerCase();
        //System.out.println(str);
//        for(char c = 'a'; c <= 'z'; c++){
//            if(str.indexOf(c) < 0){
//                return false;
//            }
//        }

        Map<Character,Boolean> map = new HashMap<>();
        for(char c:str.toCharArray()){
            if(Character.isAlphabetic(c)){//checks c is alphabet
                if(map.size()==26){//map will only have alphabets as key
                    return true;
                }else{
                    map.put(c,true);
                }
            }
        }
        if(map.size() == 26){
            return true;
        }else {
            return false;
        }
    }
}
/* time complexity is linear
space time complexity is also linear
 */