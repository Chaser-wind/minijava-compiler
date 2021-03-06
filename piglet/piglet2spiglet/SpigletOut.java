package piglet.piglet2spiglet;

/**
 * Print formatted Spiglet code.
 * 
 * @author jeff
 *
 */
public class SpigletOut {
	public static int indent = 0;
	static boolean newLine = false;

	public static void print(String s) {
		if (newLine) {
			for (int i = 0; i < indent; i++)
				System.out.print("\t");
			newLine = false;
		}
		System.out.print(s + " ");
	}

	public static void println(String s) {
		if (newLine) {
			for (int i = 0; i < indent; i++)
				System.out.print("\t");
		}
		System.out.println(s);
		newLine = true;
	}

	public static void println() {
		System.out.println();
		newLine = true;
	}

	public static void printLabel(String s) {
		System.out.print(s);
	}

	public static void begin() {
		println("BEGIN");
		indent++;
	}

	public static void beginMain() {
		println("MAIN");
		indent++;
	}

	public static void end() {
		indent--;
		print("END");
	}
}
