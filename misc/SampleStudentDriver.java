public class SampleStudentDriver
{
	public static void main(String[] args)
	{
		SampleStudent s1 = new SampleStudent();
		SampleStudent s2 = new SampleStudent();

		s1.setName("John Smith");
		s2.setName("John Smith");

		s1.setGPA(3.75);
		s2.setGPA(3.75);

		System.out.println("s1: " + s1.toString());
		System.out.println("s2: " + s2.toString());

		if(s1.equals(s2))
		{
			System.out.println("Equal");
		} // ending if
		else
		{
			System.out.println("Not equal");
		} // ending else

	} // ending main method
} // ending sample class