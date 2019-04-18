//Arman Uddin
//CSC 221 Section P
import java.util.Date;

public abstract class MultiMediaItem extends Item
{
	private int playingTime;
	
	public MultiMediaItem(String id, String title, Date addedOn,int playingTime)
	{
		super(id,title,addedOn);
		this.playingTime = playingTime;
	}
	
	public int getPlayingTime()
	{
		return playingTime;
	}
	
	public void setPlayingTime(int playingTime)
	{
		this.playingTime = playingTime;
	}

	@Override
	public String toString() 
	{
		return "("+super.getId()+", "+super.getTitle()+","+super.getAddedOn()+", "+playingTime+")";
	}
}
