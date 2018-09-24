import java.util.Random;

public class ServerNameGenerator {



    /** Todo
     * Create two arrays whose elements are strings, one with at
     * least 10 adjectives, another with at least 10 nouns.
     */
    private static String[] adjective = {"Good","New","Big","Early","Sparking","Ugliest",
                           "Old Fashioned","Lazy","Bewildered","Angry"};

    private static String[]  noun = {"Wealth","Happiness","Pride","Communication","Mountain",
                      "Empire","Movie","Tablecloth","Sunlight","Music"};

    /** Todo
     * Create a method that will return a random element from an array
     * of strings.
     */

    String pickRandomWord(String[] words){
        Random rand = new Random();
        int i = rand.nextInt(words.length);
        System.out.println(i);
        return words[i];
    }

    public static void main(String[] args) {
        ServerNameGenerator sng = new ServerNameGenerator();
        String word1 = sng.pickRandomWord(sng.adjective);
        String word2 =sng.pickRandomWord(sng.noun);
        System.out.println("Here is your Server Name:");
        System.out.println(word1 + " " + word2);


    }

//    public nameGen(String[] firstWord, String[] secondWord){
//
//
//    }


}
