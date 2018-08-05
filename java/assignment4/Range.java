import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Range {
    public static void main(String[] args) throws ParseException {
        /*
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //String[] strArray = new String[n];
        for(int i = 0; i < n ; i++){
            String str = input.nextLine();
            //checker(str);

        }*/
        checker("16-07-1998 27-06-2017");
        checker("04-02-2016 04-04-2017");
        checker("04-05-2017 04-04-2017");
        checker("04-04-2015 04-04-2016");
        checker("04-04-2015 15-03-2016");
        /*



        04-04-2015 15-03-2016
        */
        //System.out.println("\n"+strArray[4]);
    }
    public static void checker(String str) throws ParseException {
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
        //System.out.println(signUp);
        //System.out.println(currYear);
        //System.out.println(signYear);
        if(signYear < currYear){
            s.set(Calendar.YEAR, currYear);
            signUp = s.getTime();
        }
        else{
            System.out.println("No range");
            return;
        }

        //System.out.println(signUp);
        Date start, end;
        s.add(Calendar.DAY_OF_MONTH, 30);
        end = s.getTime();
        s.setTime(signUp);
        s.add(Calendar.DAY_OF_MONTH, -30);
        start = s.getTime();
        boolean ctr = ((current.after(start))&&(current.before(end)));
        if(ctr){
            System.out.println(seq.format(start) + " " + seq.format(current));
        }
        else{
            System.out.println(seq.format(start) + " " + seq.format(end));
        }


    }
}
