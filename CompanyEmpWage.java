import java.util.*;
class CompanyEmpWage {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	
	//variables
	public String company; 
	public int empRatePerHr;
	public int numOfWorkingDays;
	public int maxHoursPerMonth;
	public int totalWage=0;
	public int empWage=0;
	public int totalDays=0;
	
	//hash map to store day and daily wages
	HashMap<Integer, Integer>dailyWage=new HashMap<Integer, Integer>();
	
	//hash map to store company and total wage
	HashMap<String, Integer>totalWages=new HashMap<String, Integer>();
	
	public CompanyEmpWage(String company, int numOfWorkingDays, int empRatePerHr, int maxHoursPerMonth) {
		this.company=company;
		this.empRatePerHr=empRatePerHr;
		this.maxHoursPerMonth=maxHoursPerMonth;
		this.numOfWorkingDays=numOfWorkingDays;
	}
	
	public void companyWage() {
		//variables	
		int totalHrs=0;
		
		System.out.println("Employee details of "+company);
		
		while(totalHrs<=maxHoursPerMonth && totalDays<numOfWorkingDays) {
			//local variable
			int empHrs=0;
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
			
			//add day and daily wage
			dailyWage.put(totalDays, empWage);
		}
		//add company and total wage
		totalWages.put(company, totalWage);
	}
	
	//function to display day and daily wages
	public void printDailyWage() {
		for(int i:dailyWage.keySet()) {
			System.out.println("Day "+i+" : "+dailyWage.get(i));
		}
	} 
	
	//function to display total wages by company
	public void companyTotalWage() {
		System.out.println("Total wage of company : "+totalWages);
	}
}
