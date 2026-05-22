package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.repo.EmployeeRepoImpl;

@SpringBootApplication
public class SpringjdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringjdbcApplication.class, args);
	   
//	IEmployeeRepo repo = container.getBean(IEmployeeRepo.class);
		EmployeeRepoImpl repo = container.getBean(EmployeeRepoImpl.class);

	repo.getEmployeeInfo().forEach(e->System.out.println(e));
		
//		List<Employee> list = repo.getEmployeeInfo();
//		for(Employee e: list)
//		{
//			System.out.println(e);
//		}
		
//		Iterator<Employee> itr = list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
//		EmployeeRepo2 repo2 = container.getBean(EmployeeRepo2.class);
//		Employee e=new Employee();
//		e.setId(4);
//		e.setName("Rohan");
//		e.setCity("Bengaluru");
//		repo2.input(e);

	
	}

}
