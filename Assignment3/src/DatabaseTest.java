//Arman Uddin
//CSC 221 Section P
import java.util.Date;
import java.util.Calendar;
import java.util.Collections;


public class DatabaseTest 
{
	public static void main(String args[]) {
		  /*ComparatorChain chain = new ComparatorChain();
		  Database library = new Database();
		  Calendar cal = Calendar.getInstance();

		  // adding database entries
		  cal.set(1890, Calendar.AUGUST, 10);
		  Date date = (Date) cal.getTime();
		  library.addItem(new Textbook("TB15", "TextX", date, "John Doe"));
		                
		  cal.set(1954, Calendar.JANUARY, 18);
		  date = (Date) cal.getTime() ;
		  library.addItem(new Video("V09", "VideoB", date, 70000, "J. Smith"));
		                
		  cal.set(2000, Calendar.FEBRUARY, 29);
		  date = (Date) cal.getTime() ;
		  library.addItem(new Textbook("TB01", "TextY", date, "John Doe"));
		              
		  cal.set(2000, Calendar.FEBRUARY, 29);
		  date = (Date) cal.getTime() ;
		  library.addItem(new CD("CD07", "CD1", date, 1000, "B.D."));
		                
		  cal.set(1990, Calendar.APRIL, 30);
		  date = (Date) cal.getTime() ;
		  library.addItem(new CD("CD10", "CD1", date, 800, "X.Y."));
		                
		  cal.set(2000, Calendar.FEBRUARY, 29);
		  date = (Date) cal.getTime();
		  library.addItem(new CD("CD05", "CD1", date, 1000, "B.C."));
		                
		  cal.set(1890, Calendar.JULY, 2);
		  date = (Date) cal.getTime();
		  library.addItem(new Video("V12", "VideoA", date, 7000, "Joe Smith"));
		                
		  // print unsorted database
		  System.out.println("----- DATABASE BEFORE SORTING: -----\n");
		  library.list();
		  // sort and print sorted database (by id)
		  //library.sortById();
		  Collections.sort(library.getItems());
		  System.out.println("----- DATABASE AFTER SORTING BY ID (default): -----\n");
		  library.list();
		  // sort by other fields
		  System.out.println("----- DATABASE AFTER SORTING BY OTHER FIELDS: -----");
		  System.out.println("------------ (title, addedOn, director) -----------\n");
		  chain.addComparator(new SortByTitle());
		  chain.addComparator(new SortByAddedOn());
		  chain.addComparator(new SortByDirector());
		  Collections.sort(library.getItems(), chain);   
		  library.list();
		  
		 /* System.out.println("----- DATABASE AFTER SORTING BY OTHER FIELDS: -----");
		  System.out.println("------------ (title, addedOn, director) -----------\n");
		  library.sortByTitleAddedOn();
		  library.list();*/
		  
		
		
		
		  
		  Database data = new Database();
		  Calendar calendar = Calendar.getInstance();
		  
		  calendar.set(1890, Calendar.AUGUST, 10);
		  Date dated = (Date) calendar.getTime();
		  data.addItem(new Textbook("TB1", "The Textbook", dated, "Jack Daniels"));
		  
		  calendar.set(1990, Calendar.DECEMBER, 25);
		  dated = (Date) calendar.getTime();
		  data.addItem(new CD("CD5", "Christmas Songs", dated,1024, "Saint Nick"));
		  
		  calendar.set(2006, Calendar.MARCH, 6);
		  dated = (Date) calendar.getTime();
		  data.addItem(new Video("VD2", "The Youtube Video", dated,5, "Arthur Brown"));
		  
		  calendar.set(2010, Calendar.JULY, 17);
		  dated = (Date) calendar.getTime();
		  data.addItem(new Textbook("TB2", "The Big Book", dated, "Arthur Brown"));
		  
		  calendar.set(2019, Calendar.JANUARY, 10);
		  dated = (Date) calendar.getTime();
		  data.addItem(new Video("VD6", "The Documentary", dated,123456, "Arthur Brown"));
		  
		  calendar.set(2000, Calendar.MARCH, 6);
		  dated = (Date) calendar.getTime();
		  data.addItem(new CD("CD0", "Never Gonna Give You Up", dated,99, "Rick Astley"));
		  
		  calendar.set(1999, Calendar.SEPTEMBER, 10);
		  dated = (Date) calendar.getTime();
		  data.addItem(new CD("CD0", "Never Gonna Give You Up", dated,99, "Rick Astley"));
		  calendar.set(1999, Calendar.OCTOBER, 21);
		  dated = (Date) calendar.getTime();
		  data.addItem(new CD("CD0", "Never Gonna Give You Up", dated,99, "Rick Astley"));
		  
		  System.out.println("-----------------------------------");
		  System.out.println("NEW DATABASE UNSORTED VALUES:");
		  data.list();
		  
		  System.out.println("-----------------------------------");
		  System.out.println("NEW DATABASE SORTED BY ID VALUES:");
		  data.sortById();
		  data.list();
		  
		  System.out.println("-----------------------------------");
		  System.out.println("NEW DATABASE SORTED BY TITLE VALUES:");
		  data.sortByTitle();
		  data.list();
		  
		  System.out.println("-----------------------------------");
		  System.out.println("NEW DATABASE SORTED BY DATE VALUES:");
		  data.sortByAddedOn();
		  data.list();
		  
		  System.out.println("-----------------------------------");
		  System.out.println("NEW DATABASE SORTED BY PlayingTime VALUES:");
		  data.sortByPlayingTime();
		  data.list();
		  
		  System.out.println("-----------------------------------");
		  System.out.println("NEW DATABASE SORTED BY Title&DATE VALUES:");
		  data.sortByTitle();
		  data.list();
		  
		}
}
