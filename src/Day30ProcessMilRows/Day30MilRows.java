package Day30ProcessMilRows;
import java.sql.*;

public class Day30MilRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:sqlserver://CAW2104467\\MSSQLSERVER01;databaseName=CDI;encrypt=false";
		String username="IICS_SQL";
		String password="IICS_SQL";
		Connection connection;
		try
		{
			connection = DriverManager.getConnection(url,username,password);
			System.out.println("Connected to MSSQL server");
			
			//Sum of all rows query
			String sql="select SUM(Number_of_employees) from Organizations;";
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			String number_of_employees = null;
			while(result.next())
			{
			number_of_employees = result.getString(1);
			}
			int total = Integer.parseInt(number_of_employees);
			System.out.println("The number of employees of in whole dataset:  "+total);
			
			connection.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
		}
		
		

	}

}
