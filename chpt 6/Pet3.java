public class Pet3
{
	private String name;
	private int age;
	private double weight;

	public Pet3(String initialName, int initialAge, double initialWeight)
	{
		set(initialName, initialAge, initialWeight);
	}

	public Pet3(String initialName)
	{
		set(initialName, 0, 0);
	}

	public Pet3(int initialAge)
	{
		this("no name", initialAge, 0);
	}

	public Pet3(double initialWeight)
	{
		this("no name", 0, initialWeight);
	}

	public Pet3()
	{
		this("no name", 0, 0);
	}

	public void setPet(String newName, int newAge, double newWeight)
	{
		set(newName, newAge, newWeight);
	}

	public void setName(String newName)
	{
		set(newName, 0, 0);
	}

	public void setAge(int newAge)
	{
		set("no name", newAge, 0);
	}

	public void setWeight(double newWeight)
	{
		set("no name", 0, newWeight);
	}

	private void set(String newName, int newAge, double newWeight)
	{
		name = newName;
		if((newAge < 0) || (newWeight < 0))
		{
			System.out.println("error");
			System.exit(0);
		}
		else
		{
			age = newAge;
			weight = newWeight;
		}
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public double getWeight()
	{
		return weight;
	}

	public void writeOutput()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight + " pounds.");
	}
}