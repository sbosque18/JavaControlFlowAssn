package controlFlow;

public class AsciiChars {
	public static void printNumbers() {
	// valid numeric input
	// numbers range is 48 - 57
		for(int i = 48; i < 58; i++) {
			System.out.printf("%c, ", i);
		}
		System.out.printf("\n"); //simply adds a new line
	}

	public static void printLowerCase() {
	// valid lowercase alphabetic input
	// lowalpha range is 97 - 122
		for(int j = 97; j < 123; j++) {
			System.out.printf("%c, ", j);
		}
		System.out.printf("\n"); //simply adds a new line
	}

	public static void printUpperCase() {
	// valid uppercase alphabetic input
	// upperalpha range is 65 - 90
		for(int k = 65; k < 91; k++) {
			System.out.printf("%c, ", k);
		}
		System.out.printf("\n"); //simply adds a new line
	}
}