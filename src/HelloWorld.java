public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello,");
        System.out.print(" World");

// 1) Create an int variable named myFavoriteNumber and assign
// your favorite number to it, then print it out to the console.?

//        int myFavoriteNumber;
//        myFavoriteNumber = 13;

// 2) Create a String variable named myString and assign a string
// value to it, then print the variable out to the console.

//        String question;
//        question = "What is my favorite number";

// 3) Change your code to assign a character value to myString.
// What do you notice?

        //Java will not run the String with ''.
//        String question;
//        question = 'What is my favorite number';


// 4) Change your code to assign the value 3.14159 to myString. What
// happens?

//        String question;
//        question = "3.14159";

        // Does not compile

// 5) Declare an long variable named myNumber, but do not assign
//  anything to it. Next try to print out myNumber to the console.
//  What happens?

//        long myNumber;
//        System.out.println("myNumber");

        //Does not compile

// 6) Change your code to assign the value 3.14 to myNumber. What do you
// notice

//        long myNumber = (long) 3.14;
//        System.out.println(myNumber);

        // Printed out Hello, World

// 7) Change your code to assign the value 123L (Note the 'L' at the
// end) to myNumber.

//        long myNumber = 123L;
//        System.out.println(myNumber);

        //Prints Hello, World123

// 8) Change your code to assign the value 123 to myNumber.

//       int myNumber = 123;

// A) Why does assigning the value 3.14 to a variable declared as a
// long not compile, but assigning an integer value does?


// 9) Change your code to declare myNumber as a float. Assign the
// value 3.14 to it. What happens? What are two ways we could fix
// this?

//        float myNumber;
//        myNumber = (float) 3.14;
//        System.out.println(myNumber);
//
//         Prints out Hello, World3.14

// 10) Copy and paste the following code blocks one at a time
// and execute them


//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        // Prints out 5, then 6

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        // Prints out 6 then 6

// A) What is the difference between the above code blocks?
// Explain why the code outputs what it does.

        // The first code block starts with 5 then ++ giving x
        // a value of 6 then prints it out

        // The Second

// 11) Try to create a variable named class. What happens?

//        int class;
//        class = 10;

        // class does not compile

// 12) Object is the most generic type in Java. You can assign any
// value to a variable of type Object. What do you think will happen
// when the following code is run?

//        String theNumberThree = "three";
//        Object indigo = theNumberThree;
//        int three = (int) indigo;
//        System.out.println(three);

        // Error message : Exception in thread "main"
        // java.lang.ClassCastException: java.lang.String cannot be
        // cast to java.lang.Intege Hello, World
        // at HelloWorld.main(HelloWorld.java:114)

//        int x = 4;
////       x = x + 5;
//
//         x += 5;
//
//        System.out.print(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;

//        int x = 3;
//        int y = 4;
//        x *= y;
//
//
//        System.out.println(x);
//
//        int x = 10;
//        int y = 2;
////        x = x / y;
////        y = y - x;
//
//        x %= y;
//        System.out.print(x);
//        y -= x;
//        System.out.print(y);
//
//        int toBig = 2147483648;
        // Does not Compile.

    }
}

