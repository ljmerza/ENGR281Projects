public class SpeciesEqualsDemo
{
	public static void main(String[] args)
	{
		Species s1 = new Species(), s2 = new Species();

		s1.setSpecies("Klingon Ox", 10, 15);
		s2.setSpecies("Klingon Ox", 10, 15);

		if(s1==s2)
			System.out.println("Match with ==");
		else
			System.out.println("Do not match with ==");

		if(s1.equals(s2))
			System.out.println("match with equals method");
		else
			System.out.println("do not match with equals method");

		System.out.println("now change one klingon ox to lower case");
		s2.setSpecies("klingon ox", 10, 15);

		if(s1.equals(s2))
			System.out.println("match with equals method");
		else
			System.out.println("do not match with equals method");

	}
}