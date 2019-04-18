import java.util.Comparator;
public class SortByDirector implements Comparator 
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		if(o1 instanceof String &&o2 instanceof String) 
		{
			String s1 = (String)o1;
			String s2 = (String)o2;
			return s1.compareTo(s2);
		}
		return 0;
	}
}
