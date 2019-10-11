package com.app;
public class Calculator
{
	private double firstnum;
	private double secondnum;
	
	public double getFirstNo()
	{
		return this.firstnum;
	}

	public void setFirstNo(double fnum)
	{
		this.firstnum=fnum;
	}

	public double getSecondNo()
	{
		return this.secondnum;
	}

	public void setSecondNo(double snum)
	{
		this.secondnum=snum;
	}

	public double add()
	{
		return (firstnum + secondnum);
	}

	public double sub()
	{
		return (firstnum - secondnum);
	}

	public double mul()
	{
		return (firstnum * secondnum);
	}

	public double div()
	{
		if(secondnum!=0)
		{
			return (firstnum / secondnum);
		}
		else
		{
			System.out.print("Denominator can't be zero");
			return 0;
		}
	}
}