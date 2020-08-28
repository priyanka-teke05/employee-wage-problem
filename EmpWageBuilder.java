import java.util.*;
class EmpWageBuilder {
	
	ArrayList<CompanyEmpWage> companies = new ArrayList<CompanyEmpWage>();
	
	public void empWageDetails(String company, int numOfWorkingDays, int empRatePerHr, int maxHoursPerMonth) {
		companies.add(new CompanyEmpWage(company,numOfWorkingDays,empRatePerHr,maxHoursPerMonth));
		
		CompanyEmpWage e=companies.get(companies.size()-1);
		e.companyWage();
	}
}
