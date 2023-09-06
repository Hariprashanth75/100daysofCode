package Day86ExceptionHandlingRevist;

public class PrintExceptionStackTrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String[] arr = new String[2];
			arr[0] = "Sally";
			arr[1] = "Bob";
			arr[2] = "Rick";
			arr[3] = "Summer";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The array size is small for more elements" + e.getMessage());
			System.out.println(e.getCause());
	        e.printStackTrace();
			e.getStackTrace();

		}

	}

}
