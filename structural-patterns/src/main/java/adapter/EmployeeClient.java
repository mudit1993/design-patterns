package adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new EmployeeDb("123", "John", "Watson", "john.watson@gmail.com"));

		EmployeeLdap employeeLdap = new EmployeeLdap("432", "Sherlock", "Holmes", "sherlock.holmes@gmail.com");
		employees.add(new EmployeeAdapterLdap(employeeLdap));
		EmployeeCsv employeeCsv = new EmployeeCsv("832,Jim,Moriarty,jim.moriarty@gmail.com");
		employees.add(new EmployeeAdapterCsv(employeeCsv));

		return employees;
	}

}
