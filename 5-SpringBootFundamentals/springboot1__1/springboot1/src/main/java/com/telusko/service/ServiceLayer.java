package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.repo.Repo;

@Service
public class ServiceLayer
{
	@Autowired  //DI
	private Repo repo;
	
	
	public ServiceLayer()
	{
		System.out.println("Service bean created");
	}
	
	public void service()
	{
		repo.daoLogic();
	}

}
