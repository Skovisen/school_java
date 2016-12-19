package usingjava.chapter_code.ex_3_4_3;
import textio.TextIO;

public class tableofnumbers {
    public static void main(String[] args){
        getInput();

    }
    private static void getInput() {

        //Get amount of numbers
        System.out.println("Please specify how many numbers you wish to fill your first row with:");
        int m = TextIO.getlnInt();
        if (m < 1){
            System.out.println("Wait, that number wasn't positive. Let's try again.");
            getInput();
        }
        else{
            for (int rowNumber = 1; rowNumber <= m; rowNumber++){
                for (int n = 1; n <= m; n++){
                    System.out.printf("%4d", n * rowNumber);
                }
                System.out.println();
            }
        }

    }
}
