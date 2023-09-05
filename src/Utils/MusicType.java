package Utils;

public enum MusicType {
	
	JAZZ(1), SALSA(2), HIPHOP(4), ROCK(6); 
	
	private int earDamageFactor;
	
	private MusicType(int earDamageFactor)
	{
		this.earDamageFactor = earDamageFactor;
	}
	
	public int calcHearingLoss(int hours)
	{
		return hours * earDamageFactor;
	}
	
	public String toString()
	{
		return this.name() + " - " + this.ordinal() + " - " + this.earDamageFactor;
	}

	

}
