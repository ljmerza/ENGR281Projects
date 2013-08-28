public class Pet2
{
	private String name;
	private int age;
	private double weight;

	public Pet2(String initialName, int initialAge, double initialWeight)
	{
		set(initialName, initialAge, initialWeight);
	}

	public Pet2(String initialName)
	{
		set(initialName, 0, 0);
	}

	public Pet2(int initialAge)
	{
		set("no name", initialAge, 0);
	}

	public Pet2(double initialWeight)
	{
		set("no name", 0, initialWeight);
	}

	public Pet2()
	{
		set("no name", 0, 0);
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