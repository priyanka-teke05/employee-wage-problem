
public class EmployeeWages {
	//constants
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	
	public final int empRatePerHr;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	
	public EmployeeWages(int numOfWorkingDays, int empRatePerHr, int maxHoursPerMonth) {
		this.empRatePerHr=empRatePerHr;
		this.maxHoursPerMonth=maxHoursPerMonth;
		this.numOfWorkingDays=numOfWorkingDays;
	}
	
	public void employeeWage() {
		//variables
		int totalWage=0;
		int totalHrs=0;
		int totalDays=0;
		
		while(totalHrs<=maxHoursPerMonth && totalDays<numOfWorkingDays) {
			//local variable
			int empHrs=0;
			int empWage=0;
			
			int empCheck = (int)Math.floor(Math.random()*10)%3;			
			totalDays++;
			
			//check employee is part time or full time and assign hours
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
			
			//computations
			totalHrs=totalHrs+empHrs;
			empWage=empHrs*empRatePerHr;
			totalWage=totalWage+empWage;
			System.out.println("Employee wage : day "+totalDays+" : "+empWage);
		}
		//display total hours and wages
		System.out.println("Total Hours : "+totalHrs);	
		System.out.println("Total wage : "+totalWage);	
	}
	public static void main(String args[]) {
		
		//display welcome message
		System.out.println("Welcome to Employee Wage Computation");
		EmployeeWages emp=new EmployeeWages(20,20,100);
		emp.employeeWage();	
	}
}
