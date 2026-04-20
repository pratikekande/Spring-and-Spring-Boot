package main;

import mainservice.IDelivery;

public class Mynthra
{
	private IDelivery delivery;
	
	public Mynthra(IDelivery delivery) {
	
		super();
		this.delivery = delivery;
	}

	public Mynthra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setDelivery(IDelivery delivery) {
		this.delivery = delivery;
	}

	public String orderDelivery(double amount)
	{
		return delivery.delivered(amount);
	}

}
