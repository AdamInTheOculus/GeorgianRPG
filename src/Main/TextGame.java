package Main;

/**
 *  TextGame class will contain our game loop.
 * 
 *  In this game, we won't worry about FPS. We will worry about cycles.
 *  The main game loop will update once every 'cycle', and a cycle is dependent
 *  on the users command; the game will update according to what is typed in by
 *  the user. 
 *
 *  This should be very low-cost for the CPU, but depending on how our
 *  AI is implemented, things could delay a bit. (Honestly, I wouldn't worry
 *  too much about optimization and stuff like that right now. We can focus on
 *  that later, but since we aren't dealing with graphics and audio there is a 
 *  very low chance our performance will be low).
 */

public class TextGame {
    
    public TextGame() {
        
        initialize();
    }
    
    private void initialize() {

        // Instantiate any objects needed at startup here
        System.out.println("Initialization complete.");
    }
    
    public void run() {

        boolean isRunning = true;
        
        // Main game loop
        while(isRunning) {
            System.out.println("Running game ...");
            isRunning = false;
        }
    }
}