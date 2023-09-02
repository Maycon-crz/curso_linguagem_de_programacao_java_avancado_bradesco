package javajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Bancoacesso{
	public static void main(String[] args) throws Exception{
		String sql = "select codigo, nome, sexo from PESSOA";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		
		Connection con = DriverManager.getConnection(url, "system", "root");
		PreparedStatement stm = con.prepareStatement(sql);
		ResultSet rs = stm.executeQuery();		
		
		while(rs.next()) {
			System.out.println(rs.getString("nome"));
		}
		
		/*
		try(
			Connection con = DriverManager.getConnection(url, "curso", "curso1234");
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery()){
			
			while(rs.next()) {
				System.out.println(rs.getString("nome"));
			}
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro ao executar a consulta SQL: " + e.getMessage());
		}
		*/		
					
	}
}


/*
public class Bancoacesso{

	public static void main(String[] args) throws Exception{
		String sql = "select codigo, nome, sexo from PESSOA";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		
		Connection con = DriverManager.getConnection(url, "system", "root");
		PreparedStatement stm = con.prepareStatement(sql);
		ResultSet rs = stm.executeQuery();
		System.out.println(rs.getString("nome"));
		
		while(rs.next()) {
			System.out.println(rs.getString("nome"));
		}
		
		
		try(
			Connection con = DriverManager.getConnection(url, "curso", "curso1234");
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery()){
			
			while(rs.next()) {
				System.out.println(rs.getString("nome"));
			}
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro ao executar a consulta SQL: " + e.getMessage());
		}
		

	}

}
*/