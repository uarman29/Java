//Arman Uddin
//CSC 221 Section P
import java.util.Date;

public class Textbook extends Item
{
	private String author;
	
	public Textbook(String id, String title, Date addedOn, String author)
	{
		super(id,title,addedOn);
		this.author = author;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}

	@Override
	public String toString() 
	{
		return "("+super.getId()+", "+super.getTitle()+","+super.getAddedOn()+", "+author+")";
	}
}
