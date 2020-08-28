
public class EmployeeWages {
	public static void main(String args[]){
		
		//display welcome message
		System.out.println("Welcome to Employee Wage Computation");
		
		int IS_PART_TIME=0;
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		
		//variables
		int empHrs=0;
		int empWage=0;
		
		//random function to generate 0 or 1
		int empCheck = (int)Math.floor(Math.random()*10%2);
		
		//check employee is present or absent and assign empHrs
		if(empCheck == IS_FULL_TIME)
			empHrs=8;
		else if(empCheck == IS_PART_TIME)
			empHrs=4;
		else
			empHrs=0;
		
		//calculate employee wage
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Employee wage = "+empWage);
	}
}
