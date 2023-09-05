package Day30_Day31_Day32_Day33_jdbcProcessMilRows;
import java.sql.*;

interface connectToJDBCFresh
{
	public void runQuery();
}

class queryFirst implements connectToJDBCFresh
{
	public void runQuery()
	{
		String url="jdbc:sqlserver://CAW2104467\\MSSQLSERVER01;databaseName=CDI;encrypt=false";
		String username="IICS_SQL";
		String password="IICS_SQL";
		String sql1="select Name,Country,Founded from Organizations where Country='Israel' order by Founded;";
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			System.out.println("Connected to MSSQL for first query");
			Statement statement = connection.createStatement();
			ResultSet result =statement.executeQuery(sql1);
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

class querySecond implements connectToJDBCFresh
{
	public void runQuery()
	{
		String url="jdbc:sqlserver://CAW2104467\\MSSQLSERVER01;databaseName=CDI;encrypt=false";
		String username="IICS_SQL";
		String password="IICS_SQL";
		String sql1="select Name,Country,Founded from Organizations where Country='Korea' order by Founded;";
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			System.out.println("Connected to MSSQL for second query");
			Statement statement = connection.createStatement();
			ResultSet result =statement.executeQuery(sql1);
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
public class Day33JDBCInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	queryFirst qf = new queryFirst();
	querySecond qs = new querySecond();
	qf.runQuery();
	qs.runQuery();
	
	
		
		
		
		
		
	}

}
