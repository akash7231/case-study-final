package Implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import JavaBeans.Common_Employee;
import JavaBeans.Employee;
import JavaBeans.Joining_Emp;
import JavaBeans.Mbu_Employee;
import JdbcConnection.JdbcConnection;

public class DisplayEmpFormImpl {
	
	//@Override
	public ArrayList<Employee> forms(Employee reg) {
		
		ArrayList<Employee> display = new ArrayList<Employee>();
		Employee reg1 =null;
		Connection conn = JdbcConnection.getConnection();
		try {
			Statement st = conn.createStatement();
			String query = "select * from reg_employee";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()){
				
				 
				String name = rs.getString(1);
				String dob = rs.getString(2);
				String gender = rs.getString(3);
				String qualification = rs.getString(4);
				String skill = rs.getString(5);
				String bloodGroup = rs.getString(6);
				String emailId = rs.getString(7);
				String mobile = rs.getString(8);
				String address = rs.getString(9);
				String password=rs.getString(10);
				int app_id=rs.getInt(11);
				/*
				reg.setName(name);
				reg.setDob(dob);
				reg.setGender(gender);
				reg.setQualification(qualification);
				reg.setSkill(skill);
				//reg.setBlood_group(bloodGroup);
				reg.setEmail(emailId);
				reg.setMobile(mobile);
				//reg.setAddress(address);
*/				
				reg1 = new Employee(name, dob, gender, qualification, skill, bloodGroup, emailId, Long.parseLong(mobile), address, password,app_id); 
				
				display.add(reg1);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(reg1);
		return display;
	}
	
	
	

	public Joining_Emp getemp(String username, String password){
		
		Connection conn = JdbcConnection.getConnection();
		PreparedStatement pst = null;
		Joining_Emp je = null;
		String query="select * from date_employee where e_name=? and password=?";
		try {
			pst=conn.prepareStatement(query);
		
		pst.setString(1, username);
		pst.setString(2, password);
		System.out.println("3"+username + password);
		ResultSet rs= pst.executeQuery();
		while(rs.next()){
			System.out.println("4"+rs.getString(1));
			 
			String name = rs.getString(1);
			String dob = rs.getString(2);
			String gender = rs.getString(3);
			String qualification = rs.getString(4);
			String skill = rs.getString(5);
			
			String emailId = rs.getString(6);
			String mobile = rs.getString(7);
			String joining = rs.getString(8);
			String password1=rs.getString(10);
			int app_id=rs.getInt(9);
			
			je = new Joining_Emp(name, dob, gender, qualification, skill, emailId, Long.parseLong(mobile), app_id, joining, password1); 
			
		}} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return je;
		
	}


	//@Override
	public ArrayList<Common_Employee> forms1(Common_Employee ce) {
		// TODO Auto-generated method stub
ArrayList<Common_Employee> display = new ArrayList<Common_Employee>();
		
		Connection conn = JdbcConnection.getConnection();
		try {
			Statement st = conn.createStatement();
			String query = "select * from common_employee";
			ResultSet rs = st.executeQuery(query);
			System.out.println("common employee array list");
			while(rs.next()){
				
				 String emp_id=rs.getString(1);
				String name = rs.getString(2);
				String dob = rs.getString(3);
				String gender = rs.getString(4);
				String qualification = rs.getString(5);
				String skill = rs.getString(6);
				//String bloodGroup = rs.getString();
				String emailId = rs.getString(7);
				String mobile = rs.getString(8);
				String doj = rs.getString(9);
				String password=rs.getString(10);
				int app_id=rs.getInt(11);
				/*
				reg.setName(name);
				reg.setDob(dob);
				reg.setGender(gender);
				reg.setQualification(qualification);
				reg.setSkill(skill);
				//reg.setBlood_group(bloodGroup);
				reg.setEmail(emailId);
				reg.setMobile(mobile);
				//reg.setAddress(address);
*/				
				Common_Employee reg1 = new Common_Employee(emp_id, name, password, dob, gender, qualification, skill, app_id, emailId, Long.parseLong(mobile), doj); 
				
				display.add(reg1);
				
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(display);
		return display;
		
	}

	//public int aaa=0;	
	//@Override
	public ArrayList<Common_Employee> refer(Common_Employee ce) {
		// TODO Auto-generated method stub
		
ArrayList<Common_Employee> refdisplay = new ArrayList<Common_Employee>();
		
		Connection conn = JdbcConnection.getConnection();
		
		try {
			Statement st = conn.createStatement();
			String query = "select * from refer_employee";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()){
				
				 String emp_id=rs.getString(1);
				String name = rs.getString(2);
				//String dob = rs.getString(3);
				String gender = rs.getString(3);
				String qualification = rs.getString(4);
				String skill = rs.getString(5);
				//String bloodGroup = rs.getString();
				String emailId = rs.getString(6);
				//String mobile = rs.getString(8);
				String doj = rs.getString(7);
				//String password=rs.getString(10);
				//this.aaa=rs.getInt(11);
				/*
				reg.setName(name);
				reg.setDob(dob);
				reg.setGender(gender);
				reg.setQualification(qualification);
				reg.setSkill(skill);
				//reg.setBlood_group(bloodGroup);
				reg.setEmail(emailId);
				reg.setMobile(mobile);
				//reg.setAddress(address);
*/				
				//Common_Employee reg1 = new Common_Employee(emp_id, name, password, dob, gender, qualification, skill, app_id, emailId, Long.parseLong(mobile), doj); 
				
				Common_Employee ce1=new Common_Employee(emp_id, name, gender, qualification, skill, emailId, doj);
				
				refdisplay.add(ce1);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(display);
		return refdisplay;
		
		
		
	}


	//@Override
	public ArrayList<Mbu_Employee> alloted(Mbu_Employee me) {
ArrayList<Mbu_Employee> display = new ArrayList<Mbu_Employee>();
		
		Connection conn = JdbcConnection.getConnection();
		try {
			Statement st = conn.createStatement();
			String query = "select * from mbu_employee";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()){
				
				String emp_id=rs.getString(1);
				String name = rs.getString(2);	
				String gender = rs.getString(3);
				String doj = rs.getString(4);
				String sysid=rs.getString(5);
				
				Mbu_Employee mbu=new Mbu_Employee(emp_id, name, gender, doj, sysid);
				//me.setEmp_id(emp_id);
				//me.setName(name);
				//me.setGender(gender);
				//me.setDoj(doj);
				//me.setSysid(sysid);
			
				display.add(mbu);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(display);
		return display;
		
	}

}
