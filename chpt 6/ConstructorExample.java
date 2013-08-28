public class ConstructorExample
{
	private int age;
	private int id;
	private float salary;

	public ConstructorExample(int newAge, float newSalary, int newId)
	{
		this.set(newAge, newSalary, newId);
	}

	public ConstructorExample(float newSalary)
	{
		this(0, newSalary, 0);
	}

	public ConstructorExample(int newAge)
	{
		this(newAge, 0.0f, 0);
	}

	public ConstructorExample()
	{
		this(0, 0.0f, 0);
	}

	private void set(int newAge, float newSalary, int newId)
	{
		this.age = newAge;
		this.salary = newSalary;
		this.id = newId;
	}

	public void setAge(int newAge)
	{
		this.set(newAge, this.salary, this.id);
	}

	public int getAge()
	{
		return this.age;
	}

	public void setSalary(float newSalary)
	{
		this.set(this.age, newSalary, this.id);
	}

	public float getSalary()
	{
		return this.salary;
	}

	public void setId(int newId)
	{
		this.id = newId;
	}

	public int getId()
	{
		return this.id;
	}
}