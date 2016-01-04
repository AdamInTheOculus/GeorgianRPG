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
        // We rely on a consistent project layout; integrity is necessary
        System.out.print("Ensuring project folder structure is correct: ");
        if(validateProject())
            System.out.println("SUCCESS!");
        else {
            // TODO: Handle validation properly 
            System.out.println("FAILURE!");
            System.out.println("Exiting game.");
            System.exit(0);
        }

        /* Instantiate (create) any objects needed at startup here */

        System.out.println("Initialization complete.");
    }

    private boolean validateProject() {
        /**
         *  Below is a poorly drawn tree diagram of our project layout.
         *  It is necessary that all projects match this layout in order to
         *  prevent errors or bugs that are caused by misplaced files or
         *  directories.
         *  
         *  
         *  src (Source directory -- all source files stored here)
         *  |__
         *  |  Main (Main, TextGame)
         *  |__
         *  |  Entities (Weapon, Player, Quest, Map, etc.)
         *  |__
         *  |  States (Menu, Battle, Map, Dialogue)
         *  |
         *  data (Game data directory -- JSON files, story/dialogue, error dumps)
         *  |__
         *  |  JSON
         *  |__
         *  |  Story
         *  |__
         *  |  Error
         */
    }
    
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