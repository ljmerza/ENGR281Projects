public class TimeBook
{
	private int numberOfEmployees;
	private int[][] hours;

	private int[]weekHours;
	private int[] dayHours;

	private static final int NUMBER_OF_WORKDAYS = 5;
	private static final int MON = 0;
	private static final int TUE = 1;
	private static final int WED = 2;
	private static final int THU = 3;
	private static final int FRI = 4;

	public static void main(String[] args)
	{
		int NUMBER_OF_EMPLOYEES = 3;
		TimeBook book = new TimeBook(NUMBER_OF_EMPLOYEES);
		book.setHours();
		book.update();
		book.showTable();
	}

	public TimeBook(int theNumberOfEmployees)
	{
		numberOfEmployees = theNumberOfEmployees;
		hours = new int[NUMBER_OF_WORKDAYS][numberOfEmployees];
		weekHours = new int[numberOfEmployees];
		dayHours = new int[NUMBER_OF_WORKDAYS];
	}

	public void setHours()
	{
		hours[0][0] = 8; hours[0][1] = 0; hours[0][2] = 9;
		hours[1][0] = 8; hours[1][1] = 0; hours[1][2] = 9;
		hours[2][0] = 8; hours[2][1] = 8; hours[2][2] = 8;
		hours[3][0] = 8; hours[3][1] = 8; hours[3][2] = 4;
		hours[4][0] = 8; hours[4][1] = 8; hours[4][2] = 8;
	}

	public void update()
	{
		computeWeekHours();
		computeDayHours();
	}

	private void computeWeekHours()
	{
		for(int employeeNumber  = 1; employeeNumber<= numberOfEmployees; employeeNumber++)
		{
			int sum = 0;
			for(int day = MON; day <= FRI; day++)
				sum = sum + hours[day][employeeNumber -1];
			weekHours[employeeNumber -1] = sum;
		}
	}

	private void computeDayHours()
	{
		for(int day = MON; day <= FRI; day++)
		{
			int sum = 0;
			for(int employeeNumber = 1; employeeNumber <= numberOfEmployees; employeeNumber++)
				sum = sum + hours[day][employeeNumber -1];
			dayHours[day] = sum;
		}
	}

	public void showTable()
	{
		System.out.print("Employee ");
		for(int employeeNumber = 1; employeeNumber <= numberOfEmployees; employeeNumber++)
			System.out.print(employeeNumber + "   ");
		System.out.println("Totals");
		System.out.println( );

		for(int day = MON; day <= FRI; day++)
		{
			System.out.print(getDayName(day) + " ");
			for(int column = 0; column< hours[day].length; column++)
				System.out.print(hours[day][column] + "   ");
			System.out.println(dayHours[day]);
		}
		System.out.println();

		System.out.print("Total  =  ");
		for(int column = 0; column < numberOfEmployees; column++)
			System.out.print(weekHours[column] + "   ");
		System.out.println();
	}

	private String getDayName(int day)
	{
		String dayName = null;
		switch(day)
		{
			case MON:
				dayName = "Monday    ";
				break;
			case TUE:
				dayName = "Tuesday    ";
				break;
			case WED:
				dayName = "Wednesday";
				break;
			case THU:
				dayName = "Thursday   ";
				break;
			case FRI:
				dayName = "Friday   ";
				break;
			default:
				System.out.println("Fatal error.");
				System.exit(0);
			}
			return dayName;
	}
}