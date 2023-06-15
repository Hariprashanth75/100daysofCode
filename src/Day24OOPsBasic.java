public class Day24OOPsBasic {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day24PersonDetailClass person1 = new Day24PersonDetailClass("Hari",23,true);
		Day24PersonDetailClass person2 = new Day24PersonDetailClass("Charu",20,true);
		
		System.out.println("Name: "+person1.getName()+" Age: "+person1.getAge()+" Is Enrolled? "+person1.isEnrolled());
		System.out.println("Name: "+person2.getName()+" Age: "+person2.getAge()+" Is Enrolled? "+person2.isEnrolled());

		
	}

}
