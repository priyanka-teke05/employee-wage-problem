public class EmpWageBuilder {
	
	static int i=0;
	
	//array of objects for multiple companies
	CompanyEmpWage[] companies = new CompanyEmpWage[4];
	
	public void empWageDetails(String company, int numOfWorkingDays, int empRatePerHr, int maxHoursPerMonth) {
		companies[i]=new CompanyEmpWage(company, numOfWorkingDays,empRatePerHr,maxHoursPerMonth);
		companies[i].companyWage();
		i++;
	}
}
