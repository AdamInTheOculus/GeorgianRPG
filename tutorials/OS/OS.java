/**
 *  We need to determine the user's operating system since we are dealing 
 *  with file pathnames. Windows pathnames are different than Unix/Unix-like
 *  pathnames so this class will help determine how the pathnames will be
 *  structured. This will only be used once at the beginning of the program.
 */


public class OS {

	private static String name = null;

	private static String getOSName() {
		// If no name is assigned, get our OS name
		if(name == null) {
			name = System.getProperty("os.name");
		}
		return name;
	}

	public static boolean isUnix() {
		return getOSName().startsWith("Unix");
	}

	public static boolean isLinux() {
		return getOSName().startsWith("Linux");
	}

	public static boolean isWindows() {
		return getOSName().startsWith("Windows");
	}

	public static boolean isMac() {
		return getOSName().startsWith("Mac");
	}

	/*  ___________________________________________
	 *  REMOVE MAIN METHOD BEFORE ADDING TO PROJECT 
	 */
	public static void main(String[] args) {
		if(isLinux())
			System.out.println("You are running Linux.");
		else if(isWindows())
			System.out.println("You are running Windows.");
		else if(isMac())
			System.out.println("You are running Mac.");
		else
			System.out.println("Unable to determine your OS.");
	}
}