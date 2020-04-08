package memento;

//originator
public class Employee {

	private String name;
	private String address;
	private String phone;

	public Employee(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

	public EmployeeMemento save() {
		return new EmployeeMemento(this.name, this.phone);
	}

	public void revert(EmployeeMemento employeeMemento) {
		this.name = employeeMemento.getName();
		this.phone = employeeMemento.getPhone();
	}
}
