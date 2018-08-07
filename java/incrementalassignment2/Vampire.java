import java.util.Arrays;

public class Vampire {
    public static boolean checker(int n){
        String num = Integer.toString(n);
        int[] numArray = stringArrayToIntArray(num);
        Arrays.sort(numArray);
        for(int i = 2; i < (int)Math.sqrt(n); i++){
            if((i*(n/i) == n) && ((i % 10 != 0)||((n/i) % 10 != 0))){
                String str1 = ""+i;
                String str2 = ""+(n/i);
                if(str1.length() == str2.length()){
                    String str = i+""+(n/i);
                    int[] arr = stringArrayToIntArray(str);
                    Arrays.sort(arr);
                    if(Arrays.equals(numArray, arr)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private static int[] stringArrayToIntArray(String intString) {
        String[] intStringSplit = intString.split(""); //Split by spaces
        int[] result = new int[intStringSplit.length]; //Used to store our ints
        for (int i = 0; i < intStringSplit.length; i++) {
            //parse and store each value into int[] to be returned
            result[i] = Integer.parseInt(intStringSplit[i]);
        }
        return result;
    }
    public static void main(String[] args){

        int ctr = 1;
        int i = 1;
        while(ctr<101){
            String str = ""+i;
            if(str.length() % 2 == 0){
                if(checker(i)){
                    System.out.println(ctr+". " + i);
                    ctr++;
                }
            }
            i++;
        }
    }
}