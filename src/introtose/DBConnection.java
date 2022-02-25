package introtose;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
	private String url="jdbc:postgresql://localhost:5432/example_psql";
	private String user="postgres";
	private String password="HungLQ2001";
	private void connect() {
		try(Connection conn=DriverManager.getConnection(url, user, password)){
			if(conn!=null) {
				System.out.println("Connection successful");
			}else {
				System.out.println("Connection failed");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[]args) {
		DBConnection test_dbconnection=new DBConnection();
		test_dbconnection.connect();
	}
}
