package ContactsManager;


import util.Input;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactManager {
    private static Input input = new Input();


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




}
