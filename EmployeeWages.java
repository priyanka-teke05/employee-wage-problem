
public class EmployeeWages {
	//constants
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;

	public static void main(String args[]) {
		
		//display welcome message
		System.out.println("Welcome to Employee Wage Computation");
		
		//variables
		int empHrs=0;
		int empWage=0;
		
		//random function to generate 1 or 2
		int empCheck = (int)Math.floor(Math.random()*10)%3;

		//check employee is present or absent and assign empHrs
		switch(empCheck) {
			case IS_FULL_TIME:
				empHrs=8;
				break;
			case IS_PART_TIME:
				empHrs=4;
				break;
			default:
				break;
		}
		
		//calculate employee wage
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Employee wage = "+empWage);
	}
}
