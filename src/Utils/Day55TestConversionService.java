package Utils;

public class Day55TestConversionService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Day55ConversionService.fluidOunces(1.1f));
		System.out.println(Day55ConversionService.gallons(2.2f));
		System.out.println(Day55ConversionService.grams(30));
		System.out.println(Day55ConversionService.milliliters(40));
		System.out.println(Day55ConversionService.ounces(50));
		System.out.println(Day55ConversionService.pints(6.6f));
		System.out.println(Day55ConversionService.pounds(7.7));
		
		// can you figure out why these do not compile
		Day55ConversionService.fluidOunces((float)1.1);
		Day55ConversionService.grams((int)30L);
		Day55ConversionService.milliliters((int)4.0);
		short grams = (short)Day55ConversionService.grams(30);
		byte byteGrams = (byte)Day55ConversionService.grams(30);
		
		// why do these still work even though the types are 
		
		System.out.println("------------------------------------");
		double ounces = Day55ConversionService.fluidOunces(1.1f);
		System.out.println(ounces);
		long milliliters = Day55ConversionService.milliliters(40);
		System.out.println(milliliters);
		double decimalMilliliters = 
		Day55ConversionService.milliliters(40);
		System.out.println(decimalMilliliters);
		short s = 30;
		System.out.println(Day55ConversionService.grams(s));
		byte b = 4;
		System.out.println(Day55ConversionService.milliliters(b));
		char z = 'z';
		System.out.println(Day55ConversionService.milliliters(z));
		System.out.println(Day55ConversionService.gallons(200));
		System.out.println(Day55ConversionService.ounces(50.5f));
		System.out.println(Day55ConversionService.pints(6L));
		System.out.println(Day55ConversionService.pounds(7L));
		// compare these results. Can you tell why they are different?



	}

}
