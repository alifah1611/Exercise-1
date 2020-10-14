public class Driver
{
	public static void main(String[] args) 
	{
		//Fish is a data type
		Fish nemo = new Fish(); //nemo is object, Fish is class
		nemo.Swim();
		nemo.color = "red";
		nemo.Swim();

		Fish dory = new Fish();
		dory.Swim();
		dory.color = "orange";
		dory.Swim();
	}
}