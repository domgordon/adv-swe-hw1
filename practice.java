import java.util.Scanner;
import java.text.DateFormatSymbols;

public class practice {
	public static void main(String[] args) {

		//get info from users
		Scanner in = new Scanner(System.in);
		System.out.println("What year would you like to know about?");
		int y = in.nextInt();

		int a = y % 19; //remainder of y/19 is a
		int b = y / 100; //b is quotient of y/100
		int c = y % 100; //remainder of y/100 is c
		int d = b / 4;
		int e = b % 4;
		int g = ( 8 * b + 13 ) / 25;
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;
		int k = c % 4;
		int m  = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		int n = (h - m + r + 90) / 25;
		int p = (h - m + r + n + 19) % 32;

		String month = new DateFormatSymbols().getMonths()[n-1];
		//changes int of months to month names

		System.out.println("In " + y + ", Easter Sunday fell on "
				+ month + " " + p + ".");
	}
}
