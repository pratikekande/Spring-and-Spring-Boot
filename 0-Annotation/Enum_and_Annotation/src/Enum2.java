
enum Result
{
	PASS, FAIL, NR;
	
//	public static final Result PASS=new Result();
//	public static final Result FAIL=new Result();
//	public static final Result NR=new Result();
	
	int marks;
	Result()
	{
		
		System.out.println("Consturctor of enum");
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
//	enum Week1
//	{
//		MON, TUE:
//	}
}

public class Enum2 
{
	public static void main(String[] args) 
	{
		Result res = Result.PASS;
		res.setMarks(44);
		
		System.out.println(res.getMarks());
		
		Result res2=Result.FAIL;
		System.out.println(res2.getMarks());
	}

}
