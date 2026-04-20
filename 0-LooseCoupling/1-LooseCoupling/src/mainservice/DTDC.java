package mainservice;

public class DTDC implements IDelivery
{

	public String delivered(double amount) 
	{
		
		return "Order delivered through DTDC and amount paid is "+ amount;
	}

}