package grades;

import util.Input;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GradesApplication {

    static HashMap<String, Student> records;

        static void init(){

            records = new HashMap<>();
            Student mike = new Student("Mike");
            records.put("mikewaymire",mike);
            records.get("mikewaymire").addGrade(76);
            records.get("mikewaymire").addGrade(86);
            records.get("mikewaymire").addGrade(80);

//            records.get("mikewaymire").addGrade(86);
//            records.get("mikewaymire").addGrade(80);

            Student lily = new Student("Lily");
            records.put("lilymoon",lily);
            records.get("lilymoon").addGrade(95);
            records.get("lilymoon").addGrade(10);
            records.get("lilymoon").addGrade(90);



            Student rose = new Student("Rose");
            records.put("rosevillafranca",rose);
            records.get("rosevillafranca").addGrade(100);
            records.get("rosevillafranca").addGrade(100);
            records.get("rosevillafranca").addGrade(90);


//            Student mike = new Student("Mike");
//            System.out.println();
//            records.put("CodeupStudent1",mike);
//            mike.addGrade(85);
//            mike.addGrade(76);
//            mike.addGrade(67);
//            System.out.println(mike.getGradeAverage());
//
//            Student student2 = new Student("student2");
//            student2.addGrade(88);
//            student2.addGrade(79);
//            student2.addGrade(60);
//            System.out.println(student2.getGradeAverage());
//            records.put("CodeupStudent2",student2);
//
//            Student student3 = new Student("student3");
//            student3.addGrade(82);
//            student3.addGrade(73);
//            student3.addGrade(64);
//            System.out.println(student3.getGradeAverage());
//            records.put("CodeupStudent3",student3);
//
//
//            Student student4 = new Student("student4");
//            student4.addGrade(81);
//            student4.addGrade(73);
//            student4.addGrade(65);
//            System.out.println(student4.getGradeAverage());
//            records.put("CodeupStudent4",student4);
//
//            inorder to get the student username
//            use for loop to iterate through the HashMap key set by string type of variable
//            then print out each username


            }

            public static void main(String[] args) {
                init();
                for(String codeup: records.keySet())
                    System.out.print(" |"+codeup+"| ");
                    System.out.println();

                 Input input = new Input();
                String codeup;
                String answer = "yes";
                do {
                    System.out.println("Here are the github usernames of our records:\n");
                    codeup = input.getString();


                    if (records.containsKey(codeup)) {
                        Student student = records.get(codeup);
                        System.out.println(student);
                    } else {
                        System.out.println("Sorry, no student found with the github username of \"" + codeup + "\".");
                    }
                    System.out.print("Would you like to see another record:\n>");
                    answer = input.getString();
                }while (!answer.toLowerCase().contains("n"));
        }



}

