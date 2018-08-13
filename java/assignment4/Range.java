import java.text.ParseException;
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
        //will give the range of dates as output
        try {
            String[] strArray = str.split(" ");//splitting the entered date
            SimpleDateFormat seq = new SimpleDateFormat("dd-MM-yyyy");//assigning a format of date
            Date signUp = seq.parse(strArray[0]);//parsing date
            Date current = seq.parse(strArray[1]);//parsing date
            Calendar s = Calendar.getInstance();//instance of calender
            s.setTime(signUp);
            Calendar c = Calendar.getInstance();//instance of callender
            c.setTime(current);
            int currYear = c.get(Calendar.YEAR);//Current year as integer
            int signYear = s.get(Calendar.YEAR);//Signup year as integer
            if (signYear < currYear) {//checking current year is greater than signup
                s.set(Calendar.YEAR, currYear);//selling signup callender instance to current year to know aniversary
                signUp = s.getTime();//updating signup to aniversary date
            } else {//current year is less than signup, then no range
                return ("No range");
            }
            Date start, end;//declaring date instances,which will be used for range
            s.add(Calendar.DAY_OF_MONTH, 30);//adding 30 days to aniversary date
            end = s.getTime();//setting end as aniversary date +30 days
            s.setTime(signUp);//updating signup instance again
            s.add(Calendar.DAY_OF_MONTH, -30);//removing 30 days from aniversary date
            start = s.getTime();//setting start as aniversary minus 30 days
            if (current.before(start)) {//check if current date is before start date
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
            boolean ctr = ((current.after(start)) && (current.before(end)));//true if current is in between end and start
            if (ctr) {//if current date is in between
                return (seq.format(start) + " " + seq.format(current));
            } else {
                return (seq.format(start) + " " + seq.format(end));
            }
        }
        catch (ParseException e){
            return("ParseException caught : Enter a valid date");
        }
        catch (ArrayIndexOutOfBoundsException e){
            return("Enter the dates with proper spacing between them");
        }
    }

}