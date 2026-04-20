package main;

import service.AIEngineering;
import service.DevOps;

public class LaunchSpring
{
	public static void main(String[] args)
	{
//		SystemDesign sd=new SystemDesign();//dependent object
		
		//constuctor injection
		
		Telusko t=new Telusko(new DevOps());//target
		//injecting dependent object into target ==> DI
		//setter injection
		//t.setCourse(new AIEngineering());
		
		
		
		boolean status=t.buyTheCourse();
		if(status)
			System.out.println("Successfully registered at telusko");
		else
			System.out.println("Failed registered at telusko");

	}

}
