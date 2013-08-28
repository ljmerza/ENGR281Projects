public class SpeciesFirstTryDemo
{
	public static void main(String[] args)
	{
		SpeciesFirstTry speciesOfTheMonth = new SpeciesFirstTry();

		System.out.println("Enter data on the species of the month:");
		speciesOfTheMonth.readInput();
		speciesOfTheMonth.writeOutput();

		int futurePopulation = speciesOfTheMonth.getPopulationIn10();
		System.out.println("In ten years the population will be " +
							futurePopulation);

		//change the species to show how to change
		//the values of instance variables:
		speciesOfTheMonth.name = "Klingon ox";
		speciesOfTheMonth.population = 10;
		speciesOfTheMonth.growthRate = 15;
		System.out.println("The new species of the month:");
		speciesOfTheMonth.writeOutput();
		System.out.println("In ten years the population will be " +
							speciesOfTheMonth.getPopulationIn10());
	}
}