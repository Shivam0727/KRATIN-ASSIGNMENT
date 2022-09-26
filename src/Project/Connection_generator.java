package Project;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_generator 
{
	static Connection con ;
	
	public static Connection createC()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");

        String url= "jdbc:mysql://localhost:3306/Kratin_Project?autoReconnect=true&useSSL=false";
        String username= "root";
        String password= "Shivam@07122000";
		 con = DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
