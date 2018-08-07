import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Range {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] strArray = new String[n];
        Scanner input1 = new Scanner(System.in);
        for(int i = 0; i < n ; i++){
            strArray[i] = input1.nextLine();
        }
        for(int i = 0; i < n; i++){
            System.out.println(checker(strArray[i]));
        }
    }
    public static String checker(String str) {
        try {
            String[] strArray = str.split(" ");
            SimpleDateFormat seq = new SimpleDateFormat("dd-MM-yyyy");
            Date signUp = seq.parse(strArray[0]);
            Date current = seq.parse(strArray[1]);
            Calendar s = Calendar.getInstance();
            s.setTime(signUp);
            Calendar c = Calendar.getInstance();
            c.setTime(current);
            int currYear = c.get(Calendar.YEAR);
            int signYear = s.get(Calendar.YEAR);
            if (signYear < currYear) {
                s.set(Calendar.YEAR, currYear);
                signUp = s.getTime();
            } else {
                return ("No range");
            }
            Date start, end;
            s.add(Calendar.DAY_OF_MONTH, 30);
            end = s.getTime();
            s.setTime(signUp);
            s.add(Calendar.DAY_OF_MONTH, -30);
            start = s.getTime();
            if (current.before(start)) {
                if (currYear == (signYear + 1)) {
                    return ("No range");
                }
                s.setTime(signUp);
                s.set(Calendar.YEAR, currYear - 1);
                signUp = s.getTime();
                s.add(Calendar.DAY_OF_MONTH, 30);
                end = s.getTime();
                s.setTime(signUp);
                s.add(Calendar.DAY_OF_MONTH, -30);
                start = s.getTime();
                return (seq.format(start) + " " + seq.format(end));

            }
            boolean ctr = ((current.after(start)) && (current.before(end)));
            if (ctr) {
                return (seq.format(start) + " " + seq.format(current));
            } else {
                return (seq.format(start) + " " + seq.format(end));
            }
        }
        catch (Exception e){
            return("No range");
        }
    }

}