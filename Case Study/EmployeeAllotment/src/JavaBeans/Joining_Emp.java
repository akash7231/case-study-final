package JavaBeans;

public class Joining_Emp {
	private String name;
	
	public Joining_Emp(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	private String dob;
	private String gender;
	private String qualification;
	private String skill;
	//private String blood_group;
	private String email;
	private long mobile;
	private int application_id;
	private String joiningDate;
	private String password;

	
	public Joining_Emp(String name, String dob, String gender,
			String qualification, String skill, String email, long mobile,
			int application_id, String joiningDate, String password) {
		super();
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.qualification = qualification;
		this.skill = skill;
		this.email = email;
		this.mobile = mobile;
		this.application_id = application_id;
		this.joiningDate = joiningDate;
		this.password = password;
	}
	public Joining_Emp() {
		super();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	/*public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}*/
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

	public int getApplication_id() {
		return application_id;
	}
	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	
	
}
