import java.util.Comparator;
import java.util.Date;

public class SortByAddedOn implements Comparator
{
	public int compare(Object o1, Object o2) 
	{
		if(o1 instanceof Date && o2 instanceof Date) 
		{
			Date d1 = (Date)o1;
			Date d2 = (Date)o2;
			return d1.compareTo(d2);
		}
			return 0;
	}
}
