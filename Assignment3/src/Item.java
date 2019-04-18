//Arman Uddin
//CSC 221 Section P
import java.util.Date;

public abstract class Item implements Comparable<Item>
{
	private String id;
	private String title;
	private Date addedOn;
	
	public Item(String id, String title, Date addedOn)
	{
		this.id = id;
		this.title = title;
		this.addedOn = addedOn;
	}
	
	@Override
	public int compareTo(Item other)
	{
		String otherId = other.getId();
		return id.compareTo(otherId);
	}
	
	public String getId()
	{
		return id;
	}
	public String getTitle()
	{
		return title;
	}
	public Date getAddedOn()
	{
		return addedOn;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setAddedOn(Date addedOn)
	{
		this.addedOn = addedOn;
	}

	@Override
	public String toString() 
	{
		return "("+id+", "+title+","+addedOn+")";
	}

}
