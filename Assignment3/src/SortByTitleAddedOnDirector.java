import java.util.Comparator;
import java.util.Date;
public class SortByTitleAddedOnDirector implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		if(o1 instanceof Video &&o2 instanceof Video) 
		{
			String s1 = ((Video)o1).getTitle();
			String s2 = ((Video)o2).getTitle();
			int titleComp = s1.compareTo(s2);
			if(titleComp != 0)
				return titleComp;
			
			Date d1 = ((Video)o1).getAddedOn();
			Date d2 = ((Video)o2).getAddedOn();
			int dateComp = d1.compareTo(d2);
			if(dateComp != 0)
				return dateComp;
			
			String direc1 = ((Video)o1).getDirector();
			String direc2 = ((Video)o1).getDirector();
			return direc1.compareTo(direc2);
		}
		return 0;
	}
}
