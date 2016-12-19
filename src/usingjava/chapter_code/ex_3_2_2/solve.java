package usingjava.chapter_code.ex_3_2_2;

import textio.TextIO;

public class solve {
    public static void main(String[] args) {
        //main, calls the method getNumber()
        getNumber();
    }

    //getNumber(), does all the work
    private static void getNumber() {

        //Ask user for a postive integer
        System.out.print("Please enter a positive number for assessment:\n");
        int n = TextIO.getlnInt();

        //If integer wasn't positive, prompt user again, by calling getNumber() recursively
        if (n < 1) {
            System.out.println("Woops, that was not a positive integer!");
            getNumber();
        }

        //If everything's good so far, we repeat until we reach n = 1
        else {
            while (n != 1) {
                    //While we repeat, we check for two conditions, is n even?
                    if (n % 2 == 0) {

                        n = n/2;

                    }

                    //If not, then n has to be odd:

                    else {

                        n = (3 * n) + 1;

                    }

                    //And when we've ended one cycle, we print out the current value of n
                    System.out.println(n);

                    }
            } //End method getNumber

    } //End method main

} //End class Solve