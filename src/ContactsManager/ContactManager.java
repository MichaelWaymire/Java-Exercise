package ContactsManager;


import util.Input;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static util.ContactPath.listCreator;
import static util.ContactPath.listHolder;

public class ContactManager {
    private static Input input = new Input();


    private static final String Rolodex= "src/ContactsManager/contacts.txt";
    private static List<String> contacts = new ArrayList<>();

    //Allows the user to add a name to the list
    public static String addName(){
        String name = input.getString("Please enter a name");
        return name;
    }
    //Allows user imput to add numbers to the file.
    public static String addNumber() {
        String num = input.getString("Please provide a phone number: ");
        if (num.length() == 10) {
            return num;
        } else {
            return addNumber();

        }
    }
        // Removes a contact from the list
        public static void removeContact(){
            String delteContact = input.getString("Please enter who you wish to remove");
            for(String dc: contacts) {
                if( delteContact.equalsIgnoreCase(dc.split(" ")[0])){
                    contacts.remove(dc);
                    return;
                }

            }
            System.out.println("No results found, try again.");
            removeContact();
        }

        //search for a someone on your contacts list
    public static void searchContact(){
        String search = input.getString("Input for a search");
        for (String x: contacts){
            if(search.equalsIgnoreCase(x.split(" ")[0])){

                System.out.println(x);
                return;
            }

        }
        System.out.println("Try again.");
        searchContact();

    }

    public static void main(String[] args) {

        contacts = listCreator(Rolodex);

        do {
            System.out.println("1 - View all contacts\n2 - Add new contact\n3 - Search by contact name\n4 - Delete existing contacts\n5 - Exit\n");
            int userInput = input.getInt();

            if (userInput == 1) {
                System.out.printf("%-10s | %-12s\n", "Name", "Phone Number");
                for(String line: contacts) {
                    String[] info = line.split(" ");
                    System.out.printf("%-10s | %-12s\n", info[0], info[1]);
                }
            } else if (userInput == 2) {
                String name = addName();
                String number = addNumber();
                contacts.add(String.format("%s %s", name, number));
            } else if (userInput == 3) {
                searchContact();
            } else if (userInput == 4) {
                removeContact();
            } else if (userInput == 5) {
                System.out.println("Goodbye.");
                break;
            }
        } while (input.yesNo());
    }


}






