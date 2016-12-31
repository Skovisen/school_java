package thinkjava.chapter_code.scanner_class;

import java.util.Scanner;

public class Echo {
    public static void main(String[] args){
        String line;
        Scanner in = new Scanner(System.in);

        System.out.print("Type something: ");
        line = in.nextLine();
        System.out.println("You wrote: " + line);

        System.out.print("Type something else: ");
        line = in.nextLine();
        System.out.println("Now you wrote: " + line);
    }
}
