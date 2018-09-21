package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){ scanner = new Scanner(System.in).useDelimiter("\n");

    }



    String getString(){
        return scanner.next();
    }


    boolean yesNo(){
        System.out.println("please input yes or y to continue");
        String userInput = getString();
        return yesNo();

    }
//
//
    int getInt(int min, int max){
        System.out.println("Please give me a number" + min + " and "
        + max);
        return getInt();
    }
//
//
    int getInt(){
        return scanner.nextInt();
    }
//
//
    double getouble(double min, double max){
        System.out.println("please input a number between " + min +
        " and " + max);
        return getDouble();
    }
//
//
    double getDouble(){
        return scanner.nextInt();
    }
}