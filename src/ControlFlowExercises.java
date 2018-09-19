import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the grade (0-100)");
        boolean confirm = true;
        while (confirm) {
            int grade = scanner.nextInt();
//        System.out.println(grade);
            String letterGrade = "*";
            if (grade < 60) letterGrade = "F";
            else if (grade <= 66) letterGrade = "D";
            else if (grade <= 79) letterGrade = "C";
            else if (grade <= 87) letterGrade = "B";
            else if (grade <= 100) letterGrade = "A";
            System.out.println(letterGrade);
        }

    }
}



//    int userInt = scanner.nextInt();
//        System.out.println("Here is your table!");
//                System.out.println();
//                System.out.println("  number  |  squared |  cubed");
//                System.out.println(" -------- | -------- | -------");
//                for(long i = 0; i < userInt; i++) {
//        System.out.format(" %-9s| %-9s| %-9s%n",
//        i,
//        i * i,
//        i * i * i);

        //        int numbers = 1;
//        System.out.println("Numbers | Squared | Cubed");
//        System.out.println("________|_________|_______");
//        for (int i = 1; i <= 5; i++) {
//
//            int squared = numbers *= i;
//            System.out.print(i);
//            System.out.print("       |");
//            System.out.println(numbers);
////            numbers += squared;
//            i *= squared;
//            if (squared  < 30) {
////                numbers *= squared;

//            }
//            System.out.print("        | ");
//            System.out.print(squared);
//            squared *= 3;
//            if (squared > 30) {
//                squared = 15;
//            }
//            System.out.println("     ");
//        }






//        for(int i = 0; i < 101; i++){
//        if(i % 15 == 0){
//        System.out.println("FizzBuzz");
//        }else if(i % 3 == 0){
//        System.out.println("Fizz");
//        }else if(i % 5 == 0){
//        System.out.println("Buzz");
//        }else{
//        System.out.println(i);
//
//        }
//
//        }

//      for(long k=2; k<=1000000: k*=k)
//          System.out.pringln(k);


//    long count = 2;
//        do {
//
//                System.out.println(count);
//                count *= count;
//
////            count *= count;
//                }while (count <= 1000000);
//
//                }

//
//    int count = 100;
//        do {
//                count -= 5;
//                System.out.println(count);
//                }while (count >= -5);



//    int i = 5;
//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//
//    }
//}
