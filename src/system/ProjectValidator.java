/**
   *  ProjectValidator runs the initial project integrity check. It 
   *  ensures the user's project is properly set up. Hopefully this
   *  extra precaution will save some debugging in the future.
   *
   *  If an error makes the game unplayable, produce a CRITICAL_ERROR
   *  and dump the details to the data/error directory as a .txt file.
   *  Exit the program once that is complete.
   * 
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

package system;

import java.io.File;

public class ProjectValidator {

   // Checks if specified directories exist
   public static boolean validate() {
      return (hasEntities() && hasStates() && hasData() && 
            hasJSON() && hasError() && hasAssets()
      );
   }

/* --------------------
    Directories in src 
   -------------------- */
   private static boolean hasEntities() {
      if(OS.isWindows()) {
         File entities = new File("src\\entities");
         return(entities.isDirectory());
      }

      // Unix/*nix OS
      else {
         File entities = new File("src/entities");
         return(entities.isDirectory());
      }
   }

   private static boolean hasStates() {
      if(OS.isWindows()) {
         File states = new File("src\\states");
         return(states.isDirectory());
      }

      // Unix/*nix OS
      else {
         File states = new File("src/states");
         return(states.isDirectory());
      }  
   }


/* ---------------------
    Directories in data 
   --------------------- */
   private static boolean hasData() {
      if(OS.isWindows()) {
         File data = new File("data");
         return(data.isDirectory());
      }

      // Unix/*nix OS
      else {
         File data = new File("data");
         return(data.isDirectory());
      }
   }

   private static boolean hasJSON() {
      if(OS.isWindows()) {
         File json = new File("data\\json");
         return(json.isDirectory());
      }

      // Unix/*nix OS
      else {
         File json = new File("data/json");
         return(json.isDirectory());
      }
   }

   private static boolean hasError() {
      if(OS.isWindows()) {
         File error = new File("data\\error");
         return(error.isDirectory());
      }

      // Unix/*nix OS
      else {
         File error = new File("data/error");
         return(error.isDirectory());
      }
   }

/* -----------------------
    Directories in assets 
   ----------------------- */
   private static boolean hasAssets() {
      if(OS.isWindows()) {
         File assets = new File("assets");
         return(assets.isDirectory());
      }

      // Unix/*nix OS
      else {
         File assets = new File("assets");
         return(assets.isDirectory());
      }
   }
}

