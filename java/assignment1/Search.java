import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search {
    public static String[] checker(String str){
        int n = fileFinder(str);
        String[] arr = new String[n];
        File dir = new File("/home/lenovo/");//home directory on my system
        File[] list = dir.listFiles();//all files present in directory
        boolean check;
        int ctr = 0;
        for (File f : list) {
            String fileName = f.getName();//getting file name as string for comparsion using regex
            Pattern pat = Pattern.compile(str);
            Matcher mat = pat.matcher(fileName);
            check = mat.matches();
            if(check){
                arr[ctr] = f.getAbsolutePath();
                ctr++;
            }
        }
        return arr;

    }
    public static int fileFinder(String str){
        File dir = new File("/home/lenovo/");//home directory on my system
        File[] list = dir.listFiles();//all files present in directory
        boolean check;
        int ctr = 0;
        for (File f : list) {
            String fileName = f.getName();//getting file name as string for comparsion using regex
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
        return ctr;
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
                fileFinder(str);
            }
        }
    }

}