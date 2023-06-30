package jdbcProcessMilRows;
import java.sql.*;

class DatabaseConnection
{
	String url;
	String username;
	String password;
	Connection connection;
	Statement statement;
	ResultSet result;
	String sql;
	public void DatabaseConnection(String url, String username, String password, String sql)
	{
		this.url=url;
		this.password=password;
		this.username=username;
		this.sql=sql;
	}
	
	public void connectToDB()
	{
		try
		{
			connection = DriverManager.getConnection(url,username,password); 
			System.out.println("Connected to MSSQL Server");
			statement = connection.createStatement();
			result =statement.executeQuery(sql);
			System.out.printf("Name"+"Country"+"Founded");
			while(result.next())
			{
				String name = result.getString("Name");
				String founded =result.getString("Country");
				String country =result.getString("Founded");
				System.out.println(name+" | "+country+" | "+founded);
			}
		}
		catch(Exception e)
		{
			System.out.println("Connection not successful"+e);
		}
	}
}
public class Day31MilRowsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:sqlserver://CAW2104467\\MSSQLSERVER01;databaseName=CDI;encrypt=false";
		String username="IICS_SQL";
		String password="IICS_SQL";
		String sql="select Name,Country,Founded from Organizations order by Founded;";
        DatabaseConnection db = new DatabaseConnection();
        db.DatabaseConnection(url, username, password,sql);
        db.connectToDB();
        
		

	}

}
