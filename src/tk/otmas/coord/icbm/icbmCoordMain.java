package tk.otmas.coord.icbm;

import java.util.Scanner;
import tk.otmas.util.secure.launchCodeGen;

public class icbmCoordMain {
	Scanner sc = new Scanner(System.in);
	
	public static void main() {
		System.out.println("Welcome, to the Otmas Industries Nuclear Launch Coordination system.");
		System.out.println("This copy is licensed to the USAF. Unauthorized use will be punished");
		System.out.println("Please enter your Government-issued launch code.");
		Class<launchCodeGen> code = launchCodeGen.class;
		System.out.println(code);
	}
}
