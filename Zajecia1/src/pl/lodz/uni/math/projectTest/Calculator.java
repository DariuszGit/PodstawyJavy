package pl.lodz.uni.math.projectTest;

public class Calculator {
	private int firstValue;
	private int secondValue;
	private int result;
	
	public Calculator(int firstDigit,int secondDigit)
	{
		this.firstValue = firstDigit;
		this.secondValue = secondDigit;
	}
	
	public void add()
	{
		this.result = this.firstValue + this.secondValue;
	}
	
	public int getResult()
	{
		return this.result;
	}
	
	public void setFirstDigit(int firstDigit)
	{
		this.firstValue = firstDigit;
	}
	
	public void setSecondDigit(int secondDigit)
	{
		this.secondValue = secondDigit;
	}
}
