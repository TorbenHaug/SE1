package se1_aufgabe2.accounting.se1_aufgabe2.common;

public class Rate
{
	private final float rate;

	private Rate(float inValue)
	{
		this.rate = inValue;
	}

	public float getRate()
	{
		return rate;
	}

	public float getAsPercentageRate()
	{
		return this.rate * 100;
	}

	public static Rate getWithPercentage(float inPercentage)
	{
		return new Rate(inPercentage / 100);
	}

	public static Rate getWithFloatRate(float inRate)
	{
		return new Rate(inRate);
	}
}