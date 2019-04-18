//Arman Uddin
//CSC 221 Section P
import java.util.ArrayList;

public class Database 
{
	private ArrayList<Item> items;
	
	public Database()
	{
		items = new ArrayList<Item>();
	}
	
	public Database(ArrayList<Item> items)
	{
		this.items = new ArrayList<Item>();
		(this.items).addAll(items);
	}
	
	public void addItem(Item i)
	{
		items.add(i);
	}
	
	public void list()
	{
		for(Item i:items)
		{
			System.out.println(i);
		}
	}
	
	public void sortById()
	{
		for(int j = 1; j<items.size();j++)
		{
			Item key = (items.get(j));
			int i = j-1;
			
			while(i >= 0 && (items.get(i).getId()).compareTo(key.getId())>0)
			{
				items.set(i+1, items.get(i));
				i--;
			}
			items.set(i+1, key);
		}
	}
	
	public void sortByTitle()
	{
		for(int j = 1; j<items.size();j++)
		{
			Item key = (items.get(j));
			int i = j-1;
			
			while(i >= 0 && (items.get(i).getTitle()).compareTo(key.getTitle())>0)
			{
				items.set(i+1, items.get(i));
				i--;
			}
			items.set(i+1, key);
		}
	}

	public void sortByAddedOn()
	{
		for(int j = 1; j<items.size();j++)
		{
			Item key = (items.get(j));
			int i = j-1;
			
			while(i >= 0 && (items.get(i).getAddedOn()).compareTo(key.getAddedOn())>0)
			{
				items.set(i+1, items.get(i));
				i--;
			}
			items.set(i+1, key);
		}
	}
	
	public void sortByAuthor()
	{
		for(int j = 1; j<items.size();j++)
		{
			Item key = (items.get(j));
			int i = j-1;
			String author= "";
			String author2 = "";
			if(key instanceof Textbook)
				author = ((Textbook)(key)).getAuthor();
			
			if(items.get(i) instanceof Textbook)
				author2 = ((Textbook)(items.get(i))).getAuthor();
					
			while(i >= 0 && (author2.compareTo(author))>0)
			{
				items.set(i+1, items.get(i));
				i--;
				
				author2 = "";
				if(i >= 0 && items.get(i) instanceof Textbook)
					author2 = ((Textbook)(items.get(i))).getAuthor();
			}
			items.set(i+1, key);
		}
	}

	public void sortByDirector()
	{
		for(int j = 1; j<items.size();j++)
		{
			Item key = (items.get(j));
			int i = j-1;
			String director= "";
			String director2 = "";
			if(key instanceof Video)
				director = ((Video)(key)).getDirector();
			
			if(items.get(i) instanceof Video)
				director2 = ((Video)(items.get(i))).getDirector();
					
			while(i >= 0 && (director2.compareTo(director))>0)
			{
				items.set(i+1, items.get(i));
				i--;
				
				director2 = "";
				if(i >= 0 && items.get(i) instanceof Video)
					director2 = ((Video)(items.get(i))).getDirector();
			}
			items.set(i+1, key);
		}
	}
	
	public void sortByArtist()
	{
		for(int j = 1; j<items.size();j++)
		{
			Item key = (items.get(j));
			int i = j-1;
			String artist= "";
			String artist2 = "";
			if(key instanceof CD)
				artist = ((CD)(key)).getArtist();
			
			if(items.get(i) instanceof CD)
				artist2 = ((CD)(items.get(i))).getArtist();
					
			while(i >= 0 && (artist2.compareTo(artist))>0)
			{
				items.set(i+1, items.get(i));
				i--;
				
				artist2 = "";
				if(i >= 0 && items.get(i) instanceof CD)
					artist2 = ((CD)(items.get(i))).getArtist();
			}
			items.set(i+1, key);
		}
	}
	
	public void sortByPlayingTime()
	{
		for(int j = 1; j<items.size();j++)
		{
			Item key = (items.get(j));
			int i = j-1;
			int time1 = -1;
			int time2 = -1;
			if(key instanceof MultiMediaItem)
				time1 = ((MultiMediaItem)(key)).getPlayingTime();
			
			if(items.get(i) instanceof MultiMediaItem)
				time2 = ((MultiMediaItem)(items.get(i))).getPlayingTime();
			
			while(i >= 0 && time2>time1)
			{
				items.set(i+1, items.get(i));
				i--;
				
				time2 = -1;
				if(i >=0 && items.get(i) instanceof MultiMediaItem)
					time2 = ((MultiMediaItem)(items.get(i))).getPlayingTime();
			}
			items.set(i+1, key);
		}
	}

	public void sortByTitleAddedOn()
	{
		for(int j = 1; j<items.size();j++)
		{
			Item key = (items.get(j));
			int i = j-1;
			
			while(i >= 0 && (items.get(i).getTitle()).compareTo(key.getTitle())>0 && 					(items.get(i).getAddedOn()).compareTo(key.getAddedOn())>0)
			{
				items.set(i+1, items.get(i));
				i--;
			}
			items.set(i+1, key);
		}
	}

	public ArrayList<Item> getItems()
	{
		return items;
	}
	
	public void setItems(ArrayList<Item> other)
	{
		items.clear();
		items.addAll(other);
	}
}
