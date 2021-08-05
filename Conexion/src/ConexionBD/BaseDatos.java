package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class BaseDatos {
	public static void main(String[] args) throws SQLException {
		System.out.print("");
		conectar();
	}
	
	public static Connection conectar() throws SQLException {
		Connection con = null;
		final String url = "jdbc:mysql://localhost:3306/pruebjava";
		final String user = "root";
		final String pass = "";
		final String driver = "com.mysql.jdbc.Driver";
		
		try {
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url,user,pass);
			
			if(!con.isClosed()) {
				System.out.println("Base de datos conection...");
			}
		}catch(Exception e) {
			System.err.println("Exception: "+ e.getMessage());
		}finally {
			try {
				if(con != null) {
					con.close();
				  }
				}catch(SQLException e) {
					System.err.println("Exception: "+ e.getMessage());
			}
		}
		PreparedStatement stm = (PreparedStatement) con.prepareStatement("SELECT * FROM usuarios");
		return con;
	}
	
	

}
