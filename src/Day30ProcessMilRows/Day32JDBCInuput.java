package Day30ProcessMilRows;
import java.sql.*;
import java.util.*;
class ConnectToJDBC
{
	String url;
	String username;
	String password;
	String sql;
	Connection connection;
	ResultSet result;
	Statement statement;
	
	public void ConnectToJDBC(String url, String username, String password, String sql)
	{
		this.url=url;
		this.username=username;
		this.password=password;
		this.sql=sql;
	}
	
	public void runQuery()
	{
		try {
			connection = DriverManager.getConnection(url,username,password);
			System.out.println("Connected to MSSQL");
			statement = connection.createStatement();
			result =statement.executeQuery(sql);
			while(result.next())
			{
				String name = result.getString("Name");
				String founded =result.getString("Country");
				String country =result.getString("Founded");
				System.out.println(name+" | "+country+" | "+founded);
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public class Day32JDBCInuput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:sqlserver://CAW2104467\\MSSQLSERVER01;databaseName=CDI;encrypt=false";
		String username="IICS_SQL";
		String password="IICS_SQL";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the country name");
		String country= sc.nextLine();
		String sql ="select Name,Country,Founded from Organizations where Country='"+country+"'order by Founded;";
		
		ConnectToJDBC connect = new ConnectToJDBC();
		connect.ConnectToJDBC(url,username,password,sql);
		connect.runQuery();

	}

}
