package com.telusko.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.telusko.repo.Repo;

@Controller
public class Web 
{
	
	@Autowired
	private Repo repo;
	
	
	public Web()
	{
		System.out.println("Web bean created");
	}
	
	public void service()
	{
		repo.daoLogic();
	}
	

}
