/**
 *  TextGame class will contain our game loop.
 * 
 *  In this game, we won't worry about FPS. We will worry about cycles.
 *  The main game loop will update once every 'cycle', and a cycle is dependent
 *  on the users command; the game will update according to what is typed by
 *  the user. 
 *
 *  This should be very low-cost for the CPU, but depending on how our AI
 *  is implemented, things could delay a bit. (Honestly, I wouldn't worry
 *  too much about optimization and stuff like that right now. We can focus
 *  on that later, but since we aren't dealing with graphics there is a low 
 *  chance our performance will be poor).
 */

package general;

import system.*; // Contains OS and ProjectValidator classes

public class TextGame {
    
    public TextGame() {   
        initialize();
    }
    
    // Initialization of our game. Contains anything needed at start-up
    private void initialize() {

        // Check if project layout is valid
        System.out.print("Ensuring project folder structure is correct: ");
        if(ProjectValidator.validate())
            System.out.println("SUCCESS!");
        else { 
            System.out.println("FAILURE! Exiting Game.");
            System.exit(0);
        }

        // Intialization was successful
        System.out.println("Initialization complete.");
    }

    // This runs our actual game after initialization
    public void run() {
        boolean isRunning = true;
        
        // Main game loop
        while(isRunning) {
            // Keep lines below until initialization is compete
            System.out.println("Game is ready to play!");
            isRunning = false;
        }
    }
}