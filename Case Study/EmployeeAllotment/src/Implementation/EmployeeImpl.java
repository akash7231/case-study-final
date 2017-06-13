package Implementation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JavaBeans.Common_Employee;
import JavaBeans.Employee;
import JavaBeans.Joining_Emp;
import JdbcConnection.JdbcConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeImpl {
	
	//@Override
		public boolean insert(Employee p) {
			// TODO Auto-generated method stub
			Connection conn = JdbcConnection.getConnection();
			PreparedStatement pst;
			PreparedStatement pst1;
			String role = "user";
			/*
			 * Random rand = new Random();
			 * 
			 * int n = rand.nextInt(9999) + 1000;
			 */
			String query1 = "insert into login values(?,?,?)";

			String query = "insert into reg_employee values(?,?,?,?,?,?,?,?,?,?,?)";

			try {

				pst1 = conn.prepareStatement(query1);
				pst1.setString(1, p.getName());
				pst1.setString(2, p.getPassword());
				pst1.setString(3, role);
				int rec = pst1.executeUpdate();

				pst = conn.prepareStatement(query);
				pst.setString(1, p.getName());
				//SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
				
				//java.sql.Date sd = null;
				//try {
					//java.util.Date ud = sf.parse(p.getDob());
					//sd = new java.sql.Date(ud.getTime());
				//} catch (ParseException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				//}
				//;

				pst.setString(2, p.getDob());
				pst.setString(3, p.getGender());

				pst.setString(4, p.getQualification());
				pst.setString(5, p.getSkill());
				pst.setString(6, p.getBlood_group());
				pst.setString(7, p.getEmail());

				pst.setLong(8, p.getMobile());
				pst.setString(9, p.getAddress());
				pst.setString(10, p.getPassword());
				pst.setInt(11, p.getApplication_id());
				rec = pst.executeUpdate();
				if (rec == 1) {

					return true;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			return true;

		}
		
		//@Override
				public boolean insertCommonEmployee(Common_Employee ce) {
					// TODO Auto-generated method stub

					Connection conn = JdbcConnection.getConnection();
					PreparedStatement pst;

					String query = "insert into common_employee values(?,?,?,?,?,?,?,?,?,?,?)";

					try {

						pst = conn.prepareStatement(query);
						pst.setString(1, ce.getEmp_id());
						pst.setString(2, ce.getName());
						//SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
						//java.sql.Date sd = null;
						//java.sql.Date sd1 = null;
						//try {
							//java.util.Date ud = sf.parse(ce.getDob());
							//sd = new java.sql.Date(ud.getTime());
						//} catch (ParseException e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
						//}
						//;

						pst.setString(3, ce.getDob());
						pst.setString(4, ce.getGender());

						pst.setString(5, ce.getQualification());
						pst.setString(6, ce.getSkill());

						pst.setString(7, ce.getEmail());

						pst.setLong(8, ce.getMobile());

						//try {
							//java.util.Date ud1 = sf.parse(ce.getDoj());
							//sd1 = new java.sql.Date(ud1.getTime());
						//} catch (ParseException e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
						//}
						//;
						pst.setString(9, ce.getDoj());
						pst.setString(10, ce.getPassword());
						pst.setInt(11, ce.getApplication_id());

						int rec = pst.executeUpdate();
						if (rec == 1) {

							return true;
						}

					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						try {
							conn.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

					return true;

				}
				
				public boolean insertCommonEmployee1(Common_Employee ce) {
					// TODO Auto-generated method stub

					Connection conn = JdbcConnection.getConnection();
					PreparedStatement pst;

					String query = "insert into common_employee1 values(?,?,?,?,?,?,?,?,?,?,?)";

					try {

						pst = conn.prepareStatement(query);
						pst.setString(1, ce.getEmp_id());
						pst.setString(2, ce.getName());
						//SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
						//java.sql.Date sd = null;
						//java.sql.Date sd1 = null;
						//try {
							//java.util.Date ud = sf.parse(ce.getDob());
							//sd = new java.sql.Date(ud.getTime());
						//} catch (ParseException e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
						//}
						//;

						pst.setString(3, ce.getDob());
						pst.setString(4, ce.getGender());

						pst.setString(5, ce.getQualification());
						pst.setString(6, ce.getSkill());

						pst.setString(7, ce.getEmail());

						pst.setLong(8, ce.getMobile());

						//try {
							//java.util.Date ud1 = sf.parse(ce.getDoj());
							//sd1 = new java.sql.Date(ud1.getTime());
						//} catch (ParseException e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
						//}
						//;
						pst.setString(9, ce.getDoj());
						pst.setString(10, ce.getPassword());
						pst.setInt(11, ce.getApplication_id());

						int rec = pst.executeUpdate();
						if (rec == 1) {

							return true;
						}

					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						try {
							conn.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

					return true;

				}


		//@Override
		public List<Employee> display() {
			// TODO Auto-generated method stub
			ArrayList<Employee> aList = new ArrayList<Employee>();
			Connection conn = JdbcConnection.getConnection();
			String query = "select * from reg_employee";
			PreparedStatement pst;
			try {
				pst = conn.prepareStatement(query);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					String m_name = rs.getString(1);
					String m_dob = rs.getString(2);
					String m_gender = rs.getString(3);
					/* java.sql.Date sd=rs.getDate(4); */
					String m_qualification = rs.getString(4);
					String m_skill = rs.getString(5);
					String m_blood_group = rs.getString(6);
					String m_email_id = rs.getString(7);
					String m_mobile = rs.getString(10);
					String m_address = rs.getString(9);
					String m_password = rs.getString(10);
					String m_app_id = rs.getString(11);

					// Employee e= new Employee(m_name, m_dob, m_gender,
					// m_qualification, m_skill, m_qualification, m_email_id,
					// Integer.parseInt(m_mobile), m_address, m_password);
					Employee e = new Employee(m_name, m_dob, m_gender,
							m_qualification, m_skill, m_blood_group, m_email_id,
							Integer.parseInt(m_mobile), m_address, m_password,
							Integer.parseInt(m_app_id));
					aList.add(e);

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			return aList;

		}

		//@Override
		public boolean insertDate(Joining_Emp je) {
			// TODO Auto-generated method stub

			Connection conn = JdbcConnection.getConnection();
			PreparedStatement pst;

			String query = "insert into date_employee values(?,?,?,?,?,?,?,?,?,?)";

			try {

				pst = conn.prepareStatement(query);
				pst.setString(1, je.getName());
				//SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				//SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
				//java.sql.Date sd = null;
				//java.sql.Date sd1 = null;
				//System.out.println("DOB BEFORE = "+je.getDob() );
				
				//try {
					//java.util.Date ud = sf1.parse(je.getDob());
					//sd = new java.sql.Date(ud.getTime());
				//} catch (ParseException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				//}
				//;

				pst.setString(2, je.getDob());
				pst.setString(3, je.getGender());

				pst.setString(4, je.getQualification());
				pst.setString(5, je.getSkill());

				pst.setString(6, je.getEmail());

				pst.setLong(7, je.getMobile());
				pst.setInt(9, je.getApplication_id());
				//try {
					//java.util.Date ud1 = sf.parse(je.getJoiningDate());
					//sd1 = new java.sql.Date(ud1.getTime());
				//} catch (ParseException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				//}
				//;
				pst.setString(8, je.getJoiningDate());
				pst.setString(10, je.getPassword());
				int rec = pst.executeUpdate();
				if (rec == 1) {

					return true;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			return true;

		}

		
		//@Override
		public boolean deleteDate(int application_id) {

			Connection conn = JdbcConnection.getConnection();
			PreparedStatement pst = null;
			String query="delete from reg_employee where app_id=?";
			
			System.out.println(application_id);
			try {
				pst=conn.prepareStatement(query);
				pst.setInt(1, application_id);
				
				int rec = pst.executeUpdate();
				
				System.out.println("no of records deleted"+rec);
				
				if(rec >0){
					
					System.out.println("Record deleted");
					
					return true;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				return false;
			
		}

		
		//@Override
		public boolean insertReferEmployee(Common_Employee ce) {
			// TODO Auto-generated method stub

			Connection conn = JdbcConnection.getConnection();
			PreparedStatement pst;

			String query = "insert into refer_employee values(?,?,?,?,?,?,?)";

			try {

				pst = conn.prepareStatement(query);
				pst.setString(1, ce.getEmp_id());
				pst.setString(2, ce.getName());

				/*
				 * try { java.util.Date ud=sf.parse(ce.getDoj()); sd=new
				 * java.sql.Date(ud.getTime()); } catch (ParseException e) { // TODO
				 * Auto-generated catch block e.printStackTrace(); };
				 * 
				 * 
				 * pst.setDate(7,sd);
				 */
				pst.setString(3, ce.getGender());

				pst.setString(4, ce.getQualification());
				pst.setString(5, ce.getSkill());

				pst.setString(6, ce.getEmail());

				// pst.setLong(8, ce.getMobile());
				//SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
				// java.sql.Date sd=null;
				//java.sql.Date sd1 = null;

				//try {
					//java.util.Date ud1 = sf.parse(ce.getDoj());
					//sd1 = new java.sql.Date(ud1.getTime());
				//} catch (ParseException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				//}
				//;
				pst.setString(7, ce.getDoj());
				/*
				 * pst.setString(10,ce.getPassword());
				 * pst.setInt(11,ce.getApplication_id());
				 */

				int rec = pst.executeUpdate();
				if (rec == 1) {

					return true;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			return true;

		}

		
		public boolean deleteCommonEmployee(int app_id) {
			Connection conn=JdbcConnection.getConnection();;
			PreparedStatement pst = null;
			String query="delete from common_employee where app_id=?";
			
			try {
				pst=conn.prepareStatement(query);
				pst.setInt(1, app_id);
				
				int rec = pst.executeUpdate();
				
				if(rec >0){
					System.out.println("Record deleted");
					return true;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			return false;
		}

}
