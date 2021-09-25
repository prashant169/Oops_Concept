import java.util.*;
import java.util.Random;


public class EmployeeWages {
	Public static void main( String args[] ){
		System.out.println("Welcome To The Employee Wages");
		Attendance();
}		
public static void Attendance()
{
	int IsFullTime = 1;
	Random rn = new Random();
	int check= rn.nextInt(2);
	
	if(check == IsFullTime)
	{
		System.out.println("Employee Present.");
	}
	else
 	{
		System.out.println("Employee Absent.");
	}
}

} 




/*  uc2/Calculate Daily EmployeeWage


import java.util.Random;

	pblic class EmployeeWage {
	public static void main( String args[] ){
		System.out.println("Welcome To The Employee Wages");
		CalculateDailyWages();
}

public static void CalculateDailyWages()
{
	int IsFullTime = 1;
	Random rn = new Random();
	int check= rn.nextInt(2);
	int RatePerHour = 20;
	int FullDayHour = 8;
	int TotalWages = 0;
	if(check == IsFullTime)
	{
		System.out.println("Employee Present.");
		TotalWages = RatePerHour * FullDayHour;
		System.out.println("Daily Wages  : "+ TotalWages);
		
	}
	else
 	{
		System.out.println("Employee Absent.");
	}
}

} 




/* uc3 Calculate Part Time Wage


import java.util.Random;

public class EmployeeWages {
	public static void main( String args[] ){
		System.out.println("Welcome To The Employee Wages");
		CalculateDailyWages();
}

public static void CalculateDailyWages()
{
	int IsFullTime = 1;
	Random rn = new Random();
	int check= rn.nextInt(2);
	int RatePerHour = 20;
	int PartTimeHour = 4;
	int FullDayHour = 8;
	int TotalWages= 0;
	if(check == IsFullTime)
	{
		System.out.println("Employee Present.");
		TotalWages = RatePerHour * PartTimeHour;
		System.out.println("Daily PartTime Wages  : "+ TotalWages);
		
	}
	else
 	{
		System.out.println("Employee Absent.");
	}
 }

 }  


/* Uc4 Employee Wage Using Switch Case



import java.util.Random;
import java.util.Scanner;


public class EmployeeWages{
        public static void main( String []args )
        {
                System.out.println("Welcome");
                Jadeja();
        }
        static void Jadeja(){
                Scanner in = new Scanner(System.in);
                int PartTimeHour = 4;
                int RatePerHour = 20;
                int FullDayHour = 8;
                int Day = 0 ;
                Random rn = new Random ();
                int rand =rn.nextInt(3);
                        switch(rand){
                                        case 1:
                                                System.out.println("IT's Full Time Wages: ");
                                                System.out.println("Enter NUmber Of Working Day's: ");
                                                Day = in.nextInt();
                                                int FullTimeWages = RatePerHour * (FullDayHour * Day);
                                                System.out.println("FullTimeWages for " + Day +" Days: " + "Rs." + FullTimeWages);
                                                break;
                       
                                        case 2:
                                                System.out.println("IT's Part Time Wages: ");
                                                System.out.println("Enter Number Of Working Day's: ");
                                                Day = in.nextInt();
                                                int PartTimeWages = Day * PartTimeHour * FullDayHour;
                                                System.out.println("PartTimeWages for " + Day +" days: " + "Rs." + PartTimeWages);
                                                break;
                                        default:
                                                System.out.println("Employee is Absent..........!");
                                                break;
                                     }
                        in.close();
        		}
        }
