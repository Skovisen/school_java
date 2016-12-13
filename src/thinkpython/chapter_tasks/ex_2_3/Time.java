package thinkpython.chapter_tasks.ex_2_3;

public class Time {
    public static void main(String[] args) {
        // generate some simple output
        double day = 24;
        int hour = 18;
        int minute = 3;
        int seconds = 59;
        double sec_now = ((hour*3600)+(minute * 60)+seconds);
        double percent = ((sec_now*100)/(day*3600));
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        if (minute <= 9) {
            System.out.print("0"+minute);
        }
        else{
            System.out.print(+minute);
        }
        System.out.print(":");
        System.out.print(seconds);
        System.out.println(".");
        System.out.print("Number of seconds since midnight: ");
        System.out.println(sec_now);
        System.out.print("Percentage passed of the day: ");
        System.out.println(percent);
    }

}