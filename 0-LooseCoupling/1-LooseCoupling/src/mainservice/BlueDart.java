package mainservice;

public class BlueDart implements IDelivery
{

	public String delivered(double amount) 
	{
		
		return "Order delivered through Blue dart and amount paid is "+ amount;
	}

}
