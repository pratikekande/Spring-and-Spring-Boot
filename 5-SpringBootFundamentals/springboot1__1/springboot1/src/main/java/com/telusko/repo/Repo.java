package com.telusko.repo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

//singleton  --> eager init , one bean only
@Repository
@Scope("prototype")  // lazy init , one bean per use
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Repo
{
	public Repo()
	{
		System.out.println("Repo bean created");
	}

	public void daoLogic()
	{
		System.out.println("Db logic");
	}
}
