package JavaJDBC;
import java.sql.*;
import java.util.ArrayList;
public class Day28JavaJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="jdbc:sqlserver://CAW2104467\\MSSQLSERVER01;databaseName=CDI;encrypt=false";
		String username="IICS_SQL";
		String password="IICS_SQL";
		
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			System.out.println("Connected to MSSQL server");
			
		/*	String sql="insert into RATE_IMPORT_DISCOUNT_STAGING_POC(\r\n"
					+ "rowID,\r\n"
					+ "    clientId,\r\n"
					+ "    reqlnID,\r\n"
					+ "    rateSheetId,\r\n"
					+ "    serviceLevel,\r\n"
					+ "    commodity,\r\n"
					+ "    requestedEquipment,\r\n"
					+ "    effectiveTo,\r\n"
					+ "    effectiveFrom,\r\n"
					+ "    isVendor,\r\n"
					+ "    currencyCode,\r\n"
					+ "    customerrate,\r\n"
					+ "    weightbreak,\r\n"
					+ "    seq,\r\n"
					+ "    startZone,\r\n"
					+ "    endZone,\r\n"
					+ "    rateBaseMin,\r\n"
					+ "    rateBaseMax,\r\n"
					+ "    allowBetween,\r\n"
					+ "    rateBaseallowbetween\r\n"
					+ ") values(6,'dayRoss',125,125,'transfer','spinach','microchips','1993-12-1','1994-2-21','TRUE','USD','12235','2345',2,'OTTAWA','MONTREAL',1000,5000,'TWO','THREE');\r\n"
					+ "";
			*/
			
			//Executing individual sql statements to fetch each column
			String sql="SELECT clientId FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql2="SELECT reqlnID FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql3="SELECT rateSheetId FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql4="SELECT serviceLevel FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql5="SELECT commodity FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql6="SELECT requestedEquipment FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql7="SELECT effectiveTo FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql8="SELECT effectiveFrom FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql9="SELECT isVendor FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql10="SELECT currencyCode FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql11="SELECT customerrate FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql12="SELECT weightbreak FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql13="SELECT seq FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql14="SELECT startZone FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql15="SELECT endZone FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql16="SELECT rateBaseMin FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql17="SELECT rateBaseMax FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql18="SELECT allowBetween FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			String sql19="SELECT rateBaseallowBetween FROM RATE_IMPORT_DISCOUNT_STAGING_POC";
			
			Statement statement = connection.createStatement();
			Statement statement2 = connection.createStatement();
			Statement statement3 = connection.createStatement();
			Statement statement4 = connection.createStatement();
			Statement statement5 = connection.createStatement();
			Statement statement6 = connection.createStatement();
			Statement statement7 = connection.createStatement();
			Statement statement8 = connection.createStatement();
			Statement statement9 = connection.createStatement();
			Statement statement10 = connection.createStatement();
			Statement statement11 = connection.createStatement();
			Statement statement12 = connection.createStatement();
			Statement statement13 = connection.createStatement();
			Statement statement14 = connection.createStatement();
			Statement statement15 = connection.createStatement();
			Statement statement16 = connection.createStatement();
			Statement statement17 = connection.createStatement();
			Statement statement18 = connection.createStatement();
			Statement statement19 = connection.createStatement();
			//int rows = statement.executeUpdate(sql);
			
			//Running the sql statements one by one for each column
			ResultSet result = statement.executeQuery(sql);
			ResultSet result2 = statement2.executeQuery(sql2);
			ResultSet result3 = statement3.executeQuery(sql3);
			ResultSet result4 = statement4.executeQuery(sql4);
			ResultSet result5 = statement5.executeQuery(sql5);
			ResultSet result6 = statement6.executeQuery(sql6);
			ResultSet result7 = statement7.executeQuery(sql7);
			ResultSet result8 = statement8.executeQuery(sql8);
			ResultSet result9 = statement9.executeQuery(sql9);
			ResultSet result10 = statement10.executeQuery(sql10);
			ResultSet result11 = statement11.executeQuery(sql11);
			ResultSet result12 = statement12.executeQuery(sql12);
			ResultSet result13 = statement13.executeQuery(sql13);
			ResultSet result14 = statement14.executeQuery(sql14);
			ResultSet result15 = statement15.executeQuery(sql15);
			ResultSet result16 = statement16.executeQuery(sql16);
			ResultSet result17 = statement17.executeQuery(sql17);
			ResultSet result18 = statement18.executeQuery(sql18);
			ResultSet result19 = statement19.executeQuery(sql19);
			
			
			//Creating an arraylist to store values from each column
			int count =0;
			ArrayList<String> clientIDlist = new ArrayList<String>();
			ArrayList<Integer> reqlnIDlist = new ArrayList<Integer>();
			ArrayList<Integer> rateSheetIdlist = new ArrayList<Integer>();
			ArrayList<String> serviceLevellist = new ArrayList<String>();
			ArrayList<String> commodityIDlist = new ArrayList<String>();
			ArrayList<String> requestedEquipmentlist = new ArrayList<String>();
			ArrayList<String> effectiveTolist = new ArrayList<String>();
			ArrayList<String> effectiveFromlist = new ArrayList<String>();
			ArrayList<Integer> isVendorlist = new ArrayList<Integer>();
			ArrayList<String> currencyCodelist = new ArrayList<String>();
			ArrayList<Integer> customerratelist = new ArrayList<Integer>();
			ArrayList<Integer> weightbreaklist = new ArrayList<Integer>();
			ArrayList<Integer> seqlist = new ArrayList<Integer>();
			ArrayList<String> startZonelist = new ArrayList<String>();
			ArrayList<String> endZonelist = new ArrayList<String>();
			ArrayList<Integer> rateBaseMinlist = new ArrayList<Integer>();
			ArrayList<Integer> rateBaseMaxlist = new ArrayList<Integer>();
			ArrayList<String> allowBetweenlist = new ArrayList<String>();
			ArrayList<String> rateBaseallowBetweenlist = new ArrayList<String>();
			
			
			
			
			while(result.next())
			{
				String clientIdString = result.getString("clientId");	
				clientIDlist.add(clientIdString);
			
			}
			while(result2.next())
			{
				int reqlnIDString = result2.getInt("reqlnID");
				reqlnIDlist.add(reqlnIDString);
			}
			while(result3.next())
			{
				int rateSheetIdString = result3.getInt("rateSheetId");
				rateSheetIdlist.add(rateSheetIdString);
				
			}
			while(result4.next())
			{
				String serviceLevelString = result4.getString("serviceLevel");
				serviceLevellist.add(serviceLevelString);
			}
			while(result5.next())
			{
				String commodityIDString = result5.getString("commodity");
				commodityIDlist.add(commodityIDString);
				
			}
			while(result6.next())
			{
				String requestedEquipmentString = result6.getString("requestedEquipment");
				requestedEquipmentlist.add(requestedEquipmentString);
			}
			while(result7.next())
			{
				String effectiveToString = result7.getString("effectiveTo");
				effectiveTolist.add(effectiveToString);
			}
			while(result8.next())
			{
				String effectiveFromString = result8.getString("effectiveFrom");
				effectiveFromlist.add(effectiveFromString);
			}
			while(result9.next())
			{
				int isVendorString = result9.getInt("isVendor");
				isVendorlist.add(isVendorString);
			}
			while(result10.next())
			{
				String currencyCodeString = result10.getString("currencyCode");
				currencyCodelist.add(currencyCodeString);
			}
			while(result11.next())
			{
				int customerrateString = result11.getInt("customerrate");
				customerratelist.add(customerrateString);
			}
			while(result12.next())
			{
				int weightbreakString = result12.getInt("weightbreak");
				weightbreaklist.add(weightbreakString);
				
			}
			while(result13.next())
			{
				int seqString = result13.getInt("seq");
				seqlist.add(seqString);
			}
			while(result14.next())
			{
				String startZoneString = result14.getString("startZone");
				startZonelist.add(startZoneString);
			}
			while(result15.next())
			{
				String endZoneString = result15.getString("endZone");
				endZonelist.add(endZoneString);
			}
			while(result16.next())
			{
				int rateBaseMinString = result16.getInt("rateBaseMin");
				rateBaseMinlist.add(rateBaseMinString);
			}
			while(result17.next())
			{
				int rateBaseMaxString = result17.getInt("rateBaseMax");
				rateBaseMaxlist.add(rateBaseMaxString);
			}
			while(result18.next())
			{
				String allowBetweenString = result18.getString("allowBetween");
				allowBetweenlist.add(allowBetweenString);
			}
			while(result19.next())
			{
				String rateBaseallowBetweenString = result19.getString("rateBaseallowBetween");
				rateBaseallowBetweenlist.add(rateBaseallowBetweenString);
			}
			
			
			System.out.println("Client ID list \n"+clientIDlist);
			System.out.println("Req ID list \n"+reqlnIDlist);
			System.out.println("Rate sheet ID list \n"+rateSheetIdlist);
			System.out.println("Service Level list \n"+serviceLevellist);
			System.out.println("Commodity ID list \n"+commodityIDlist);
			System.out.println("Requested Equipment ID list \n"+requestedEquipmentlist);
			System.out.println("effective To list \n"+effectiveTolist);
			System.out.println("effective From list \n"+effectiveFromlist);
			System.out.println("isVendor list \n"+isVendorlist);
			System.out.println("Currency code To list \n"+currencyCodelist);
			System.out.println("Customer rate list \n"+customerratelist);
			System.out.println("Weightbreak list \n"+weightbreaklist);
			System.out.println("Seq list \n"+seqlist);
			System.out.println("startZone list \n"+startZonelist);
			System.out.println("endZone list \n"+endZonelist);
			System.out.println("rateBaseMin list \n"+rateBaseMinlist);
			System.out.println("rateBaseMax list \n"+rateBaseMaxlist);
			System.out.println("allowBetween list \n"+allowBetweenlist);
			System.out.println("rrateBaseallowBetween list \n"+rateBaseallowBetweenlist);
		
			
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("There is an error in connection");
			e.printStackTrace();
		}

	}

}
