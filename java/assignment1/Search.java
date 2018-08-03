import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search {
    private static void filefinder(String str){
        File dir = new File("/home/lenovo/");//home directory on my system
        File[] list = dir.listFiles();
        boolean check;
        int ctr = 0;
        for (File f : list) {
            String fileName = f.getName();
            //System.out.println(fileName);
            Pattern pat = Pattern.compile(str);
            Matcher mat = pat.matcher(fileName);
            check = mat.matches();
            if(check){
                System.out.println(f.getAbsolutePath());
                ctr++;
            }
        }
        System.out.println("Found "+ctr+" files");
    }
    public static void main(String[] args) {
        boolean ctr = true;
        while(ctr) {
            System.out.println("Enter a regex pattern");
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            //System.out.println(str.length());

            if (str.length() == 0) {
                //System.out.println("Hello");
                ctr = false;
            }
            else{
                filefinder(str);
            }
        }
    }

}