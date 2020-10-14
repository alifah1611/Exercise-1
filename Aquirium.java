public class Aquirium
{
	//Attribute or data member or fields
	public int length, height, width;

	//Method
	public void fillFish ()
	{
		Fish fish1 = new Fish();

		fish1.SetColor("green");

		System.out.println("Many " + fish1.GetColor() + " fish here");
	
		fish1.Swim();
	}
}
