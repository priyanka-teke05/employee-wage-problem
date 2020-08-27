public class EmployeeWage {
	public static void main(String[] args) {
		
		//Random function to get 0 or 1
		int empCheck = (int)Math.floor(Math.random()*10)%2;
		
		//Check employee is present or absent
		if(empCheck == 0)
			System.out.println("Employee is Absent");
		else
			System.out.println("Employee is present");
	}
}
