package piglet.piglet2spiglet;

import java.io.InputStream;

import piglet.*;
import piglet.syntaxtree.*;
import piglet.visitor.*;

/**
 * Compile Piglet code to Spiglet code.
 * 
 * @author jeff
 *
 */

public class Main {

	public static InputStream input = System.in;

	public static void main(String[] args) {
		try {
			new PigletParser(input);
			Node AST = PigletParser.Goal();
			// First pass: Get the maximum TempNo
			AST.accept(new GetMaxTempNo());

			// Second pass: Compile Piglet code to Spiglet code
			AST.accept(new Piglet2Spiglet());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
