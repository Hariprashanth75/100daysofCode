import java.util.Scanner;
import java.sql.*;

class EJ200EuroJetEngine
{
	String name ="EJ200";
	float drythrust = 60;
	float afterburner= 90;
	float thrust=20000;
	
	public void engineSummary()
	{
		System.out.println("Engine name:"+name);
		System.out.println("Dry thrust:"+drythrust);
		System.out.println("Afterburner:"+afterburner);
		System.out.println("Thrust:"+thrust);
	}
	
	
}

class EuroFighterTyphoon extends EJ200EuroJetEngine
{
	String name="Eurofighter Typhoon";
	int hardpoints=13;
	String radar="Captor AESA";
	String avionics="GPWS";
	String trackingEqp="IRST";
	
	public void fighterSummary()
	{
		System.out.println("Name:"+name);
		System.out.println("Radar:"+radar);
		System.out.println("Avionics:"+avionics);
		System.out.println("Tracking Equipment:"+trackingEqp);
	}
}
public class Day34Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EuroFighterTyphoon typhoon =  new EuroFighterTyphoon();
		 System.out.println("<===Aircraft summary===>");
		 typhoon.fighterSummary();
		 System.out.println("<===Engine summary===>");
		 typhoon.engineSummary();
		 

	}

}
