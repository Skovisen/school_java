package usingjava.chapter_tasks.ex_3_1;

import java.util.Random;

public class snakeEyes {
    public static void main (String[] args){
        int count = 0;
        Random random = new Random();
        while (true){
            int diceOne  = random.nextInt(6) + 1;
            int diceTwo  = random.nextInt(6) + 1;
            if (diceOne == 1 && diceOne == diceTwo){
                System.out.printf("Dice one is %d, and dice two is %d", diceOne, diceTwo);
                System.out.println();
                System.out.printf("We have a match, it took %d times", count);
                break;

            }
            System.out.printf("Dice one is %d, and dice two is %d", diceOne, diceTwo);
            System.out.println();
            count++;
        }

    }
}
