package io.cucumber.skeleton;

public class Belly
{
	private int nPepinos;
	private int hourWaited;
    public void eat(int cukes)
    {
    	nPepinos = cukes;
    }
	public void wait_hour(Integer int1)
	{
		hourWaited = int1;
	}
	public String growl()
	{
		if(hourWaited != 0)
			return "growl";
		else
		{
			if(nPepinos == 0)
				return "growl";
			else
				return "No growl";
		}
	}
}
