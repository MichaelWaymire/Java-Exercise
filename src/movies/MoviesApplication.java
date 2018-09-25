package movies;
//import input allows me to use the items from that package including the scanner.

import util.Input;


//Class = everything happening in this application
public class MoviesApplication {


    //method to display the movies by category.
    private static void displayMovies(String filter) {
        //creates the movie array and makes a new one and attachs the findAll method to it
        Movie[] all = MoviesArray.findAll();
        //The filter looks for the key string "all". Equals makes sure that everything will be returned
        if (filter.equals("all")) {
            //"If" this happens, we will loop through the information and print out the name and category
            for (Movie movie : all) System.out.println(movie.getName() + " -- " + movie.getCategory());
            // Otherwise (else) loop through movie and return the picked options (1-5)
        } else {

            //review this part of code to make it work.. <-- Fixed, there was a ; after the if statement which prevented the loop from continuing
            // This part loops through all the movies for a second time
            for (Movie movie : all) {
                //if the category matches the filter the user selects, then this will print out the selected option
                if (movie.getCategory().equals(filter))
                    System.out.println(movie.getName() + " -- " + movie.getCategory());

            }
        }
    }

    private static void addMovies(String[] args) {

    }


    public static void main(String[] args) {

        System.out.println("What would you like to do?\n" + "\n" + "0 - exit\n" + "1 - view all movies\n" + "2 - view movies in the animated category\n" + "3 - view movies in the drama category\n" + "4 - view movies in the horror category\n" + "5 - view movies in the scifi category\n");


//        Scanner scanner = new Scanner(System.in);

        Input input = new Input();
        while (true) {
            System.out.println("Enter your choice:");
            int choice = input.getInt();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    displayMovies("all");
                    break;
                case 2:
                    displayMovies("animated");
                    break;
                case 3:
                    displayMovies("drama");
                    break;
                case 4:
                    displayMovies("horror");
                    break;
                case 5:
                    displayMovies("scifi");
                    break;
                case 6:
                    displayMovies("add");
                    System.out.print("Please provide the name of the Movie:");


                    break;


            }
        }
    }
}