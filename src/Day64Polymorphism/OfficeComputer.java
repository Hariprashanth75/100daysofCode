package Day64Polymorphism;

public class OfficeComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayService p = new PayService();
		Employee e = new Manager();
		p.cutCheck(e);

	}

}
