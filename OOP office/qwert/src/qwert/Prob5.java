package qwert;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		double bal = 550;
		double rate = 16;
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		bal = bal + in;
		bal = bal + (bal * rate) / 100;
		System.out.println(bal);
		scan.close();
	}

}
