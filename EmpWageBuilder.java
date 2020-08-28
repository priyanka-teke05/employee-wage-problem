
public class EmpWageBuilder {
	//constants
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	
	public String company; 
	public final int empRatePerHr;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	
	public EmpWageBuilder(String company, int numOfWorkingDays, int empRatePerHr, int maxHoursPerMonth) {
		this.company=company;
		this.empRatePerHr=empRatePerHr;
		this.maxHoursPerMonth=maxHoursPerMonth;
		this.numOfWorkingDays=numOfWorkingDays;
	}
	
	public void companyWage() {
		//variables
		int totalWage=0;
		int totalHrs=0;
		int totalDays=0;
		
		System.out.println("Employee details of "+company);
		
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
					empHrs=0;
					break;
			}
			
			//computations
			totalHrs=totalHrs+empHrs;
			empWage=empHrs*empRatePerHr;
			totalWage=totalWage+empWage;
			System.out.println("day : "+totalDays+" Employee Wage : "+empWage);
		}
		//display total hours and wages
		System.out.println("Total Hours : "+totalHrs);	
		System.out.println("Total wage : "+totalWage);	
	}
}
