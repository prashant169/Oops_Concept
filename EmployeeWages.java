import java.util.*;
import java.util.Random;


public class EmployeeWages {
	public static void main( String args[] ){
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
