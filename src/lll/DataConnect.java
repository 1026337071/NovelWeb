package lll;

import java.sql.Statement;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//

public class DataConnect {
	private static Connection conn = null;
	private static Statement stmt;
	
	// 取得数据库连接
	public static Connection getConnection() {
		if (conn != null) {
			return conn;
		}
		String driver_MySQL = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/xiaoshuo?characterEncoding=utf-8";
		String account_MySQL = "root";
		String password_MySQL = "172017046";

		try {
			Class.forName(driver_MySQL);
			conn = DriverManager.getConnection(url, account_MySQL,
					password_MySQL);
			stmt=conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("创建数据库连接失败！");
		}
		return conn;
	}
	public static Statement getStat(){
		if(stmt==null)
			getConnection();
		return stmt;
	}
}