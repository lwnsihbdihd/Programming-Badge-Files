package intro;

public class Intro {
    /*
     * Welcome to Java!
     *
     * In this exercise, you are going to build a small program
     * that introduces you to someone else.
     *
     * Follow the prompts below and write your code in the
     * allotted sections.
     *
     * When you are finished, run your code by clicking the
     * triangle on the top-right corner.
     * 
     * For the below sections, some sections have code that is commented out. 
     * Uncomment by highlighting and using Ctrl+/. 
     */
    public static void main(String[] args) {

        // ---------------------------------------------------------
        // 1. START YOUR PROGRAM
        // ---------------------------------------------------------
        // Let's start by introducing yourself.
        //
        // Write a line of code that prints your name. Then, run the program. 
        //
        // ---- BEGIN CODE ----

        System.out.println("Harvey Jiang"); 

        // ---- END CODE ----


        // ---------------------------------------------------------
        // 2. ADD SOME INFORMATION
        // ---------------------------------------------------------
        // Right now, your program can only tell us your name.
        // Let's give it some more information.
        //
        // Create variables for your name and your age.
        // Then use those variables to print something like:
        //
        // "Hi! My name is Bob and I am 16 years old."
        // 
        // Make sure to comment out your first print statement above. (Ctrl+/)
        //
        // ---- BEGIN CODE ----

        String name = "Harvey";  
        int age = 15;

        // TODO: print out your introduction

        System.out.println("Hi! My name is " + name + "and I am " + age + "years old.");

        // ---- END CODE ----


        // Your program should now contain information that
        // might change. For example, if you get older, you
        // should only have to change your age variable rather
        // than search through your entire program.
        //
        // Now add another piece of information about yourself.
        //
        // Choose a data type that you have not used yet.
        // Print that information as part of your introduction above. 


        // ---------------------------------------------------------
        // 3. MAKE YOUR PROGRAM THINK
        // ---------------------------------------------------------
        // So far, your program simply prints information.
        //
        // Let's make it capable of making decisions.
        //
        // Imagine that your program is introducing you to
        // someone and wants to say something special depending
        // on your information.
        //
        // 3.1. Write an if statement that only prints something
        // if one of your variables is equal to a specific value.
        //
        // For example, you might print something different
        // if your age is 18.
        //
        // The scaffold code below is commented out. Make sure to uncomment it. 
        // ---- BEGIN CODE ----

         if(age == 18){
            System.out.println("I am an adult now.");
         }

        // ---- END CODE ----


        // 3.2. Now make your program respond to a comparison.
        //
        // Write an if statement that only prints something
        // if one of your variables is greater than a specific value.
        //
        // For example, you might print something if your age
        // is greater than 18.
        //
        // ---- BEGIN CODE ----

        if (age >= 21) {
            System.out.println("I can drink!");
        }
        else {
            System.out.println("I can't drink.");
        }

        // ---- END CODE ----


        // ---------------------------------------------------------
        // 4. REVIEW YOUR PROGRAM
        // ---------------------------------------------------------
        // You have now built a small program that:
        //
        //   - prints information
        //   - stores information in variables
        //   - uses different data types
        //   - makes decisions using if statements
        //
        // Go back through the code you just wrote and re-read it.
        //
        // For any portions that seem unclear, write a comment
        // explaining what they do and why they are there.
        //
        // Then continue annotating your code with comments
        // wherever you think they would help another programmer
        // understand your program.
    }
}

