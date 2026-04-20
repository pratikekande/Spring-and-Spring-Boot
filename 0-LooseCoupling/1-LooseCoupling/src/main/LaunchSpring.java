package main;

import mainservice.BlueDart;

public class LaunchSpring
{
	public static void main(String[] args)
	{
		int age=16;
		age=17;
		
//		Mynthra m=new Mynthra(new FedEx());
		Mynthra m=new Mynthra();
		
		m.setDelivery(new BlueDart());
		
		String status=m.orderDelivery(4545.5);
		System.out.println(status);
	}

}
