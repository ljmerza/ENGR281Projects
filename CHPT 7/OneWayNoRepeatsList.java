public class OneWayNoRepeatsList
{
	public static int START_POSITION = 1;
	public static int DEFAULT_SIZE = 50;

	private int countofentries;
	private String[] entry;

	public OneWayNoRepeatsList(int maxnumberofentries)
	{
		entry = new String[maxnumberofentries];
		countofentries = 0;
	}

	public OneWayNoRepeatsList()
	{
		entry = new String[DEFAULT_SIZE];
		countofentries = 0;
	}

	public boolean isFull()
	{
		return countofentries == entry.length;
	}

	public boolean isEmpty()
	{
		return countofentries == 0;
	}

	public void addItem(String item)
	{
		if (!isOnList(item))
		{
			if(countofentries == entry.length)
			{
				System.out.println("adding to a full list");
				System.exit(0);
			}
			else
			{
				entry[countofentries] = item;
				countofentries++;
			}
		}
	}

	public String getEntryAt(int position)
	{
		String result = null;
		if ((1 <= position) && (position <= countofentries))
		result = entry[position -1];

		return result;
	}

	public boolean atLastEntry(int position)
	{
		return position == countofentries;
	}

	public boolean isOnList(String item)
	{
		boolean found = false;
		int i =0;
		while(!found && (i <countofentries))
		{
			if(item.equalsIgnoreCase(entry[i]))
			found = true;
			else
			i++;
		}

		return found;
	}

	public int getMaxiumNumberOfEntries()
	{
		return entry.length;
	}

	public int getNumberOfEntries()
	{
		return countofentries;
	}

	public void eraseList()
	{
		countofentries = 0;
	}
}