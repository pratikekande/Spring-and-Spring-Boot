package main;

import service.ICourse;

public class Telusko 
{
	private ICourse course;
	
	public Telusko(ICourse course) {
		super();
		this.course = course;
	}
	public Telusko() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setCourse(ICourse course)//ICourse course = new SystemDesign(); 
	{
		this.course = course;
	}
	
	public boolean buyTheCourse()
	{
		return course.registerCourse();
	}

}
