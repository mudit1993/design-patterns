package adapter;

public class EmployeeAdapterCsv implements Employee {

	private EmployeeCsv employeeCsv;

	public EmployeeAdapterCsv(EmployeeCsv employeeCsv) {
		this.employeeCsv = employeeCsv;
	}

	public EmployeeCsv getEmployeeCsv() {
		return this.employeeCsv;
	}

	public String getId() {
		return employeeCsv.getId() + "";
	}

	public String getFirstName() {
		return employeeCsv.getFirstName();
	}

	public String getLastName() {
		return employeeCsv.getLastName();
	}

	public String getEmail() {
		return employeeCsv.getEmailAddress();
	}

}
