
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pinger {

    public static boolean runSystemCommand(String ip, int c) {
        String[] command = {"/bin/sh", "-c", "ping -c" + c + " "+ ip + " | grep 'time=' | awk '{print substr($7, 6, length($7))}' | sort -n"};

        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s;
            String str = "";
            // reading output stream of the command
            while ((s = inputStream.readLine()) != null) {
                //System.out.println(s);
                str += s + " ";
            }
            String[] strArray = str.split(" ");
            int len = strArray.length;
            if((len % 2 == 0) && (len > 0)){
                float median;
                median = (Float.valueOf(strArray[len/2]) + Float.valueOf(strArray[len/2 - 1]))/2;
                System.out.println("Median time for pings is " + median + "ms");
            }
            else if(len > 0){
                float median = Float.valueOf(strArray[len/2]);
                System.out.println("Median time for pings is " + median + "ms.");
            }
            else{
                System.out.println("Couldn't ping the host");
                return false;
            }


        } catch (Exception e) {
            System.out.println("Couldn't ping the host");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the IP: ");
        String ip = input.nextLine();
        System.out.println("Enter the number of pings you want to make");
        int c = input.nextInt();
        //runSystemCommand("ping -c" + c + " "+ ip + " | awk '{print substr($7, 6, length($7))}'");
        //String[] cmd = {"/bin/sh", "-c", "ping -c" + c + " "+ ip + " | grep 'time=' | awk '{print substr($7, 6, length($7))}' | sort -n"};
        runSystemCommand(ip, c);

    }
}
/*
I have used the system utility to ping the server
*/