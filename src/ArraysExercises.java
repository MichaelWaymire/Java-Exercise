import java.util.Arrays;


public class ArraysExercises {


    /**
     * Todo
     * 1.A
     * Create an array that holds 3 Person objects.
     * Assign a new instance of the Person class to
     * each element. Iterate through the array and
     * print out the name of each person in the array.
     */

    public static void main(String[] args) {
           //array before adding someone
//        Person mike = new Person("Mike");

        Person[] persons = {new Person("Mike"), new Person("Rose"), new Person("Raul")};

        for (Person name : persons) {
            System.out.println(name.getName());
        }

        // array adding someone
        persons = addPerson(persons, "Cole");

        for (Person name : persons) {
            System.out.println(name.getName() + " Is on the list!");
        }
    }

    /**
     * Todo
     * Create a static method named addPerson.
     * It should accept an array of Person
     * objects, as well as a single person object
     * to add to the passed array. It should
     * return an array whose length is 1 greater
     * than the passed array, with the passed
     * person object at the end of the array.
     */


    public static Person[] addPerson(Person[] persons, String person) {
        //create new array as placeholder
        Person[] newArray = new Person[persons.length + 1];


        //populate new array with values from old array
        for (int i = 0; i < persons.length; i++) {
            newArray[i] = persons[i];
        }

//        for (String name : persons) {
////            System.out.println(name);
//        }

        //add new person to new array
        newArray[newArray.length - 1] = new Person(person);


        //create new array
        return newArray;

    }
}
