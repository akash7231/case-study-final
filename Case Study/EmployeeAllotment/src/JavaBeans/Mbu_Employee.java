package JavaBeans;

public class Mbu_Employee {
	

	private String emp_id;
	private String name;
	private String gender;
	private String doj;
	private String sysid;
	
	
	
	
	public Mbu_Employee() {
		super();
	}
	public Mbu_Employee(String emp_id, String name, String gender, String doj,
			String sysid) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.gender = gender;
		this.doj = doj;
		this.sysid = sysid;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getSysid() {
		return sysid;
	}
	public void setSysid(String sysid) {
		this.sysid = sysid;
	}
	
	
	
	
}
