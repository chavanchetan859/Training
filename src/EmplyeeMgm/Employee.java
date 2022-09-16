package EmplyeeMgm;

public class Employee{
	
	String name;
	int empId;
	int exp;
	
	
	public Employee(String name, int empId, int exp) {
		super();
		this.name = name;
		this.empId = empId;
		this.exp = exp;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
}
