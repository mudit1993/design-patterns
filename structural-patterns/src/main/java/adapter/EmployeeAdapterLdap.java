package adapter;

public class EmployeeAdapterLdap implements Employee {
	
	EmployeeLdap employeeLdap;
	
	public EmployeeAdapterLdap(EmployeeLdap employeeLdap){
		this.employeeLdap = employeeLdap;
	}
	
	public String getId() {
		return employeeLdap.getCn();
	}

	public String getFirstName() {
		return employeeLdap.getGivenName();
	}

	public String getLastName() {
		return employeeLdap.getSurName();
	}

	public String getEmail() {
		return employeeLdap.getMail();
	}
	
//	public String toString() {
//		return "ID : " + employeeLdap.getCn();
//	}

}
