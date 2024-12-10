package Day13;

public class Employee {
	private String name;
	private String department;
	private long mobileNumber;
    private int idNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public Employee() {
		super();
	}
	public Employee(String name, String department, long mobileNumber, int idNumber) {
		super();
		this.name = name;
		this.department = department;
		this.mobileNumber = mobileNumber;
		this.idNumber = idNumber;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", mobileNumber=" + mobileNumber
				+ ", idNumber=" + idNumber + "]";
	}
    
}
