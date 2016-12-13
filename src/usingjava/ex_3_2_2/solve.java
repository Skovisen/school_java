package usingjava.ex_3_2_2;

import textio.TextIO;

/**
 * Created by chris on 13.12.2016.
 */
public class solve {
    public static void main(String[] args){
        getNumber();
        }


    }
    public static void getNumber() {
        System.out.print("Please enter a positive number for assessment:\n");
        int n = TextIO.getlnInt();
        if (n < 1) {
            System.out.println("Woops, that was not a positive integer!");
            getNumber();
        }
        else{
                while(n != 1){
                    //TODO
                }
            }
        }
}
