
import java.util.Random;

/**
 *  This file will go over some various loop structures. Mainly for loops
 *  and enhanced for loops and some applications related to gaming that 
 *  might be used in our project.  If anyone would like to add more loop
 *  examples, make sure to explain how it works, and give credit if you borrow
 *  code from a website.
 */

// Classes should ALWAYS be capitalized.
// Class names should ALWAYS be the same name as the file.
// If there are more than one classes in a single file (which is not rare),
// then the first class (in this case, Loops) should be the file name.
public class Loops {
    
    // I will go over 'public' and 'static' in the Objects tutorial.
    
    /** 
     *  There can only be ONE main method in a project. However ... some 
     *  programmers use a main method in each class for testing purposes. The
     *  important thing to remember is you MUST remove your main method after
     *  testing is complete, otherwise the compiler (a program which translates
     *  Java code into byte code) will cause the project to break. Just remember
     *  to keep one main method, because all execution begins in the main method.
     */
    public static void main(String[] args) {
        
        /**
         *  To start, I will create an array of 10 integers and print all 
         *  elements using 4 loops: for, enhanced for, while, do while. 
         * 
         *  The purpose of this is to show that many things can be done more
         *  than one way. However, there is always a time and place to do each.
         */
        
        // Our array of ints; numbers are arbitrary (arbitrary means "doesn't matter")
        int[] numArray = new int[10];
        
        // Just for fun, let's randomly create 10 elements for our loop
        Random random = new Random();
        
        /**
         *  For this example, I am going to use a for loop. Why? Typically, you
         *  would use a for loop when you know how many times you will be looping.
         *  Since we are looping x number of times, where x is the length of the
         *  array, we can use a for loop.
         */
        
        for(int i=0; i<numArray.length; i++) {
            // Create a random number between 0 and 50
            int randomNum = random.nextInt(50);
            
            // Insert our number into the ith element of numArray
            numArray[i] = randomNum;
        }
        
        /**
         *  Let's do the same thing with a while loop. I'm going to use the same
         *  variable, i, and it will not break my program. How come I can create 
         *  i again without causing the compiler to throw an error? In Java, 
         *  creating variables (and I believe any data type) is based off of 
         *  block level hierarchy. It's Java's way of cleaning up variables that
         *  aren't needed anymore: "Garbage Collection". So, variable 'i', used 
         *  in the previous for loop, no longer exists. If I type:
         *  
         *  i = 10; 
         * 
         *  The compiler will get mad and tell me 'i' doesn't exist because the
         *  blocked code above has finished executing. If you still don't understand,
         *  don't worry about it too much. This is more nitpicky details!
         */
        int i = 0;
        while(i < numArray.length) {
            int randomNum = random.nextInt(50);
            numArray[i] = randomNum;
            i++; // While loop will not do i++ automatically, so we have to explicity state this
        }
        
        // Since I'm tight on time (9:30 and drinks start at 10:30), I will task you guys
        // to print out each element in the array with a for loop and a while loop. If you
        // want to take it further to reinforce your skills, use a do while and an enhanced loop!
        
        /**
         *  PROGRAMMING CHALLENGES -- Create a separate file with your name and
         *  save to the Tutorial directory! Don't forget to add, commit, and 
         *  push your changes!
         * 
         *  1) git add "filename.java"
         *  2) git commit -m "Commit message -- make this accurate to what you're doing"
         *  3) git push
         */
        
        /* Print out the numbers in the array */
        
        /* Add all numbers using an enhanced for loop and calculate the average */
        
        /* Sort the array from smallest to largest */
    }
}