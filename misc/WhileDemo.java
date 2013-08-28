import java.util.Scanner;  //import statement -always at top


public class WhileDemo  //the name of the file has to be the same as the class name -case sensitive-
						//.java for saving .class for compiling
						//bytecode is .class
						//.java is sourcecode - high level language
						
						
{
	public static void main(String[] args) //main method executes the code -java looks for this-
											// run time error if no main method
	{
	
	
	
		int count, number;  //declaration line 
							//data type = identifier
		boolean isNotTimeToBuckle = true; //starts with is or has
		
		
		
		System.out.println("Enter a number"); //prompt line
		Scanner keyboard = new Scanner(System.in); //declaration = instantiation
													//reference keyboard to the scanner object
													//keyboard is the memory address to where scanner is located
		number = keyboard.nextInt(); // method call


		count = 1;  //assignment operator
					//primitive initialalized - can be combined with declaration
		while (isNotTimeToBuckle) //comparison operator -6 types- < > != == >= <=
								//3 ways boolean expression defined
								//compare 2 primitives - method that returns primitive boolean - 
		{
			System.out.print(count + " ");  //can declare variable in loop but only known inside loop -variable scope
			count++;						// count = count + 1
			if(count > number)
				{
					isNotTimeToBuckle = false;
				}
		}

		System.out.println();
		System.out.println("Buckle my shoe.");

	}
}