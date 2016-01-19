/**
 *  We need to determine the user's operating system since we are dealing 
 *  with file pathnames. Windows pathnames are different than Unix/Unix-like
 *  pathnames so this class will help determine how the pathnames will be
 *  structured. This will only be used once at the beginning of the program.
 */

package system;

public class OS {

	private String name = null;

	private static String getOSName() {
		// If no name is assigned, get our OS name
		if(name == null) {
			System.out.println("Assigning OS name. Should only appear once");
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
}