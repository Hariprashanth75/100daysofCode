import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Day13EmailValidation {
	
	public static boolean mailValid(String mail)
	{
		String emailregex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailregex);
		
		if(mail == null)
			return false;
		return pat.matcher(mail).matches();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> mail= new ArrayList<String>();
		mail.add("hariemailID@gmail.com");
		mail.add("harithecoder");
		for(String i:mail)
			if(mailValid(i))
				System.out.println("The email is valid");
			else
				System.out.println("The email is not valid");
		

	}

}
