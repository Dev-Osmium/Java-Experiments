package tk.otmas.svd.nk;

import java.util.Scanner;

/**
 * Created by Owen Salter on 10/27/2016.
 */
public class nkMain {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("Dialing....");
		System.out.println("Connection Established");
		System.out.println("LOGON:");
		String logon;
		logon = sc.next();
		switch (logon) {
			case "Hacker" :
				System.out.println("Access Granted");
				nkMain.optionPicker();
				break;
			default:
				System.exit(0);

		}
		

	}
	public static void optionPicker() {
		System.out.println("Welcome, Glorious Leader.");
		System.out.println("This is the Main server for the North Korean Military");
		System.out.println("Which subservice would you like to access?");
		System.out.println("1. Supply Requisition");
		System.out.println("2. ICBM aiming");
		System.out.println("3. Nuclear Weapons");
		System.out.println("4. [CLASSIFIED]");
		int service;
		service = sc.nextInt();
		
		switch (service) {
		case 2:
			nkIcbm.Icbm();
		case 4:
			NkTroll.troll();
		}
		}
}
