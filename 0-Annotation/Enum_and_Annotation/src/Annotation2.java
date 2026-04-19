import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.TYPE)
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD
	,ElementType.PARAMETER})
@interface CricketPlayer
{
	String country() default "India";
	int age() default 36;
}

@CricketPlayer(country="India", age=38)
class RohitSharma
{
	@CricketPlayer
	private int innings;
	
	@CricketPlayer
	public RohitSharma()
	{
		
	}

	@CricketPlayer
	public int getInnings() {
		return innings;
	}

	public void setInnings(@CricketPlayer int innings) {
		this.innings = innings;
	}
	
}
public class Annotation2 
{
	public static void main(String[] args)
	{
		RohitSharma rs=new RohitSharma();
		
		Class<? extends RohitSharma> cls = rs.getClass();
		CricketPlayer ann = cls.getAnnotation(CricketPlayer.class);
		String c=ann.country();
		int age=ann.age();
		System.out.println(c+" "+ age);

	}

}
