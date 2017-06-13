package Implementation;

public class MBU_Employee {
	
	private String emp_id;
	private String e_name;
	private String gender;
	private String doj;
	private String system_id;
	public MBU_Employee(String emp_id, String e_name, String gender, String doj,
			String system_id) {
		super();
		this.emp_id = emp_id;
		this.e_name = e_name;
		this.gender = gender;
		this.doj = doj;
		this.system_id = system_id;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
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
	public String getSystem_id() {
		return system_id;
	}
	public void setSystem_id(String system_id) {
		this.system_id = system_id;
	}

}
