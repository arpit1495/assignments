import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/home/lenovo/Documents/assignments/java/incrementalassignment7/test.txt");
        Scanner input = new Scanner(file);
        HashMap<Character, Integer> counter = new HashMap<>();
        int ctr = -1;
        while (input.hasNextLine()) {
            ctr++;
            String line = input.nextLine();
            char[] ch = line.toCharArray();
            for(char ch1:ch){
                if(counter.containsKey(ch1)){
                    counter.put(ch1,counter.get(ch1)+1);
                }
                else {
                    counter.put(ch1,1);
                }
            }

        }
        input.close();
        PrintStream text = null;
        try {
            text = new PrintStream(new File("output.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(text);
        for (Character key : counter.keySet()) {
            System.out.println("occurrence of '" + key + "' is  "+ counter.get(key));
        }
        System.out.println(ctr);



    }
}
