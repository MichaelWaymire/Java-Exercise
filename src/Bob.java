import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

//        Create a class named Bob with a main method for the following exercise

public class Bob {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Bob is a lackadaisical teenager. In conversation," +
                " his responses are very limited. Lets talk to Bob");
        String bobIsListening = scanner.nextLine();
//        boolean conversationWithBob = true;
//        System.out.println("-->" + bobIsListening + "<--");

//        He answers 'Whoa, chill out!' if you yell at him. (the input
//        ends with an exclamation mark)
        if (bobIsListening.endsWith("!")) {
            System.out.println("Whoa, chill out!");


        } else if (bobIsListening.equals(" ")) {
            System.out.println("Whatever!");


        } else if (bobIsListening.endsWith("?")) {
            System.out.println("Sure.");



        } else {
            System.out.println("Fine. Be that way!");
        }
    }


//        He says 'Fine. Be that way!' if you address him without actually
//        saying anything. (empty input)

//        He answers 'Whatever.' to anything else.


//        Write the Java code necessary so that a user of your command line
//        application can have a conversation with Bob.

}
