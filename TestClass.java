package DbUtils;

import java.sql.SQLException;

public class TestClass {

	public static void main(String[] args) {
		
		UserDb u = new UserDb();
		AdminDb a = new AdminDb();
		/*try {
			int ui = u.getUserId("Snehal");
			System.out.println(ui);
			
			int uv = u.updatedUserVisit("Snehal");
			System.out.println(uv);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		try {
			String output = a.registerAdmin("Name", "name", "n@gmail.com");
			System.out.println(output);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
