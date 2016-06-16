/*
 * 
 */
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DisplayCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int month;
		int year;
		
		String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Dec"};
		String weekDays[]={"Sun","Mon", };
		System.out.println("Enter the month number");
		month=keyboard.nextInt();
		System.out.println("Enter the year");
		year= keyboard.nextInt() - 1;
		keyboard.close();
		GregorianCalendar gc = new GregorianCalendar(year,month,1);
		
		
		
	}

}
