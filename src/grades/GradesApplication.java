package grades;

import util.Input;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GradesApplication {

    public static void main(){

        HashMap<String, Student> students = new HashMap<>();
        students.put("MichaelWaymire",
                new Student("Mike", new ArrayList<>
                        (Arrays.asList(76, 86, 90))));
        students.put("TamishaRutledge",
                new Student("Rutledge", new ArrayList<>
                        (Arrays.asList(90, 95, 90))));
        students.put("ColeJimenez",
                new Student("Cole", new ArrayList<>
                        (Arrays.asList(100, 100, 100))));
        students.put("HunterHouts",
                new Student("Hunter", new ArrayList<>
                        (Arrays.asList(100, 100, 100))));
        students.put("PatrickFisher",
                new Student("Patrick", new ArrayList<>
                        (Arrays.asList(75, 85, 90))));
        students.put("LilyMoonFang",
                new Student("Lily", new ArrayList<>
                        (Arrays.asList(71, 74, 89))));


    }
}
