package JavaBeans;

public class Common_Employee {
	private String emp_id;
	private String name;
	private String password;
	private String dob;
	private String gender;
	private String qualification;
	private String skill;
	private int application_id;
	private String email;
	private long mobile;
	private String doj;
	public Common_Employee() {
		super();
	}
	public Common_Employee(String emp_id, String name, String password,
			String dob, String gender, String qualification, String skill,
			int application_id, String email, long mobile, String doj) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.password = password;
		this.dob = dob;
		this.gender = gender;
		this.qualification = qualification;
		this.skill = skill;
		this.application_id = application_id;
		this.email = email;
		this.mobile = mobile;
		this.doj = doj;
	}
	public Common_Employee(String emp_id, String name, String gender,
			String qualification, String skill, String email, String doj) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.gender = gender;
		this.qualification = qualification;
		this.skill = skill;
		this.email = email;
		this.doj = doj;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getApplication_id() {
		return application_id;
	}
	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	
	
}
