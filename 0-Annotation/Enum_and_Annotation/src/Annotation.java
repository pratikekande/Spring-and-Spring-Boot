//ParentsClass
class Animal
{
	public void animalUsuallyhuntsAndEats()
	{
		System.out.println("Animal is eating.....");
	}
}
//ChildClass

class Tiger extends Animal
{
	//override
	@Override
	public void animalUsuallyhuntsAndEats()
	{
		System.out.println("Tiger fearlessly hunts and eats");
	}
}
public class Annotation 
{
	public static void main(String[] args)
	{
		Animal tiger=new Tiger();
		tiger.animalUsuallyhuntsAndEats();
	}

}
