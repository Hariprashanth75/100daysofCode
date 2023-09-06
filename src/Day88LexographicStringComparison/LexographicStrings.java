package Day88LexographicStringComparison;

public class LexographicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1 = "Boba Latte";
		String name2 = "Caramel Frappe";
		String name3 = "Dragonfruit blast";
		String name4 = "Banana strawberry shake";
		
		//Use compareTo operator to compare string lexographically, if String1 < String2 it returns negative
		//If String1 = String2 it returns 0 and if String1 > String2 it returns positive
		
		System.out.println("Boba latte vs Caramel Frappe: " + name1.compareTo(name2));
		System.out.println("Dragonfruit blast vs Banana straberry shake: " + name3.compareTo(name4));
		System.out.println("Boba latte vs Dragonfruit blast: " + name1.compareTo(name3));
		System.out.println("Banana strawberry shake vs Boba latte: " + name4.compareTo(name1));
		
		

	}

}
