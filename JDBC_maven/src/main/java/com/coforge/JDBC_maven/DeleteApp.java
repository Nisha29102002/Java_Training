package com.coforge.JDBC_maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Hello World");
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/companydb";
		String uname = "root";
		String pwd = "Anil@1981";
		Connection con = DriverManager.getConnection(url,uname,pwd);
		String query = "delete from employeesalary where emp_name=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, "Brian");
		int noOfRows = ps.executeUpdate();
		System.out.println(noOfRows + " rows got deleted.");

	}

}