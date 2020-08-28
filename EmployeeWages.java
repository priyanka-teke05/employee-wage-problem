
public class EmployeeWages {
	public static void main(String args[]) {
		//display welcome message
		System.out.println("Welcome to Employee Wage Computation");
		
		EmpWageBuilder dmart=new EmpWageBuilder("D-mart",20,20,100);
		EmpWageBuilder baggit=new EmpWageBuilder("Baggit",20,20,100);
		EmpWageBuilder reliance=new EmpWageBuilder("Reliance",20,20,100);
		dmart.companyWage();
		baggit.companyWage();
		reliance.companyWage();
	}
}
