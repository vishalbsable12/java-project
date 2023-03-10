package ScannerObj;

import java.util.Scanner;

public class ScannerClass {
	static Scanner sc;

	public static Scanner getScanner() {
		if (sc == null) {
			sc = new Scanner(System.in);
		} else {
			return sc;
		}
		return sc;
	}

}
