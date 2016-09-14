package DbUtils;

import java.sql.*;

public class MyConnector {

	public Connection conn() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
		return con;
	}
}
