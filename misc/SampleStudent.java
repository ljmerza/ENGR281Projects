public class SampleStudent
{
	private String name;
	private double GPA;

	public void setName(String newName)
	{
		this.name = newName;
	} // ending setname

	public String getName()
	{
		return this.name;
	} // ending getname

	public void setGPA(double newGPA)
	{
		this.GPA = newGPA;
	} // ending setgpa

	public double getGPA()
	{
		return this.GPA;
	} // ending getgpa

	public boolean equals(Object obj)
	{
		boolean returnValue = true;

		if(obj instanceof SampleStudent)
		{
			SampleStudent ss = (SampleStudent) obj;

			if(!(this.getName().equals(ss.getName())))
			{
				returnValue = false;
			} // ending if statement
			else if(this.getGPA() != ss.getGPA())
			{
				returnValue = false;
			} // ending else statement
		} // ending if statement
		else
		{
			returnValue = false;
		} // ending else
		return returnValue;
	} // ending boolean

	public String toString()
	{
		StringBuffer sb = new StringBuffer();

		sb.append("Name:").append(this.getName());
		sb.append(", GPA:").append(this.getGPA());

		return "Name:" + this.getName() + ", GPA:" + this.getGPA();
	} // ending toString method

} // ending sample student class