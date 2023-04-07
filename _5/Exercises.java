package AdvancedJavaOOP._5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     *    prints it's stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // Your code here
          try {
              Files.createFile(Path.of("Test.txt"));
          }
          catch (IOException error){
              System.out.println("it's stack trace!");

          }




    }

    /**
     * 2:
     *
     * Write a try-catch block that attempts to open a file
     *
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        String userInputFileName = "test-file.txt";
        try {
            Files.readString(Path.of(userInputFileName));
        }
        catch (IOException e){
            System.out.println("file could not be found");

        }
    }

    /**
     * 3:
     *
     * Write a try-catch block that attempts to parse a string as an integer.
     *
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
       try {
           Integer.parseInt("house");
       }
       catch (NumberFormatException err){
           System.out.println("wtf man! learn to write numbers");
       }

    }

    /**
     * 4:
     *
     * Write a try block that around this print statement that attempts to divide 2 numbers
     *
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     *
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     *
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        // sostituito il double con int per richiamare ArithmeticException
        //non riesco a richiamare DivideByZeroException

        int num1 = 10;
        String num2AsString = "0";
         try{
        System.out.println(num1/Integer.parseInt(num2AsString));
        }
         catch (NumberFormatException e){
             System.out.println("you can t divide a number for a string");
         }
         catch (ArithmeticException e){
             System.out.println("non puoi dividere per zero");
         }
        // Your catch blocks here

    }
}
