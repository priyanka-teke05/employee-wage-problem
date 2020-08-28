
public class EmployeeWages {
	static int i=0;
	EmpWageBuilder[] empDetails=new EmpWageBuilder[4];
	public static void main(String args[]) {
		
		//display welcome message
		System.out.println("Welcome to Employee Wage Computation");
		
		EmpWageBuilder emp = new EmpWageBuilder();
		
		//different companies employee details
		emp.empWageDetails("D-mart",20,20,100);
		emp.empWageDetails("Baggit",20,20,100);
		emp.empWageDetails("Reliance",20,20,100);
		emp.empWageDetails("Big-Bazar",20,20,100);
	
	}
}
