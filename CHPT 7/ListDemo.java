import java.util.Scanner;

public class ListDemo
{
	public static final int MAX_SIZE = 3;

	public static void main(String[] args)
	{
		OneWayNoRepeatsList toDoList = new OneWayNoRepeatsList(MAX_SIZE);

		System.out.println("Enter items for the list");
		boolean moreEntries = true;
		String next = null;
		Scanner key = new Scanner(System.in);

		while(moreEntries && !toDoList.isFull())
		{
			System.out.println("enter an item");
			next = key.nextLine();
			toDoList.addItem(next);

			if(toDoList.isFull())
			{
				System.out.println("list is now full");
			}
			else
			{
				System.out.println("More items on the list?");
				String ans = key.nextLine();
				if(ans.trim().equalsIgnoreCase("no"))
					moreEntries = false;
			}
		}

		System.out.println("the list contains");
		int position = toDoList.START_POSITION;
		next = toDoList.getEntryAt(position);
		while(next != null)
		{
			System.out.println(next);
			position++;
			next = toDoList.getEntryAt(position);
		}
	}
}