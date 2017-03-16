package tk.otmas.svd.nk;
import java.util.Scanner;
import tk.otmas.*;
import tk.otmas.coord.icbm.icbmCoordMain;
@SuppressWarnings("unused")
public class nkIcbm {
	static Scanner sc = new Scanner(System.in);
	public static void Icbm() {
		System.out.println("Welcome to the North Korean ICBM aiming system.");
		System.out.println("Please choose from the list of enemies below.");
		System.out.println("1. USA");
		System.out.println("2. UK");
		int target;
		target = sc.nextInt();
		System.out.println("I'm sorry, but we have no ICBMs");
		icbmCoordMain.main();
	}
}
