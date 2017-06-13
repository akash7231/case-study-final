package Implementation;

import java.sql.*;

import JdbcConnection.JdbcConnection;

public class HrImpl {

	Connection conn;
	ResultSet rs;
	PreparedStatement pst;
	PreparedStatement pst1;
	
	//@Override
	public boolean SendJoining(int id) {
		// TODO Auto-generated method stub
		
		//String m_date=request.getParameter("joiningDate");

		int result=0;
		conn= JdbcConnection.getConnection();
		String query ="SELECT * FROM reg_employee WHERE application_id=?";
		
		try {
			pst=conn.prepareStatement(query);
			pst.setInt(1, id);
			
			rs=pst.executeQuery();
			String name = null;
			while(rs.next()){
				 name = rs.getString("E_NAME");
				
			}
			
			String query1 = "INSERT INTO date_EMPLOYEE VALUES(?,?,?,?,?,?,?,?,?,?,?)";
			
			pst1=conn.prepareStatement(query1);
			pst1.setInt(1, id);
			pst1.setString(2, name);
			
			result=pst1.executeUpdate();
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	//@Override
	public boolean delete(String id) {
		conn=JdbcConnection.getConnection();
		String query="DELETE FROM REG_EMPLOYEE WHERE APP_ID=?";
		String query1="DELETE FROM DATE_EMPLOYEE WHERE APP_ID=?";
		
		
		System.out.println("id"+id);
		try {
			pst=conn.prepareStatement(query);
			pst1=conn.prepareStatement(query1);
			pst.setString(1, id);
			pst1.setString(1, id);
			
			int result=pst.executeUpdate();
			int result1=pst1.executeUpdate();
			
			if(result>0){
				System.out.println("record deleted");
				return true;
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	
	}

}
