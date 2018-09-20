import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addMath(5, 5));
        System.out.println(subtractMath(5, 5));
        System.out.println(multiplyMath(5, 5));
        System.out.println(divideMath(5, 5));
        System.out.println("Give me a number between 1 and 10!");
//        System.out.println(getInteger(1, 10));

//        System.out.println(factorialNumbers(10));


    }


    private static int addMath(int min, int n) {
        int addingTotal = min + n;
        return addingTotal;

    }

    private static int subtractMath(int y, int x) {
        int subtractTotal = y - x;
        return subtractTotal;

    }

    private static int multiplyMath(int a, int b) {
        int mutiplyTotal = a * b;
        return mutiplyTotal;

    }


    private static int divideMath(int c, int d) {
        int divideMath = c / d;
        return divideMath;
    }

//    public static int getInteger(int minValue, int maxValue) {
//
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        int numbers = input;
//
//        do {
//            if (numbers < minValue) {
//                System.out.println("That's less then 1");
//            } else if (numbers > maxValue) {
//                System.out.println("That's more then 10");
//            } else
//                System.out.println("That's between 1 and 10!");
//        } while (minValue >= maxValue);
//        return getInteger(1, 10);
//
//
//
//
//
//    }

//    Calculate the factorial of a number.
//
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!)


//    public static long factorialNumbers(long a) {
//     Scanner factscan = new Scanner(System.in);
//
//
//     do {
//         if (a == 0) {
//             System.out.println("The Number: " + a);
//             return 1;
//
//         }
//     }while (false);
//        System.out.println(a);
//        return a*factorialNumbers(a-1);


}



