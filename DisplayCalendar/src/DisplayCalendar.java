

/*
 * Joshua Tucker
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
//import java.util.*;

public class DisplayCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int month;
		int year;
		int daysInMonth = 0;
		String monthName;
		int dayDisplay[][] = new int[5][7];
		//0-11
		//String months[] = {" ","Jan","Feb","Mar","Apr","May","Jun",
		//		"Jul","Aug","Sep","Oct","Nov","Dec"};
		
		//0-6
		String weekDays[]={"Sun","Mon","Tues","Wed","Thur","Fri","Sat" };
		
		System.out.println("Enter the month number");
		month=keyboard.nextInt()-1;
		System.out.println("Enter the year");
		year= keyboard.nextInt();
		keyboard.close();
		GregorianCalendar gc = new GregorianCalendar(year,month,1);
		
		//System.out.print(months[month]);
		switch(month){
		case 1 :monthName="January"; daysInMonth=30; 
		break;
		case 2 :monthName="February"; daysInMonth=28;
		break;
		case 3 :monthName="March"; daysInMonth=31;
		break;
		case 4 :monthName="April"; daysInMonth=30;
		break;
		case 5 :monthName="May"; daysInMonth=31;
		break;
		case 6 :monthName="June"; daysInMonth=30;
		break;
		case 7 :monthName="July"; daysInMonth=31;
		break;
		case 8 :monthName="August"; daysInMonth=31;
		break;
		case 9 :monthName="September"; daysInMonth=30;
		break;
		case 10 :monthName="October"; daysInMonth=31;
		break;
		case 11 :monthName="November"; daysInMonth=30;
		break;
		case 12 :monthName="December"; daysInMonth=31;
		break;
		default : monthName="";
		break;
		}
		int weekCount=0;
		int startDay = gc.get(Calendar.DAY_OF_WEEK)-1;
	
		
		System.out.println(monthName+" "+year);
		System.out.println(daysInMonth);
	   for(int i=0; i<7; i++) {
		   System.out.print(weekDays[i]+" ");
	   }
	   
	  // System.out.println("startDay="+startDay);
	   int k=1;
	     for (int w=0;w<5;w++){
		    for (int d=startDay;d<7;d++ ){
			   dayDisplay[w][d]=k;
			   k++;
		   }
		   startDay=0;
	   }
	     for (int w=0;w<5;w++){
			   System.out.println();
			   for (int d=0;d<7;d++ ){
			System.out.print(dayDisplay[w][d]+"  ");
				  
			   }
			   
		   }
	
//	   for(int i=0;i<daysInMonth;i++){
//		   dayDisplay[startDay][weekCount]=i;
//		   if (startDay==6){
//			   startDay=0;
//			   weekCount++;
//		   }
//		  startDay+=1;  
//	   }
//	    weekCount=1;
//	    startDay = 0;
//	    System.out.println();
//	for(int j=0;j<daysInMonth;j++){
//			  System.out.print(dayDisplay[startDay][weekCount]+" ");
//			  
//			   if (startDay==6){
//				   startDay=0;
//				   weekCount++;
//				   System.out.println();
//			   }  
//			    startDay++;
//		}
//	weekCount=0;
	}
}