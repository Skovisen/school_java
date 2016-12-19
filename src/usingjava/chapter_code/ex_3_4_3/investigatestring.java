package usingjava.chapter_code.ex_3_4_3;

import textio.TextIO;

public class investigatestring {
    public static void main (String[] args){

        //Let's have some variables:
        String word;
        int count = 0;
        char letter;
        int i;

        System.out.println("Please enter some text:");
        word = TextIO.getlnString();
        word = word.toUpperCase();

        System.out.println("Your input contains the following letters:");
        System.out.println();
        System.out.print(" ");

        //Traverse through the alphabet, from A to Z
        for (letter = 'A'; letter <= 'Z'; letter++){

            //Traverse through the numbers 0 to the amount of characters in the word, for each letter in the alphabet
            for (i = 0; i < word.length(); i++){

                //If the current letter in the alphabet is equal to the letter at location i in word
                if (letter == word.charAt(i)){
                    //print out that letter
                    System.out.print(letter);
                    System.out.print(' ');
                    //and count this letter
                    count++;
                    //If this holds, we break out of this for loop, to check the next letter in the alphabet
                    break;
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("There were " + count + " different letters.");

    } //End of method main
} //End of class investigatestring
