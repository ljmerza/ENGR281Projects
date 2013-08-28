public class EqualsMethod
{

	public boolean equals(Object obj)
	{
		boolean returnValue = true;
		if(obj instanceof Person)
		{
			Person p = (Person)obj;
			if(!(this.getName().equals(p.getName())));
			{
				returnValue = false;
			}
		}
		else
		{
			returnValue = false;
		}
		return returnValue;
	}


	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Person: ");
		sb.append("Name = ").append(this.getName());

		return sb.toString();
	}
}