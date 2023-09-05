package Utils;

public class Day59EnumConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicType type = MusicType.HIPHOP;
		int hours =10;
		int hearing;
		
		switch(type)
		{
		case HIPHOP:
			hearing = type.calcHearingLoss(hours);
			System.out.println(hearing);
			break;
		
		case JAZZ:
			hearing = type.calcHearingLoss(10);
			System.out.println(hearing);
			break;
		case SALSA:
			hearing = type.calcHearingLoss(10);
			System.out.println(hearing);
			break;
		case ROCK:
			hearing = type.calcHearingLoss(10);
			System.out.println(hearing);
			break;
		default:
			System.out.println("Invalid input");
		}

	}

}
