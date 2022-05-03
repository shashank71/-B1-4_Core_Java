package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

class DBConnect {

	public static void main(String[] args) {
		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://127.0.0.1:3306/Capge";
		String dbUserName="root";
		String dbPassword="root";
		String query="select *from Engineering";
		try 
		{
			 Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e)
		{
			 e.printStackTrace();
		}
		try
		 {
			 Connection con=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
			 java.sql.Statement st=con.createStatement();
			 ResultSet rs=st.executeQuery(query);
			 while(rs.next()) {
				 String Stud_data=" ";
				 for(int i=1;i<=2;i++) {
					 Stud_data=Stud_data+" "+rs.getString(i);
				 }
				 System.out.println(Stud_data);
			 }
		 }
		catch(SQLException e) {
			System.out.println("error occured invalid");
			e.printStackTrace();
		}
		
		 }
	}