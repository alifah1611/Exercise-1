public class Driver
{
	public static void main(String[] args) 
	{
		//Fish is a data type
		Fish nemo = new Fish(); //nemo is object, Fish is class
		nemo.Swim();
		//nemo.color = "red";
		nemo.SetColor("red");
		nemo.Swim();
		//nemo.Eat(); //superclass tak boleh guna function subclass

		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(150);
		fiery.Eat();

		//Fish dory = new Fish();
		//dory.Swim();
		//dory.color = "orange";
		//dory.SetColor("orange");
		//dory.Swim();

		//Aquirium fancyAquirium = new Aquirium();
		//fancyAquirium.fillFish();


	}
}