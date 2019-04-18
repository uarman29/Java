//Arman Uddin
//CSC 221 Section P
import java.util.Date;

public class Video extends MultiMediaItem
{
	private String director;
	
	public Video(String id, String title, Date addedOn,int playingTime, String director)
	{
		super(id,title,addedOn,playingTime);
		this.director = director;
	}
	
	public String getDirector()
	{
		return director;
	}
	
	public void setDirector(String director)
	{
		this.director = director;
	}

	@Override
	public String toString() 
	{
		return "("+super.getId()+", "+super.getTitle()+","+super.getAddedOn()+", "+super.getPlayingTime()+", "+director+")";
	}
}
