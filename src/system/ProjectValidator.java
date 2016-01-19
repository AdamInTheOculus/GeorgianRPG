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

   public static boolean validate() {
      return (hasEntities() && hasStates() && hasData() && 
            hasJSON() && hasError() && hasAssets()
      );
   }

/* --------------------
    Directories in src 
   -------------------- */
   private boolean hasEntities() {
      if(OS.isWindows()) {
         File entities = new File("..\\Entities");
      }

      // Unix/*nix OS
      else {
         File entities = new File("../Entities");
      }
      return(entities.isDirectory());
   }

   private boolean hasStates() {
      if(OS.isWindows()) {
         File states = new File("..\\States");
      }

      // Unix/*nix OS
      else {
         File states = new File("../States");
      }
      return(states.isDirectory());
   }


/* ---------------------
    Directories in data 
   --------------------- */
   private boolean hasData() {
      if(OS.isWindows()) {
         File data = new File("..\\..\\data");
      }

      // Unix/*nix OS
      else {
         File data = new File("../../data");
      }
      return(data.isDirectory());
   }

   private boolean hasJSON() {
      if(OS.isWindows()) {
         File json = new File("..\\..\\data\\json");
      }

      // Unix/*nix OS
      else {
         File json = new File("../../data/json");
      }
      return(json.isDirectory());
   }

   private boolean hasError() {
      if(OS.isWindows()) {
         File error = new File("..\\..\\data\\error");
      }

      // Unix/*nix OS
      else {
         File error = new File("../../data/error");
      }
      return(error.isDirectory());
   }

/* -----------------------
    Directories in assets 
   ----------------------- */
   private boolean hasAssets() {
      if(OS.isWindows()) {
         File assets = new File("..\\..\\assets");
      }

      // Unix/*nix OS
      else {
         File assets = new File("../../assets");
      }
      return(assets.isDirectory());
   }
}

