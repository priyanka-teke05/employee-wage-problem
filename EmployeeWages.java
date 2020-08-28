
public class EmployeeWages {
	//constants
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;
	
	public static void main(String args[]) {
		
		//display welcome message
		System.out.println("Welcome to Employee Wage Computation");
		
		//variables
		int totalWage=0;
		int totalHrs=0;
		int totalDays=0;
		
		while(totalHrs<=MAX_HRS_IN_MONTH && totalDays<NUM_OF_WORKING_DAYS) {
			int empHrs=0;
			int empWage=0;
			int empCheck = (int)Math.floor(Math.random()*10)%3;
			
			totalDays++;
			
			//check employee is parttime or fulltime and assign hours
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
			totalHrs=totalHrs+empHrs;
			empWage=empHrs*EMP_RATE_PER_HOUR;
			totalWage=totalWage+empWage;
			System.out.println("Employee wage : day "+totalDays+" : "+empWage);
		}
		System.out.println("Total Hours : "+totalHrs);	
		System.out.println("Total wage : "+totalWage);	
	}
}
