import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter a file path you want to read");
        String str = input1.nextLine();
        //System.out.println(str);
        File file = new File(str);

        Scanner input = null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }
        //Hashmap is created for counting different character
        HashMap<Character, Integer> counter = new HashMap<>();

        int ctr = -1;//counter to count line break
        while (input.hasNextLine()) {
            ctr++;
            String line = input.nextLine();
            char[] ch = line.toCharArray();
            for(char ch1:ch){
                if(counter.containsKey(ch1)){//checks if key is present
                    counter.put(ch1,counter.get(ch1)+1);// add 1 to its value
                }
                else {
                    counter.put(ch1,1);//if key is not there, key is inserted and
                }
            }

        }
        input.close();
        PrintStream text;
        text = new PrintStream(new File("output.txt"));//Search for file with name output
        System.setOut(text);
        for (Character key : counter.keySet()) {
            System.out.println("occurrence of '" + key + "' is  "+ counter.get(key));
        }
        System.out.println("occurrence of line break is " +ctr);
    }
}
