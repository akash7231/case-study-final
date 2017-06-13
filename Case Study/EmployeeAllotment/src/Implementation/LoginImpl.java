package Implementation;

import java.sql.*;


import JavaBeans.Login;
import JdbcConnection.*;



public class LoginImpl {
	
	//@Override
		public String validateUser(Login login) {
			
	        Connection conn = JdbcConnection.getConnection();
	        PreparedStatement pst=null;
	        
	        String query="select * from login where username=? and password=?";
	        String role ="";
	        try {
				pst=conn.prepareStatement(query); 
				
				pst.setString(1, login.getUserName());
				pst.setString(2, login.getPassword());
				ResultSet rs = pst.executeQuery();
				if(rs.next()==true)
				{
				    role=rs.getString(3);
				return role;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return role;
		
		}

}
