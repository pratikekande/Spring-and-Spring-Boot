package mainservice;

public class FedEx implements IDelivery
{

	public String delivered(double amount) 
	{
		
		return "Order delivered through FedEx and amount paid is "+ amount;
	}

}