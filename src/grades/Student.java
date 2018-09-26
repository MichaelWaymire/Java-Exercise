package grades;
import java.util.ArrayList;

public class Student {

    //Created Private Property that is a string
    //called StudentNames
    private String studentNames;

    //Created Private ArrayList<Integer> called
    //grades
    private ArrayList<Integer> grades;


    //This constructor sets the studentName and
    //initializes a empty ArrayList<Interger>
    public Student(String studentNames, ArrayList<Integer> grades) {
        this.studentNames = studentNames;
        this.grades = grades;
    }

    // returns the student's name
    public String getStudentNames() {
        return studentNames;
    }
    //adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades

//    Sample code found to help work out avarage.
//    private double calculateAverage(List <Integer> marks) {
//        Integer sum = 0;
//        if(!marks.isEmpty()) {
//            for (Integer mark : marks) {
//                sum += mark;
//            }
//            return sum.doubleValue() / marks.size();
//        }
//        return sum;
//    }

    public double getGradeAverage(){
        double total = 0;
        for (double i: this.grades) { total += i; }
        return total / this.grades.size();
    }

    public static void main(String[] args) {



        //Used to test construtors and methods
//        First Student with a grade
//        Student cody = new Student("Cody");
//        System.out.println(cody.getStudentNames());
//        cody.addGrade(80);
//        cody.addGrade(75);
//        cody.addGrade(90);
//        System.out.println(cody.grades);
//
//        //Second Student
//        Student two = new Student("Lily");
//        System.out.println(two.getStudentNames());
//        two.addGrade(95);
//        System.out.println(two.grades);
//
//        //Third Student
//        Student three = new Student("Tumm");
//        System.out.println(three.getStudentNames());
//        three.addGrade(86);
//        System.out.println(three.grades);
//
//
//        System.out.println("Cody's average grade is: "  + cody.getGradeAverage());




    }

}
