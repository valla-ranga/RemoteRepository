package jdbc;
import java.sql.*;
public class JDBCTest {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//STEP-3: CREATING A CONN OBJECT
			//API:DB:Driver:Server:port:instanceName
			String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
			String userName = "hr";
			String pwd = "hr";
			
			Connection con = DriverManager.getConnection(url, userName, pwd);
			con.setAutoCommit(false);
			//STEP-4: CREATE A STATEMENT and execute
			
			Statement stmt = con.createStatement();
			String sql = "select * from  countries";
			
			ResultSet rSet = stmt.executeQuery(sql);
			
			//rSet.getRow();
			// STEP5: Extracting the result set
			while(rSet.next()){
				
				int empId = rSet.getInt(3);
				String fnme = rSet.getString(2);
				
				System.out.println(empId + "----" + fnme);
			}
			
			// STep-6 close the connections
			stmt.close();
			con.close();
			
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}