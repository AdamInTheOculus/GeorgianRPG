/**
 *  We need to determine the user's operating system since we are dealing 
 *  with file pathnames. 
 *
 */


public class OS {

	private static String name = null;

	public static String getOSName() {
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
	}
}